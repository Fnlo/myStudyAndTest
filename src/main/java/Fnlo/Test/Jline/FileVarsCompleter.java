package Fnlo.Test.Jline;

import java.util.List;

import org.jline.reader.Candidate;
import org.jline.reader.Completer;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;
import org.jline.reader.impl.completer.StringsCompleter;


public class FileVarsCompleter implements Completer {

	Completer completer;
	
	public FileVarsCompleter() {
		this.completer = new StringsCompleter();
	}
	
	@Override
	public void complete(LineReader arg0, ParsedLine arg1, List<Candidate> arg2) {
		// TODO Auto-generated method stub
		completer.complete(arg0, arg1, arg2);
	}
	
	public void setFileVars(List<String> fileVars){
		this.completer = new StringsCompleter(fileVars);
	}

}
