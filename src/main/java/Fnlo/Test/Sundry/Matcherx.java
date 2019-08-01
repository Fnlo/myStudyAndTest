package Fnlo.Test.Sundry;
import java.util.regex.*;
import java.util.regex.Matcher;


public class Matcherx {

	public static void main(String[] args) throws Exception{
		Pattern srcPattern = Pattern.compile("((.*)\\.\\[(\\d+)-(\\d+)\\]\\.(.*))", Pattern.CASE_INSENSITIVE);
        Matcher matcher = srcPattern.matcher("www.baidu.[1-30].com");
        String begin ;
        String end;
        if (matcher.find()) {
        	System.out.println("matcher group1 :" + matcher.group(1));
        	System.out.println("matcher group2 :" + matcher.group(2));
        	System.out.println("matcher group3 :" + matcher.group(3));
        	System.out.println("matcher group4 :" + matcher.group(4));
        	System.out.println("matcher group5 :" + matcher.group(5));
        }
	}
}
