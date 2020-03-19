package Fnlo.Test.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.highgo.jdbc.ds.PGSimpleDataSource;

public class Test {

	public static int index = 0;
	public static int count = 0;
	
	public static void main(String[] args) throws Exception{
//		testDataSource();
//		
//		Connection conn = getConnecSQLWhiteList();
//		Connection conn = getConnectionBase();
//		Connection conn = getConnectionWhiteList();
//		Connection conn = getConnection121();
//		Connection conn = getConnection121WithXml();
//		Connection conn = getConnectionSingle();
		Connection conn = getConnectionLocation();
//		Connection conn = getConnectionSM3();
		
//		testDruidParseSQL();
//		testCompareRegexAndDruid(conn);
//		testView(conn);
//		testLoadBalance();
//		testSM3(conn);
		test(conn);
		
//		Class.forName("com.highgo.jdbc.Driver");
//        String url = "jdbc:highgo://192.168.90.103:5132/postgres?loadBalanceHosts=true&wholeTransactionForward=false&whiteList=D://1.txt";//&loggerLevel=DEBUG
//        Connection conn = DriverManager.getConnection(url, "postgres", "highgo123");
//        conn.setAutoCommit(false);
//		execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
//		execttssaf(conn);
//////		execDelete(conn);
//        testSqlWhiteList(conn);
//        int i = 0;
//        while(i < 1){
//        	testUpdate(conn);
//        	i++;
//        }
//        testUpdate(conn);
//        testBatch(conn);
//        testTwoResult(conn);
//        testPK(conn);
//        
//		testBase(conn);
		
//		testNull(conn);
//		testTrac(conn);
//        conn.commit();
//
//        testFK(conn);
//       testPPPKKK();
//		testRegex(conn);
//		testImage1(conn);
//		testCommitSlow(conn);
//		testSlow0906(conn);
	}

	public static Connection getConnectionWhiteList() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
        String url = "jdbc:highgo://192.168.90.103:5132/postgres?loadBalanceHosts=true&wholeTransactionForward=false&whiteList=D://1.txt";//&loggerLevel=DEBUG
        Connection conn = DriverManager.getConnection(url, "postgres", "highgo123");
         return conn;
	}
	
	public static Connection getConnecSQLWhiteList() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
        String url = "jdbc:highgo://192.168.90.103:5132/postgres?loadBalanceHosts=true&wholeTransactionForward=false&whiteList=D://1.txt&whiteListSql=D://2.txt";//&loggerLevel=DEBUG
        Connection conn = DriverManager.getConnection(url, "postgres", "highgo123");
         return conn;
	}
	
	public static Connection getConnectionBase() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
        String url = "jdbc:highgo://192.168.90.103:5132/postgres?loadBalanceHosts=true&wholeTransactionForward=false";//&loggerLevel=DEBUG
        Connection conn = DriverManager.getConnection(url, "postgres", "highgo123");
        return conn;
	}
	
	public static Connection getConnection121() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
		String url = "jdbc:highgo://192.168.100.121:5433/postgres?loadBalanceHosts=true&wholeTransactionForward=false&dmlForward=true";
		Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
		return conn;
	}
	
	public static Connection getConnectionSM3() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
		String url = "jdbc:highgo://192.168.102.22:5866/highgo?loggerLevel=TRACE";//&sslmode=verify-ca
		Connection conn = DriverManager.getConnection(url, "sysdba", "a");
//		String url = "jdbc:highgo://192.168.100.145:5866/highgo?loggerLevel=TRACE";
//		Connection conn = DriverManager.getConnection(url, "sysdba", "highgo@123");
		return conn;
	}
	
	public static Connection getConnection121WithXml() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
		String url = "jdbc:highgo://192.168.100.121:5433/postgres?loadBalanceHosts=true&dmlForward=true&jdbcXml=/jdbc_test.xml&balancer=random";
		Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
		return conn;
	}
	
	public static Connection getConnectionSingle() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
		String url = "jdbc:highgo://localhost:6666/postgres?loadBalanceHosts=true&wholeTransactionForward=false&jdbcLog=false";
		Connection conn = DriverManager.getConnection(url, "postgres", "highgo123");
		return conn;
	}
	
	public static Connection getConnectionLocation() throws Exception{
		Class.forName("com.highgo.jdbc.Driver");
		String url = "jdbc:highgo://localhost:5866/test";
		Connection conn = DriverManager.getConnection(url, "test", "test");
		return conn;
	}
	
	public static void testLoadBalance() throws Exception {
		Connection conn1 = getConnection121WithXml();
		testForLoadBalance(conn1);
		Connection conn2 = getConnection121WithXml();
		testForLoadBalance(conn2);
		Connection conn3 = getConnection121WithXml();
		testForLoadBalance(conn3);
		Connection conn4 = getConnection121WithXml();
		testForLoadBalance(conn4);
		conn1.close();
		conn2.close();
		conn3.close();
		conn4.close();
		Connection conn5 = getConnection121WithXml();
		testForLoadBalance(conn5);
		Connection conn6 = getConnection121WithXml();
		testForLoadBalance(conn6);
		Connection conn7 = getConnection121WithXml();
		testForLoadBalance(conn7);
		Connection conn8 = getConnection121WithXml();
		testForLoadBalance(conn8);
		Connection conn9 = getConnection121WithXml();
		testForLoadBalance(conn9);
		Connection conn10 = getConnection121WithXml();
		testForLoadBalance(conn10);

//		conn1.close();
//		conn2.close();
//		conn3.close();
//		conn4.close();
		conn5.close();
		conn6.close();
		conn7.close();
		conn8.close();
		conn9.close();
		conn10.close();
	}
	
	public static void testSlow0906(Connection conn){
		try {
			conn.setAutoCommit(false);
			
			PreparedStatement ps = conn.prepareStatement("insert into hqoa_t_meetmanagent"
			+"(meetAppId,meetTypeId,meetId,meetName,meetAppName,deptName,"
			+"meetCount,meetDate,meetStartTime,meetEndTime,meetStatus,"
				+"commCreator,commCreateTime,phone,meetOthers,meetContent,"
				+"countMinTime,meetDevice,meetRoomType,manageNames,meetTitle,"
				+"meetTopicID,departMentName,departMentId,bookUserId,dayPeriod,expenseStatus)"
    	+"values "
    	    +"($1,$2,$3,$4,$5,$6,"
    	   +"$7::int,$8,$9,$10,$11,"
    	   +"$12,$13,$14,$15,$16,"
    	   +"$17::int,$18,$19,$20,$21,"
    	   +"$22,$23,$24,$25,$26,0)");
			ps.executeUpdate();
			ps = conn.prepareStatement("insert into hqoa_t_meetmanview(MEETID,MEETDATE,MEETSTARTTIME,MEETENDTIME,COUNTMINTIME,MEETSTATUS,MEETSEQ,MEETAPPID,commCreateTime,commCreator,bookUserId)   "	 
					+"	    select  A.* FROM("
+"	          "
+"	         select"
+"		         $1, "
+"		         $2, "
+"		         $3,"
+"		         $4, "
+"		         $5, "
+"		         $6,"
+"		         $7,"
+"		         $8,"
+"		         $9,"
+"		         $10,  "
+"		         $11  "
+"	         from dual   "
+"	     union all     "
+"	         select"
+"		         $12, "
+"		         $13, "
+"		         $14,"
+"		         $15, "
+"		         $16, "
+"		         $17,"
+"		         $18,"
+"		         $19,"
+"		         $20,"
+"		         $21,  "
+"		         $22  "
+"	         from dual   "
+"	     union all     "
+"	         select"
+"		         $23, "
+"		         $24, "
+"		         $25,"
+"		         $26, "
+"		         $27, "
+"		         $28,"
+"		         $29,"
+"		         $30,"
+"		         $31,"
+"		         $32,  "
+"		         $33  "
+"	         from dual   "
+"	      "
+"	    ) A");
			
			
			conn.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testSM3(Connection conn){
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
//			conn.setAutoCommit(false);
//			ps = conn.prepareStatement("select 1");
//			ps.execute();
			String sql = ""
					+ ""
					+ "select * from table_flstest;select 123 from dual;";
//			String sql = "drop table table_flstest";
			ps = conn.prepareStatement(sql);
			ps.execute();
			rs = ps.getResultSet();
			while(rs.next()) {
				int count = rs.getMetaData().getColumnCount();
				for(int i = 0; i < count;i++ ) {
					System.out.print(rs.getObject(i + 1).toString() + "|");
				}
				System.out.println();
			}
				while(ps.getMoreResults()) {
					try {
						rs = ps.getResultSet();
						while(rs.next()) {
							int count = rs.getMetaData().getColumnCount();
							for(int i = 0; i < count;i++ ) {
								System.out.print(rs.getObject(i).toString() + "|");
							}
							System.out.println();
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
			
			
			
//			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	
	public static void testCommitSlow(Connection conn){
		try {
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement("insert into table1 values(99, 'flstest')");
			ps.executeUpdate();
			ps = conn.prepareStatement("select * from table1 where c1 = 99999");
			ps.executeQuery();
			conn.commit();
			ps = conn.prepareStatement("select * from table1 where c1 = 99");
			ps.executeQuery();
			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	static Statement statement = null;
	public static void testImage1(Connection conn){
		try {
			statement = conn.createStatement();
			Thread thread1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
//						PreparedStatement ps = conn.prepareStatement("insert into table1 values (99,'flstest');");
//						ps.executeUpdate();
//						ps = conn.prepareStatement("select c1 from table1;");
//						ps.executeQuery();
						
						statement.executeUpdate("insert into table1 values (99,'flstest');");
						Thread.sleep(2000);
						statement.executeQuery("select c1 from table1;");
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
			Thread thread2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						
//						Thread.sleep(1000);
//						PreparedStatement ps = conn.prepareStatement("select * from t1;");
//						ps.executeQuery();
						Thread.sleep(1000);
//						statement = conn.createStatement();
						statement.execute("select * from t1;");
						
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
			});
			
			
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testDataSource() {
		try {
			PGSimpleDataSource ds = new PGSimpleDataSource();
			ds.setUrl("jdbc:highgo://192.168.90.100:9999/database");
			ds.setServerName("localhost");
			Connection conn = ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testTrac(Connection conn){
		try {
			conn.setAutoCommit(true);
			Statement stat = conn.createStatement();
			stat.execute("begin;"
					+ " update table1 set c1 = 1 where c2 = 'test1';"
					+ "	update table1 set c1 = 2 where c2 = 'aaa';	"
					+ "");
			stat.execute("select c1 from table1 where c1 = 2;");
			stat.execute("commit;");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testView(Connection conn){
		try {
			conn.setAutoCommit(false);
			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
			execSelectPrepared(conn, "select * from dmltest_view1");
			conn.commit();
			
			execSelectPrepared(conn, "select id from dmltest_view1"); // 1
			conn.commit();
			
			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
			conn.commit();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testForLoadBalance(Connection conn){
		try {
			conn.setAutoCommit(false);
//			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
//			execSelectPrepared(conn, "select * from dmltest_view1");
//			conn.commit();
			
			execSelectPrepared(conn, "select id from dmltest_view1"); // 1
//			execSelectPrepared(conn, "select id from dmltest_view1"); // 2
//			execSelectPrepared(conn, "select id from dmltest_view1"); // 3
//			execSelectPrepared(conn, "select id from dmltest_view1"); // ...
//			execSelectPrepared(conn, "select id from dmltest_view1");
//			execSelectPrepared(conn, "select id from dmltest_view1");
//			execSelectPrepared(conn, "select id from dmltest_view1");
//			execSelectPrepared(conn, "select id from dmltest_view1"); // 8
			conn.commit();
			
//			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
//			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
//			conn.commit();
//			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testRegex(Connection conn) throws Exception{
		/*insert into flstest(a,x) values( 1,2)
		insert into flstest values(1, 2);
		insert into flstest(a, b) values ('a','b')
		insert into flstest (a, b) values ('a','b')
		insert into x.flstest (a, b) values ('a','b')
		
		
		insert\s+into\s+(([\w]+\.?)*)(\s*\(.*\))?\s+values
		
		update a set a = 1 where xa = a 
		update x.a set a = a where xa = a
		update x as a set a.id = 1
		
		update\s+(([\w]+\.?)*)\s+set
		
		delete from flstest
		delete from x.flstest
		delete * from flstest
		delete * from flstest where id = 1
		insert into hqoa_t_meetmanview(MEETID,MEETDATE,MEETSTARTTIME,MEETENDTIME,COUNTMINTIME,MEETSTATUS,MEETSEQ,MEETAPPID,commCreateTime,commCreator,bookUserId)   	    select  A.* FROM(	          	         select		         $1, 		         $2, 		         $3,		         $4, 		         $5, 		         $6,		         $7,		         $8,		         $9,		         $10,  		         $11  	         from dual   	     union all     	         select		         $12, 		         $13, 		         $14,		         $15, 		         $16, 		         $17,		         $18,		         $19,		         $20,		         $21,  		         $22  	         from dual   	     union all     	         select		         $23, 		         $24, 		         $25,		         $26, 		         $27, 		         $28,		         $29,		         $30,		         $31,		         $32,  		         $33  	         from dual   	      	    ) A
		
		delete\s+(\*\s+)?from\s+(([\w]+\.?)*)*/
		String text = "delete * from flstest where id = 1";
		PreparedStatement ps = conn.prepareStatement(text);
		ps.execute();
	}
	
	public static void testPPPKKK(){
		 String value = "8";
	        Thread thread1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						// TODO Auto-generated method stub
						Connection conn = getConnectionBase();
						conn.setAutoCommit(false);
						testPK(conn, value);
						conn.commit();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				}
			});

	        thread1.start();
	        try {
				thread1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        Thread thread2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						Connection conn = getConnectionBase();
						conn.setAutoCommit(false);
						testFK(conn, value);
						conn.commit();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				}
			});
	        thread2.start();
	}
	
	public static void testUpdate(Connection conn){
		execSelect(conn, "select public.Secu_f_GLOBAL_SetPARM('FEBAAEC61305593016C8CE7C61FD5116','2300','2015','23002015') from test_jdbc");
		execUpdtaePrepareNow(conn, "update ACT_GE_PROPERTY\n"
	    + "SET REV_ = ?,\n"
	     + " VALUE_ = ? \n"
	     +"where NAME_ = ?\n"
	    + "and REV_ = ?", "1", "1", "1", "1");
	}
	
	public static void testBatch(Connection conn){
		execBatch(conn);
	}
	
	public static void testTwoResult(Connection conn){
		try {
			ResultSet rs = execSelectPrepared(conn, "select c1 from test_jdbc where c1 = ?", "1");
			String key  = "1";
			while (rs.next()) {
				key = rs.getString("c1");
			}
			execSelect(conn, "begin");
			execUpdtaePrepareNow(conn, "update test_write2 set c1 = ? where c1 = ?", key, key);
			ResultSet end = execSelectPrepared(conn, "select c1 from test_write2 where c1 = ?", key);
			while(end.next()){
				System.out.println("value:" + end.getString("c1"));
			}
			execSelect(conn, "commit");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static void testThread(Connection conn){
		Thread thread1 = new threadText("1");
		Thread thread2 = new threadText("2");
		thread1.start();
		thread2.start();
		Thread thread3 = new threadText("2");
		thread3.start();
		Thread thread4 = new threadText("2");
		thread4.start();
		Thread thread5 = new threadText("2");
		thread5.start();
		Thread thread6 = new threadText("2");
		thread6.start();
	}
	
	public static void testSqlWhiteList(Connection conn){

//		execSelectPrepared(conn, "select * from act_hq_tem_def where category=? and deploy_state=1 and version_state=?", "1","1");
		ResultSet rs = execSelectPrepared(conn, "select \n"
				+ "* from act_hq_tem_def where category=? and deploy_state=1 and version_state=?", "1","1");
		try {
			while (rs.next()) {
				System.out.println(rs.getString(1)+ "|" + rs.getInt(2) + "|" + rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        execUpdtaePrepareNow(conn, "UPDATE HQOA_T_DocTempUser SET STATUS='2' where docTempId = ? ", "1");
//        execUpdtaePrepareNow(conn, "update ACT_GE_PROPERTY      SET REV_ = ?,       VALUE_ = ?      where NAME_ = ?       and REV_ = ?","1","1","1","1");
	}
	
	public static void testPK(Connection conn, String value){
		try {

			execInsertPrepared(conn, "insert into flstest_pk values (?,?)",value ,value);
			
			ResultSet rs = execSelectPrepared(conn, "select id,name from flstest_pk");
			while(rs.next()){
				System.out.println(rs.getString("id") + "|" + rs.getString("name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testFK(Connection conn, String value){
		try {
			execInsertPrepared(conn, "insert into flstest_fk values(?,?,?)", value, value, value);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void testNull(Connection conn) throws Exception{
		conn.setAutoCommit(false);
		execDelete(conn);
//		 execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
	      ResultSet  rs = execSelect(conn, "select c1,c2 from test_jdbc");
	        while(rs.next()) {
	        	System.out.println("ID:" + rs.getString(1) + " name:" + rs.getString("c2"));
	        }
	        conn.commit();
	}
	
	public static void testBase(Connection conn) throws Exception{
		// TODO Auto-generated method stub
//		Class.forName("com.highgo.jdbc.Driver");
//        String url = "jdbc:highgo://192.168.90.101:5432/postgres?loadBalanceHosts=true&loggerLevel=DEBUG&wholeTransactionForward=false";
//        Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
		
		
         conn.setAutoCommit(false);
         execDelete(conn);
         conn.commit();
         
//         execSelect(conn, "select x from flstest");
//         execSelect(conn, "select GLOBAL.test_insert ()");
         
         execSelect(conn, "select c1 from test_jdbc");
         execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
//         PreparedStatement ps = conn.prepareStatement("insert into test_jdbc(c1,c2) values (?,?)");
//         count++;
//         ps.setString(1, "setstring");
//         ps.setString(2, "setstring");
//         ps.executeUpdate();
//         ps = conn.prepareStatement("select c1,c2 into test_write7 from test_jdbc ");
//         ps.executeUpdate();
//         
         execSelectPrepared(conn, "select * from test_jdbc");
         conn.commit();
//         execSelectWhiteList(conn, "select test_insert()");
         
         
         execInsert(conn, "insert into test_write3(c1,c2) values ('update','4')");
         
         execUpdate(conn);
//         Thread.sleep(10000 );
//         conn.commit();
         ResultSet rs =  execSelect(conn, "select c1 from test_write3 where c1 = 'update'");
         Pojo pojo = null;
         while(rs.next()) {
         	System.out.println("c1:" + rs.getString(1) );
         	pojo = new Pojo(rs.getString(1));
         }
         System.out.println(pojo.getNum());
         System.out.println("============================1======");
//         checkTime(conn, 2);
         execDelete(conn);
         
         
         execInsert(conn, "insert into test_jdbc(c1,c2) values ('5','5')");
        rs = execSelect(conn, "select c1,c2 from test_jdbc");
        while(rs.next()) {
        	System.out.println("ID:" + rs.getString(1) + " name:" + rs.getString("c2"));
        }
        System.out.println("============================1======");
//        PreparedStatement ps = conn.prepareStatement("insert into test_jdbc(c1,c2) values (?,?)");
//        ps.setString(1, "x");
//        ps.setString(2, "x");
//	     ps.executeUpdate();
	     
        execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')"); 
        execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')"); 
        execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')"); 
        
        execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        
        execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        
        execSelect(conn, "select c1,c2 from test_jdbc");
        
        execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        
        execSelect(conn, "select c1,c2 from test_jdbc");
        
        execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')"); 
        execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')"); 
        execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')"); 

        execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
        execSelect(conn, "select c1,c2 from test_jdbc");
        
////        execCheckpoint(conn, checkpoint);
       System.out.println("===============================2===");
      
       execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
       execInsertPrepared(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
//       execCheckpoint(conn, checkpoint);
      
      System.out.println("================================3==");
//      checkTime(conn, count);
      
       System.out.println("===============================4===");
     
     execInsert(conn, "insert into test_jdbc(c1,c2) values ('4','4')");
//     execCheckpoint(conn, checkpoint);

     System.out.println("=============================5=====");
//     checkTime(conn, count);
       conn.commit();
       System.out.println("==================6================");
//       checkTime(conn, count);
       
//       PreparedStatement ps = conn.prepareStatement("insert into test_jdbc(c1,c2) values (? , ?)");
//       
//       for(int i = 0 ; i < 100; i++){
//    	   ps.setString(1, "batch");
//    	   ps.setString(2, "batch");
//    	   ps.addBatch();
//       }
//       ps.executeBatch();
       
       
       execDelete(conn);
	}
	
	
	public static ResultSet execSelectPrepared(Connection conn, String sql) throws Exception{
		PreparedStatement ps = conn.prepareStatement(sql);
        return  ps.executeQuery();
//		Statement ps = conn.createStatement();
//		return ps.executeQuery(sql);
	}
	
	
	
	
	public static int execInsertPrepared(Connection conn, String sql) throws Exception{
		count++;
		PreparedStatement ps = conn.prepareStatement(sql);
		
	    return ps.executeUpdate();
//		Statement ps = conn.createStatement();
//		
//			return ps.executeUpdate(sql);
	}
	
	public static int execInsertPrepared(Connection conn, String sql, String... values) throws Exception{
		count++;
		PreparedStatement ps = conn.prepareStatement(sql);
		for(int i = 1; i < values.length + 1; i++){
			ps.setString(i, values[i - 1]);
		}
	    return ps.executeUpdate();
//		Statement ps = conn.createStatement();
//		
//			return ps.executeUpdate(sql);
	}
	
	
	public static boolean execCheckpoint(Connection conn) throws Exception{
		PreparedStatement ps = conn.prepareStatement("CHECKPOINT");
	    return ps.execute();
	}
	
	
	public static ResultSet execSelectWhiteList(Connection conn, String sql) throws Exception{
		Statement ps = conn.createStatement();
		count++;
		return ps.executeQuery(sql);
	}
	
	public static int execInsert(Connection conn, String sql) throws Exception{
		count++;
		Statement ps = conn.createStatement();
		
			return ps.executeUpdate(sql);
	}
	
	public static int execDelete(Connection conn) throws Exception{
		Statement ps = conn.createStatement();
		int i = ps.executeUpdate("delete from test_jdbc where c1 = '5'");
		System.out.println("总共删除" + i + "条数据");

        count = 0;
			return i;
	}
	
	public static int execUpdate(Connection conn) throws Exception{
		Statement ps = conn.createStatement();
		int i = ps.executeUpdate("update test_write2 set c1 = 'update' where c1='4'");
		System.out.println(Thread.currentThread().getName() + "总共修改" + i + "条数据");
			return i;
	}
	
	public static int execUpdatePrepare(Connection conn, String value) throws Exception{
		PreparedStatement ps = conn.prepareStatement("update test_jdbc set c1 = 'update' where c1= ?");
		ps.setString(1, value);
		int i = ps.executeUpdate();
		System.out.println(Thread.currentThread().getName() + "总共修改" + i + "条数据");
			return i;
	}
	
	public static int execUpdtaePrepareNow(Connection conn, String sql, Object... objs) {
		int res = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i = 1; i < objs.length + 1 ;  i++ ){
				ps.setObject(i, objs[i - 1]);
			}
			 res =ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return  res;
	}
	
	public static void execBatch(Connection conn){
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("insert into test_jdbc(c1,c2) values (? , ?)");
			  for(int i = 0 ; i < 5; i++){
				   ps.setString(1, "batch");
				   ps.setString(2, "batch");
				   ps.addBatch();
				  }
				  ps.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//      
	}
	
	
	public static void checkTime(Connection conn, int count) throws Exception{
		index++;
		long timebegin = System.currentTimeMillis();
	      long timeend = timebegin;
	      int temp = 0;
	      ResultSet rs;
	      while(true){
	          rs = execSelect(conn, "select count(1) from test_jdbc");
	           while(rs.next()) {
	        	   temp = rs.getInt(1);
	           }
//	           Thread.sleep(1);
	           if(temp == count){
	        	   break;
	           }
	      }

	     	timeend = System.currentTimeMillis();
	     	System.out.println(index + "耗时" + (timeend - timebegin) + "ms");
	}
	
	public static class threadText extends Thread{
		
		private String value;
		public threadText(String value) {
			// TODO Auto-generated constructor stub
			this.value = value;
		}
		
		@Override
		public void run(){
			// TODO Auto-generated method stub
			try {
				Class.forName("com.highgo.jdbc.Driver");
				String url = "jdbc:highgo://192.168.90.103:5132/postgres?loadBalanceHosts=true&wholeTransactionForward=false&whiteList=D://1.txt";//&loggerLevel=DEBUG
		        Connection conn = DriverManager.getConnection(url, "postgres", "highgo123");
		         conn.setAutoCommit(false);
		         System.out.println(Thread.currentThread().getName() + " ====" );
		         execUpdatePrepare(conn, value);
		         
		         ResultSet rs =  execSelectPrepared(conn, "select c1 from test_jdbc where c1 = 'update'");
		         if(!rs.next()){
		        	 System.out.println("error xxxxxxxxx");
		         }
		         System.out.println("c1:" + rs.getString(1) );
//		         while(rs.next()) {
//		         	
//		         }
		         conn.commit();
		         System.out.println(Thread.currentThread().getName() + " end.");
		         
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		}
	}
	
	public static ResultSet execSelectPrepared(Connection conn, String sql, String... values){
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i = 1;  i < values.length  + 1; i++){
				ps.setString(i, values[i - 1]);
			}
	        return  ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static ResultSet execSelect(Connection conn, String sql){
		try {
			Statement ps = conn.createStatement();
			return ps.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static class Pojo {
		private String num;

		public Pojo(String num) {
			this.num = num;
		}

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}
		
	}
	
	public static void execttssaf(Connection conn) throws Exception{
		 
	
		execSelectPrepared(conn, "select c1 from test_jdbc where c1 = ?", "1");
		System.out.println("end select");
		execUpdatePrepare(conn, "update");
		System.out.println("end update");
		execSelectPrepared(conn, "select c1 from test_jdbc where c1 = ?", "1");
		System.out.println("end select");
		
	}
	
//	public static void testDruidParseSQL(){
////		String sql = "select * from flstest where id = 1";
////		String sql = "insert into flstest(id,text) values(?,?)";
//		String sql = "select id into flstest from flstest2";
//		
//		String dbType = JdbcConstants.POSTGRESQL;
//		String result = SQLUtils.format(sql, dbType);
//		List<SQLStatement> sqlStatementList = SQLUtils.parseStatements(sql, dbType);
//		SQLStatement stmt = sqlStatementList.get(0);
//		PGSchemaStatVisitor visitor = new PGSchemaStatVisitor();
//		stmt.accept(visitor);
//		System.out.println(visitor.getTables().keySet());
//	}
	
	public static void testCompareRegexAndDruid(Connection conn){
		try {
			conn.setAutoCommit(false);
			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
			execSelectPrepared(conn, "select * from ("
+"	select * from dmltest1"
+" ) as x where x.id = 222 for update;");
			conn.commit();
			
			execSelectPrepared(conn, "select id from dmltest_view1");
			conn.commit();
			
			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id =  1","11");
			execUpdtaePrepareNow(conn, "update dmltest1 set text=? where id = 1","11");
			conn.commit();
			
			execInsertPrepared(conn, "insert into dmltest1(id, text) values(1 , '1')");
			
//			execInsertPrepared(conn, "insert into dmltest1(id, text) select id,text from dmltest1 where text = ? and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1", "1");
//			execInsertPrepared(conn, "insert into dmltest1(id, text) select id,text from dmltest1 where text = '1' and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1");
//			execInsertPrepared(conn, "insert into dmltest1(id, text) select id,text from dmltest1 where id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1 and  id = 1");
			conn.commit();
			
			execUpdtaePrepareNow(conn, "update dmltest1 set text = ? where id = 1 and id = 1 and id = 1 and id = 1 and id = 1","11");
			conn.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void test(Connection conn) {
		try {
			
			PreparedStatement ps2 = conn.prepareStatement("insert into tab_test (id, name) values (?, ?)");
			ps2.setInt(1, 1);
			ps2.setString(2, "name");
			int count = ps2.executeUpdate();
			System.out.println("count:" + count);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
