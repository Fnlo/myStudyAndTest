package Regex;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {

	public static void main(String[] args) throws Exception{
		/*insert into flstest(a,x) values( 1,2)
		insert into flstest values(1, 2);
		insert into flstest(a, b) values ('a','b')
		insert into flstest (a, b) values ('a','b')
		insert into x.flstest (a, b) values ('a','b')
		
		
		insert\s+into\s+(([\w]+\.?)*)(\s*\(.*\))?\s+values
		
		update a set a = 1 where xa = a 
		update x.a set a = a where xa = a
		
		update\s+(([\w]+\.?)*)\s+set
		
		delete from flstest
		delete from x.flstest
		delete * from flstest
		delete * from flstest where id = 1
		
		delete\s+(\*\s+)?from\s+(([\w]+\.?)*)*/
		String text = "insert into ACT_RU_TASK (ID_, REV_, NAME_, PARENT_TASK_ID_, DESCRIPTION_, PRIORITY_, CREATE_TIME_, OWNER_,\n" 
                     + "\tASSIGNEE_, DELEGATION_, EXECUTION_ID_, PROC_INST_ID_, PROC_DEF_ID_, TASK_DEF_KEY_, DUE_DATE_, SUSPENSION_STATE_)\n" 
    + "\tvalues ($1,\n"
            + "1,\n"
            + "$2,\n"
            + "$3,\n"
            + "$4,\n"
            + "$5,\n"
            + "$6,\n"
            + "$7,\n"
            + "$8,\n"
            + "$9,\n"
            + "$10,\n"
            + "$11,\n"
            + "$12,\n"
            + "$13,\n"
            + "$14,\n"
            + "$15\n"
           + ")";
		
		String text2 = "insert into ACT_RU_TASK (ID_, REV_, NAME_, PARENT_TASK_ID_, DESCRIPTION_, PRIORITY_, CREATE_TIME_, OWNER_,\r\n"
+"                      ASSIGNEE_, DELEGATION_, EXECUTION_ID_, PROC_INST_ID_, PROC_DEF_ID_, TASK_DEF_KEY_,\r\n"
+" DUE_DATE_, SUSPENSION_STATE_)\r\n"
+"    values ($1,\r\n"
+"            1,\r\n"
+"            $2,\r\n"
+"            $3,\r\n"
+"            $4,\r\n"
+"            $5,\r\n"
+"            $6,\r\n"
+"            $7,\r\n"
+"            $8,\r\n"
+"            $9,\r\n"
+"            $10,\r\n"
+"            $11,\r\n"
+"            $12,\r\n"
+"            $13,\r\n"
+"            $14,\r\n"
+"            $15\r\n"
+"           )";
		
		String text3 = "delete from ACT_RU_VARIABLE\n where ID_ = $1 and REV_ = $2";
//		test(text3);
		test2(text3);
	}
	
	public static void test2(String sql){
		String[] strs = sql.split(" ");
		for(String str : strs){
			if("ACT_RU_VARIABLE".equalsIgnoreCase(str)){
				System.out.println("xxx");
				
			}
		}
		System.out.println();
	}
	
	public static Set<String> test(String sql){
		Set<String> tableNames = new HashSet<>();
		sql = sql.replaceAll("(\r\n|\n)", "");
				
		Pattern pattern = Pattern.compile("(insert\\s+into\\s+(([\\w]+\\.?)*)(\\s*\\(.*\\))?\\s*values)"
				+ "|(update\\s+(([\\w]+\\.?)*)\\s+set)"
				+ "|(delete\\s+(\\*\\s+)?from\\s+(([\\w]+\\.?)*))", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(sql);
		if(matcher.find()){
			String insertTable;
			String updateTable;
			String deleteTable;
			if((insertTable = matcher.group(2)) != null && !"null".equalsIgnoreCase(insertTable)){
				tableNames.add(insertTable);
			}else if ((updateTable = matcher.group(7)) != null && !"null".equalsIgnoreCase(updateTable)){
				tableNames.add(updateTable);
			}else if((deleteTable = matcher.group(11)) != null && !"null".equalsIgnoreCase(deleteTable)){
				tableNames.add(deleteTable);
			}
		}
		return tableNames;
	}
}
