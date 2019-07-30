package Fnlo.Test.Jline;

import java.util.ArrayList;
import java.util.List;

import org.jline.reader.Completer;
import org.jline.reader.EndOfFileException;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.completer.AggregateCompleter;
import org.jline.reader.impl.completer.ArgumentCompleter;
import org.jline.reader.impl.completer.FileNameCompleter;
import org.jline.reader.impl.completer.NullCompleter;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class MainJline {

	private static List<String> fileVars = new ArrayList<>();
	private static FileVarsCompleter fileVarsCompleter = new FileVarsCompleter();
	
	public static void main(String[] args) throws Exception {
		/**
		 * Command completion
		 * 
		 * **/
//		Completer commandCompleter = new StringsCompleter("CREATE","OPEN","WRITE","CLOSE");

		//[1]. build 
		Terminal terminal = TerminalBuilder.builder()
				.system(true)
				.build();
		Completer createCompleter = new ArgumentCompleter(
				new StringsCompleter("CREATE"),
				new FileNameCompleter(),
				NullCompleter.INSTANCE
				);
		
		Completer openCompleter = new ArgumentCompleter(
				new StringsCompleter("OPEN"),
				new FileNameCompleter(),
				NullCompleter.INSTANCE
				);
		
		Completer writeCompleter = new ArgumentCompleter(
				new StringsCompleter("WRITE"),
				new StringsCompleter("TIME","DATE","LOCATION"),
				new StringsCompleter("TO"),
				fileVarsCompleter,
				NullCompleter.INSTANCE
				);
		
		Completer fogCompleter = new AggregateCompleter(
				createCompleter,
				openCompleter,
				writeCompleter
				);
		
		LineReader lineReader = LineReaderBuilder.builder()
				.terminal(terminal)
				.completer(fogCompleter)
				.build();
		String prompt = "fnlo> ";
		while(true){
			String line;
			try {
				line = lineReader.readLine(prompt);
				System.out.println(line);
				if(line.startsWith("OPEN")){
					fileVars.add(line.split(" ")[3]);
					fileVarsCompleter.setFileVars(fileVars);
				}
			} catch (UserInterruptException e) {
				// TODO: handle exception
			} catch (EndOfFileException e) {
				// TODO: handle exception
				System.out.println("\n Bye.");
				return;
			}
		}
		
		
	}

}
