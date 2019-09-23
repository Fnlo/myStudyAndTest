package Regex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.print.attribute.standard.MediaSize.Other;

public class FileOutPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outPutSql("xxx \r\n"
				+ "  "
				+ "  \t\r\nafd");
		outPutSql("fadf\n"
				+ ""
				+ "  asdf");
	}
	
	public static void outPutSql(String sql){
		try {
			File jdbcLog = new File("/jdbcLog.log");
			if(!jdbcLog.exists()){
				jdbcLog.createNewFile();
			}
			
			FileWriter fw = new FileWriter(jdbcLog.getName(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(sql);
			bw.newLine();
			bw.write("==========================================");
			bw.newLine();
			bw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	
	

}
