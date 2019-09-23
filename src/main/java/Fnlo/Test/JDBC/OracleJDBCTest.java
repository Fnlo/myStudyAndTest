package Fnlo.Test.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class OracleJDBCTest {

	private static int limit = 50000;
	private static int pageSize = 10000;
	public static void main(String[] args) {
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// TODO Auto-generated method stub
//		testSlowAppear();  // limit 5000  					打印时间1270ms  整体时间 1365ms          12357  12492
//		testPageAppear();  // limit 5000  pageSize 1000 	整体时间1416ms                          12568
//		testSlowAppearStatement();
		testThreadPool();
	}

	public static Connection getConn() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.90.102:1521:icbc";
		String username = "lcicbc9999";
		String password = "aaaaaa";
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,加载对应驱动
			conn = (Connection) DriverManager.getConnection(url, username, password);
//			rs = conn.getMetaData().getSchemas();
//			rs = conn.getMetaData().getTables(null, "lcicbc9999", "", null);
//			conn.getMetaData().getColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern)
//			while(rs.next()){
//				for(int i = 1; i <=  rs.getMetaData().getColumnCount(); i++){
//					System.out.print(rs.getObject(i));
//				}
//				System.out.println();
//			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void testSlowAppear(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = getConn();
			System.out.println("开始执行");
			long executeStartTine = System.currentTimeMillis();
			String sql = "SELECT ROWID,LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => TO_CHAR(CASE WHEN FILEID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEID), 'UTF8')))) END ||CASE WHEN FILENAME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILENAME), 'UTF8')))) END ||CASE WHEN FILESUFFIX IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESUFFIX), 'UTF8')))) END ||CASE WHEN FILEPATH IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEPATH), 'UTF8')))) END ||CASE WHEN FILESIZE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESIZE), 'UTF8')))) END ||CASE WHEN STRATEGYID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STRATEGYID), 'UTF8')))) END ||CASE WHEN BUSIID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSIID), 'UTF8')))) END ||CASE WHEN BUSITYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSITYPE), 'UTF8')))) END ||CASE WHEN ORDERCODE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ORDERCODE), 'UTF8')))) END ||CASE WHEN STATUS IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STATUS), 'UTF8')))) END ||CASE WHEN UPLOADTIME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(UPLOADTIME), 'UTF8')))) END ||CASE WHEN CREATEUSERID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(CREATEUSERID), 'UTF8')))) END ||CASE WHEN SERVERTYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(SERVERTYPE), 'UTF8')))) END ||CASE WHEN FILEDATA IS NULL THEN NULL ELSE LOWER (RAWTOHEX(DBMS_CRYPTO.HASH(FILEDATA,2))) END ||CASE WHEN VERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(VERSION), 'UTF8')))) END ||CASE WHEN ISENCRYPTION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISENCRYPTION), 'UTF8')))) END ||CASE WHEN ISCOMPRESSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISCOMPRESSION), 'UTF8')))) END ||CASE WHEN FILELABEL IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILELABEL), 'UTF8')))) END ||CASE WHEN HISVERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(HISVERSION), 'UTF8')))) END ||CASE WHEN PRINTNUM IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(PRINTNUM), 'UTF8')))) END ||CASE WHEN INDEXFLAG IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(INDEXFLAG), 'UTF8')))) END )))) AS VALUE FROM LCICBC9999.HQOA_T_FILE2 WHERE rownum <= " + limit;
			ps = conn.prepareStatement(sql);
			ps.setFetchSize(limit);
			rs = ps.executeQuery();
			System.out.println("execute end. 耗时:" + (System.currentTimeMillis() - executeStartTine) + "ms");
			long executeEndTime = System.currentTimeMillis();
			while(rs.next()){
				System.out.println(rs.getString("ROWID") + "\t|" + rs.getString("VALUE"));
			}
			System.out.println("print end.");
			System.out.println("打印结果集时间： " + (System.currentTimeMillis() - executeEndTime) + "ms");

			System.out.println("整体时间 : " + (System.currentTimeMillis() - executeStartTine) + "ms");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps != null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public static void testSlowAppearStatement(){
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = getConn();
			System.out.println("开始执行");
			long executeStartTine = System.currentTimeMillis();
			String sql = "SELECT ROWID,LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => TO_CHAR(CASE WHEN FILEID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEID), 'UTF8')))) END ||CASE WHEN FILENAME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILENAME), 'UTF8')))) END ||CASE WHEN FILESUFFIX IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESUFFIX), 'UTF8')))) END ||CASE WHEN FILEPATH IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEPATH), 'UTF8')))) END ||CASE WHEN FILESIZE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESIZE), 'UTF8')))) END ||CASE WHEN STRATEGYID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STRATEGYID), 'UTF8')))) END ||CASE WHEN BUSIID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSIID), 'UTF8')))) END ||CASE WHEN BUSITYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSITYPE), 'UTF8')))) END ||CASE WHEN ORDERCODE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ORDERCODE), 'UTF8')))) END ||CASE WHEN STATUS IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STATUS), 'UTF8')))) END ||CASE WHEN UPLOADTIME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(UPLOADTIME), 'UTF8')))) END ||CASE WHEN CREATEUSERID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(CREATEUSERID), 'UTF8')))) END ||CASE WHEN SERVERTYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(SERVERTYPE), 'UTF8')))) END ||CASE WHEN FILEDATA IS NULL THEN NULL ELSE LOWER (RAWTOHEX(DBMS_CRYPTO.HASH(FILEDATA,2))) END ||CASE WHEN VERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(VERSION), 'UTF8')))) END ||CASE WHEN ISENCRYPTION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISENCRYPTION), 'UTF8')))) END ||CASE WHEN ISCOMPRESSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISCOMPRESSION), 'UTF8')))) END ||CASE WHEN FILELABEL IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILELABEL), 'UTF8')))) END ||CASE WHEN HISVERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(HISVERSION), 'UTF8')))) END ||CASE WHEN PRINTNUM IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(PRINTNUM), 'UTF8')))) END ||CASE WHEN INDEXFLAG IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(INDEXFLAG), 'UTF8')))) END )))) AS VALUE FROM LCICBC9999.HQOA_T_FILE2 WHERE rownum <= " + limit;
			stat = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			//default 	10					//11642ms  11906ms
//			stat.setFetchSize(50);			//9634ms   9792ms
			stat.setFetchSize(100);			//9334ms   9412ms                  
//			stat.setFetchSize(200);			//9181ms   9316ms
//			stat.setFetchSize(500);			//8848ms   9031ms
//			stat.setFetchSize(1000);			//8853ms   9134ms
//			stat.setFetchSize(2000);			//8645ms   9152ms
//			stat.setFetchSize(20000);			//6963ms   10543ms
//			stat.setFetchSize(50000);			//1974ms   10687ms
//			stat.setFetchSize(100000);			//1904ms   10545ms
//			((OracleStatement) stat).setRowPrefetch(limit);
			
			rs = stat.executeQuery(sql);	
			System.out.println("execute end. 耗时:" + (System.currentTimeMillis() - executeStartTine) + "ms");
			long executeEndTime = System.currentTimeMillis();
			while(rs.next()){
				System.out.println(rs.getString("ROWID") + "\t|" + rs.getString("VALUE"));
			}
			System.out.println("print end.");
			System.out.println("打印结果集时间： " + (System.currentTimeMillis() - executeEndTime) + "ms");

			System.out.println("整体时间 : " + (System.currentTimeMillis() - executeStartTine) + "ms");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stat != null){
				try {
					stat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public static void testPageAppear(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = getConn();
			String sql = "SELECT ROWID,LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => TO_CHAR(CASE WHEN FILEID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEID), 'UTF8')))) END ||CASE WHEN FILENAME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILENAME), 'UTF8')))) END ||CASE WHEN FILESUFFIX IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESUFFIX), 'UTF8')))) END ||CASE WHEN FILEPATH IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEPATH), 'UTF8')))) END ||CASE WHEN FILESIZE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESIZE), 'UTF8')))) END ||CASE WHEN STRATEGYID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STRATEGYID), 'UTF8')))) END ||CASE WHEN BUSIID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSIID), 'UTF8')))) END ||CASE WHEN BUSITYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSITYPE), 'UTF8')))) END ||CASE WHEN ORDERCODE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ORDERCODE), 'UTF8')))) END ||CASE WHEN STATUS IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STATUS), 'UTF8')))) END ||CASE WHEN UPLOADTIME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(UPLOADTIME), 'UTF8')))) END ||CASE WHEN CREATEUSERID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(CREATEUSERID), 'UTF8')))) END ||CASE WHEN SERVERTYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(SERVERTYPE), 'UTF8')))) END ||CASE WHEN FILEDATA IS NULL THEN NULL ELSE LOWER (RAWTOHEX(DBMS_CRYPTO.HASH(FILEDATA,2))) END ||CASE WHEN VERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(VERSION), 'UTF8')))) END ||CASE WHEN ISENCRYPTION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISENCRYPTION), 'UTF8')))) END ||CASE WHEN ISCOMPRESSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISCOMPRESSION), 'UTF8')))) END ||CASE WHEN FILELABEL IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILELABEL), 'UTF8')))) END ||CASE WHEN HISVERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(HISVERSION), 'UTF8')))) END ||CASE WHEN PRINTNUM IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(PRINTNUM), 'UTF8')))) END ||CASE WHEN INDEXFLAG IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(INDEXFLAG), 'UTF8')))) END )))) AS VALUE FROM LCICBC9999.HQOA_T_FILE2 "
					+"WHERE ROWID IN ("
					+"	SELECT rid FROM ("
					+"		SELECT rownum rn,rid FROM("
					+"			SELECT rowid rid FROM LCICBC9999.HQOA_T_FILE2"
					+"		) WHERE rownum < ?"
					+"	) WHERE rn > ? "
	
					+")";

			long executeEndTime = System.currentTimeMillis();
			ps = conn.prepareStatement(sql);
			int pageCount = (limit % pageSize > 0 ) ? (limit / pageSize + 1) : (limit / pageSize);

			for(int i = 0; i < pageCount ; i++){
				ps.setInt(1, (i + 1) * pageSize);
				ps.setInt(2, i * pageSize);
				long executeStartTine = System.currentTimeMillis();
				rs = ps.executeQuery();
				System.out.println("execute [" + i + "] end. 耗时:" + (System.currentTimeMillis() - executeStartTine) + "ms");
				
				while(rs.next()){
					System.out.println(rs.getString("ROWID") + "\t|" + rs.getString("VALUE"));
				}
			}
			
			System.out.println("print end.");
			System.out.println("整体时间 :  " + (System.currentTimeMillis() - executeEndTime) + "ms");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps != null){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	
	public static void testThreadPool(){
		long startTime = System.currentTimeMillis();
//		int pageCount = (limit % pageSize > 0 ) ? (limit / pageSize + 1) : (limit / pageSize);
		int pageCount = 5;
		CountDownLatch doneSignal = new CountDownLatch(pageCount);
		ExecutorService executor = Executors.newFixedThreadPool(pageCount);
		
		for(int i = 0 ; i < pageCount ; i++){
			threadTest xx = new threadTest(doneSignal, i);
			executor.submit(()->{
				xx.start();
			});
		}
		try {
			doneSignal.await();
			executor.shutdown();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("all time : " + (System.currentTimeMillis() - startTime));
		
		
	}
	
	public static class threadTest extends Thread{
		
		private int i;
		private CountDownLatch doneSignal;
		
		public threadTest(CountDownLatch doneSignal, int i) {
			// TODO Auto-generated constructor stub
			this.i = i;
			this.doneSignal = doneSignal;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				conn = getConn();
				String sql = "SELECT ROWID,LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => TO_CHAR(CASE WHEN FILEID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEID), 'UTF8')))) END ||CASE WHEN FILENAME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILENAME), 'UTF8')))) END ||CASE WHEN FILESUFFIX IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESUFFIX), 'UTF8')))) END ||CASE WHEN FILEPATH IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILEPATH), 'UTF8')))) END ||CASE WHEN FILESIZE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILESIZE), 'UTF8')))) END ||CASE WHEN STRATEGYID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STRATEGYID), 'UTF8')))) END ||CASE WHEN BUSIID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSIID), 'UTF8')))) END ||CASE WHEN BUSITYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(BUSITYPE), 'UTF8')))) END ||CASE WHEN ORDERCODE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ORDERCODE), 'UTF8')))) END ||CASE WHEN STATUS IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(STATUS), 'UTF8')))) END ||CASE WHEN UPLOADTIME IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(UPLOADTIME), 'UTF8')))) END ||CASE WHEN CREATEUSERID IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(CREATEUSERID), 'UTF8')))) END ||CASE WHEN SERVERTYPE IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(SERVERTYPE), 'UTF8')))) END ||CASE WHEN FILEDATA IS NULL THEN NULL ELSE LOWER (RAWTOHEX(DBMS_CRYPTO.HASH(FILEDATA,2))) END ||CASE WHEN VERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(VERSION), 'UTF8')))) END ||CASE WHEN ISENCRYPTION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISENCRYPTION), 'UTF8')))) END ||CASE WHEN ISCOMPRESSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(ISCOMPRESSION), 'UTF8')))) END ||CASE WHEN FILELABEL IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(FILELABEL), 'UTF8')))) END ||CASE WHEN HISVERSION IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(HISVERSION), 'UTF8')))) END ||CASE WHEN PRINTNUM IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(PRINTNUM), 'UTF8')))) END ||CASE WHEN INDEXFLAG IS NULL THEN NULL ELSE LOWER(utl_raw.cast_to_raw(DBMS_OBFUSCATION_TOOLKIT.MD5(INPUT_STRING => CONVERT (TO_CHAR(INDEXFLAG), 'UTF8')))) END )))) AS VALUE FROM LCICBC9999.HQOA_T_FILE2 "
						+"WHERE ROWID IN ("
						+"	SELECT rid FROM ("
						+"		SELECT rownum rn,rid FROM("
						+"			SELECT rowid rid FROM LCICBC9999.HQOA_T_FILE2 ORDER BY rid"
						+"		) WHERE rownum < ?"
						+"	) WHERE rn > ? "
		
						+")";

				long executeEndTime = System.currentTimeMillis();
				ps = conn.prepareStatement(sql);
//				ps.setFetchSize(50); //3768
				ps.setFetchSize(100); //3304
//				ps.setFetchSize(200); //3570
//				ps.setFetchSize(10000); //4800
				ps.setInt(1, (i + 1) * pageSize);
				ps.setInt(2, i * pageSize);
				long executeStartTine = System.currentTimeMillis();
				rs = ps.executeQuery();
				System.out.println("execute [" + i + "] end. 耗时:" + (System.currentTimeMillis() - executeStartTine) + "ms");
				
				while(rs.next()){
					System.out.println(rs.getString("ROWID") + "\t|" + rs.getString("VALUE"));
				}
				
				
				System.out.println("print end.");
				System.out.println("整体时间 :  " + (System.currentTimeMillis() - executeEndTime) + "ms");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				if(rs != null){
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(ps != null){
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(conn != null){
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				doneSignal.countDown();
			}
		}
		
	}
	
	
}
