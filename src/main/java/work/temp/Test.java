package work.temp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;



public class Test {

	public void ShowProperties(Properties props) {
		// propertyNames(),返回属性列表中所有键的枚举
		/*
		 * Enumeration enu2=props.propertyNames(); while(enu2.hasMoreElements()){
		 * String key = (String)enu2.nextElement(); System.out.println(key); }
		 * System.out.println(); //Properties 继承于
		 * Hashtable，elements()是Hashtable的方法，返回哈希表中的值的枚举。 Enumeration
		 * enu=props.elements(); while(enu.hasMoreElements()){ String key =
		 * (String)enu.nextElement(); System.out.println(key); }
		 */
		// Properties 继承于 Hashtable，entrySet()是Hashtable的方法，
		// 返回此 Hashtable 中所包含的键的 Set 视图。此 collection 中每个元素都是一个 Map.Entry
		Iterator it = props.entrySet().iterator();
		if (!it.hasNext()) {
			// System.out.println("null");
		}
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			// System.out.println(key +":"+value);
		}
		// System.out.println();
	}

	public static Connection getConn() {
		//String driver = "com.highgo.jdbc.Driver";
		String driver = "com.highgo.jdbc.Driver";
		// String url =
		// "jdbc:postgresql://192.168.1.20:5866,localhost:5866,192.168.10.20:5866/test?loadBalanceHosts=true&targetServerType=any";
		//String url = "jdbc:highgo://192.168.100.186:5866/highgo?loggerLevel=trace";
		//home
		//String url = "jdbc:postgresql://192.168.2.101:5866/highgo?loggerLevel=trace";
		//String url = "jdbc:postgresql://192.168.100.244:9999/highgo";
		//highgo
		/*String url = "jdbc:postgresql://192.168.100.169:5866/highgo?loggerLevel=trace";
		String username = "fenglu";
		String password = "102729";*/
		//local pg_10
		/*String url = "jdbc:postgresql://127.0.0.1:5433/highgo?loggerLevel=trace";
		String username = "postgres";
		String password = "highgo@123";*/
		//Centos 7 PG11 highgo
//		String url = "jdbc:postgresql://192.168.100.170:5432/postgres?loggerLevel=trace";
		//migration build-in pg
		String url = "jdbc:highgo://localhost:5866/highgo";
		String username = "highgo";
		String password = "highgo123";
		Connection conn = null;
		ResultSet rs = null;
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
	
	public void test10() throws Exception{
		Connection conn = getConn();
		ResultSet rs = conn.getMetaData().getColumns(null, "%", "test1", "%");
		while(rs.next()){
			String columnName = rs.getString("COLUMN_NAME");
			String typeName = rs.getString("TYPE_NAME");
			String remarks = rs.getString("REMARKS");
			System.out.println(columnName + " ---" + typeName + "---" + remarks);
		}
	}

	public void test1() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = "SELECT c_discount, c_last, c_credit, w_tax FROM benchmarksql.customer, benchmarksql.warehouse "
				+ " WHERE w_id = ? AND w_id = c_w_id AND c_d_id = ? AND c_id = ?";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "test1");
			pstmt.setInt(3, 2);
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		String sql2 = "SELECT COUNT(DISTINCT (s_i_id)) AS stock_count FROM benchmarksql.order_line, benchmarksql.stock"
				+ " WHERE ol_w_id = ? AND ol_d_id = ? AND ol_o_id < ? AND ol_o_id >= ? - 20 AND s_w_id = ? AND s_i_id = ol_i_id AND s_quantity < ?";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql2);
			pstmt.setInt(1, 1);
			pstmt.setInt(2, 1);
			pstmt.setInt(3, 1);
			pstmt.setInt(4, 1);
			pstmt.setInt(5, 1);
			pstmt.setInt(6, 1);
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		String sql3 = "SELECT s_quantity, s_data, s_dist_01, s_dist_02, s_dist_03, s_dist_04, s_dist_05, s_dist_06, s_dist_07, s_dist_08, s_dist_09, s_dist_10"
				+ " FROM benchmarksql.stock WHERE s_i_id = ? AND s_w_id = ? FOR UPDATE";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql3);
			pstmt.setInt(1, 1);
			pstmt.setInt(2, 1);
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		String sql4 = "UPDATE benchmarksql.stock SET s_quantity = ? , s_ytd = s_ytd + ?, s_remote_cnt = s_remote_cnt + ? WHERE s_i_id = ? AND s_w_id = ?";
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql4);
			pstmt.setInt(1, 1);
			pstmt.setInt(2, 1);
			pstmt.setInt(3, 1);
			pstmt.setInt(4, 1);
			pstmt.setInt(5, 1);
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void test2() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = "SELECT d_next_o_id FROM benchmarksql.district WHERE d_w_id = ? AND d_id = ?";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 2);
			pstmt.setString(2, "test2");
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void test3() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = "SELECT c_discount, c_last, c_credit, w_tax FROM benchmarksql.customer, benchmarksql.warehouse "
				+ "WHERE w_id = ? AND w_id = c_w_id AND c_d_id = ? AND c_id = ?";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 3);
			pstmt.setString(2, "test3");

			pstmt.setString(3, "test33");
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	public void test4() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = " SELECT count(*) AS namecnt FROM benchmarksql.customer WHERE c_last = ? AND c_d_id = ? AND c_w_id = ?";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "test4");

			pstmt.setString(3, "test44");
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void test5() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = "SELECT no_o_id FROM benchmarksql.new_order WHERE no_d_id = ? AND no_w_id = ? ORDER BY no_o_id ASC";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "test5");
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void test6(){
		Connection conn = getConn();
		
		String sql = "SELECT * FROM benchmarksql.TEST1 where id = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void test7() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = " SELECT c_first, c_middle, c_last, c_street_1, c_street_2, c_city, c_state, c_zip,"
				+ " c_phone, c_credit, c_credit_lim, c_discount, c_balance, c_since"
				+ " FROM benchmarksql.customer WHERE c_w_id = ? AND c_d_id = ? AND c_id = ?";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "test7");

			pstmt.setString(3, "test7");
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	public void test8() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = "SELECT count(*) AS namecnt FROM benchmarksql.customer WHERE c_last = ? AND c_d_id = ? AND c_w_id = ?";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "test8");

			pstmt.setString(3, "test8");
			ResultSet res = pstmt.executeQuery();
//			while (res.next()) {
//				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
//			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	public void test9() {
		Connection conn = getConn();
		
//		String sql = "select * from longtest";
		String sql = "SELECT * from fl_test_08 where id = ?";
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				System.out.println(res.getInt("id") + "|" + res.getString("name"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Test test = new Test();
//		test.insert(new testpojo(111111, "123"));
//		test.insertBatchStatement(new testpojo(111111, "123"));
		test.test10();
//		test.test2();
//		test.test3();
//		test.test4();
//		test.test5();
//		test.test6();
//		test.test7();
//		test.test8();
//		test.test9();
		
	}

	
}
