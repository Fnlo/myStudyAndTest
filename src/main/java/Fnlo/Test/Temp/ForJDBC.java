package Fnlo.Test.Temp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class ForJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> funcList = new ArrayList<String>();
		funcList.add("func1");
		funcList.add("func2");
		
		String sql1 = "insert into flstest(id,name) values (1,'2')";
		System.out.println(isWriteORReadSQL(sql1, funcList));
		String sql2 = "delete from flstest where id = 1;";
		System.out.println(isWriteORReadSQL(sql2, funcList));
		String sql3 = "update flstest set id = 2 where id = 1";
		System.out.println(isWriteORReadSQL(sql3, funcList));
		String sql4 = "select id from flstest where id = 2 for update";
		System.out.println(isWriteORReadSQL(sql4, funcList));
		
//		String sql5 = "select func1(11,22) from dual;";
//		System.out.println(isWriteORReadSQL(sql5, funcList));
//		
//		String sql6 = "select func1(11,22), func2(11,22), func4(11,22) from dual;";
//		System.out.println(isWriteORReadSQL(sql6, funcList));
//		
//		String sql7 = "select func\n"
//				+ "2(11,22) from dual;";
//		System.out.println(isWriteORReadSQL(sql7, funcList));
//		
//		String sql8 = "select func\n"
//				+ "2(11,22) func\n"
//				+ "3(11,22) from dual;";
//		System.out.println(isWriteORReadSQL(sql8, funcList));
		
		String sql9 = "select func\n"
				+ "3(select func1(xxx) from dual) func\n"
				+ "3(11,22) from dual;";
		System.out.println(isWriteORReadSQL(sql9, funcList));
		
		String sql10 = "select id into flstest where a.id = 1  from test a;";
		System.out.println(isWriteORReadSQL(sql10, funcList));
		
	}
	
	
	/**
	 * @param sql
	 * @param funcList
	 * @return true => write sql,<br> false => read sql
	 */
	public static boolean isWriteORReadSQL(String sql, List<String> funcList){
		sql = sql.trim().replaceAll("\n|\r", "");
		Pattern pattern = Pattern.compile("((insert|delete|update).*|(select.*for\\s+update)|(select.*into.*));?", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(sql);
		if(matcher.find()){
			return true;
		}

		ANTLRInputStream input = new ANTLRInputStream(sql);
		PostgreSQLLexer lexer = new PostgreSQLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PostgreSQLParser parser = new PostgreSQLParser(tokens);
		ParseTree tree = parser.stmt();	//开始语法分析的过程
		System.out.println(tree.toStringTree());
		ParseTreeWalker walker = new ParseTreeWalker();	//新建一个标准的遍历器
		PostgreSQLListener sqlListener = new PostgreSQLListener();	
		long start = System.nanoTime();
		walker.walk(sqlListener, tree);//使用监听器初始化对语法分析树的遍历
		long end = System.nanoTime();
		//System.out.println(tree.toStringTree(parser));
		List<String> funcNames = sqlListener.getFuncNames();
		if(funcNames == null || funcNames.isEmpty()){
			return false;
		}
		for(String sqlInfo: funcNames){
			for(String func : funcList){
				if(sqlInfo.equalsIgnoreCase(func)){
					return true;
				}
			}
		}
		
		Pattern pattern2 = Pattern.compile("\\s([\\w]+)\\(([^)]*)\\)", Pattern.CASE_INSENSITIVE);
		Matcher matcher2 = pattern2.matcher(sql);
		while (matcher2.find()) {
			String msg;
			if((msg = matcher2.group(1)) == null){
				return false;
			}
			for(String func : funcList){
				if(msg.equalsIgnoreCase(func)){
					return true;
				}
			}
		}
		
		return false;
	}

	/**
	 * @param sql
	 * @param funcList
	 * @return
	 */
	public static boolean isWriteORReadSQL2(String sql, List<String> funcList){
		sql = sql.trim().replaceAll("\n|\r", "");
		Pattern pattern = Pattern.compile("((insert|delete|update).*|(select.*for\\s+update)|(select.*into.*));?", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(sql);
		if(matcher.find()){
			return true;
		}

		Pattern pattern2 = Pattern.compile("\\s([\\w]+)\\(", Pattern.CASE_INSENSITIVE);
		Matcher matcher2 = pattern2.matcher(sql);
		while (matcher2.find()) {
			String msg;
			if((msg = matcher2.group(1)) == null){
				return false;
			}
			for(String func : funcList){
				if(msg.equalsIgnoreCase(func)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	
}
