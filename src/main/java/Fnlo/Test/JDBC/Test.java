package Fnlo.Test.JDBC;

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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import com.highgo.jdbc.largeobject.LargeObject;
import com.highgo.jdbc.largeobject.LargeObjectManager;



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
		String driver = "com.highgo.jdbc.Driver";
//		String driver = "org.postgresql.Driver";
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
		String url = "jdbc:highgo://localhost:6666/postgres?loggerLevel=trace";
		String username = "postgres";
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

	public Connection getConn2() {
		String driver = "org.postgresql.Driver";
		// String url =
		// "jdbc:postgresql://192.168.1.20:5866,localhost:5866,192.168.10.20:5866/test?loadBalanceHosts=true&targetServerType=slave";
		String url = "jdbc:postgresql://localhost:5866,localhost:5866,192.168.10.20:5866/test?loadBalanceHosts=true&targetServerType=master";
		String username = "highgo";
		String password = "highgo123";
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,加载对应驱动
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public Connection getConn3() {
		String driver = "org.postgresql.Driver";
		// String url =
		// "jdbc:postgresql://192.168.1.20:5866,localhost:5866,192.168.10.20:5866/test?loadBalanceHosts=true&targetServerType=slave";
		String url = "jdbc:postgresql://localhost:5866,localhost:5866,192.168.10.20:5866/test?loadBalanceHosts=true&targetServerType=preferSlave";
		String username = "highgo";
		String password = "highgo123";
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,加载对应驱动
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public Connection getConnResultErrorEncoding() {
		String driver = "org.postgresql.Driver";
		// String url =
		// "jdbc:postgresql://192.168.1.20:5866,localhost:5866,192.168.10.20:5866/test?loadBalanceHosts=true&targetServerType=any";
		String url = "jdbc:postgresql://192.168.1.20:5866,localhost:5866,192.168.10.20:5866/test?loadBalanceHosts=true";
		String username = "highgo";
		String password = "highgo123";
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,加载对应驱动
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public int insertclob(testpojo person) {
		Connection conn = getConn();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		int i = 0;
		String sql = "insert into typetest (id,docclob) values(?,?)";
		// String sql="insert into test (id,name) values(1234,'test');";
		// String sql="insert into clobtest values(?,?)";
		// String blobStr = "doc";
		byte[] data = null;
		try {
			data = "abc".getBytes("UTF-8");
			System.out.println(data);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		InputStreamReader isr = new InputStreamReader(bais);
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, person.getId());
			// pstmt.setString(1, person.getId()+"");
			pstmt.setClob(2, isr);
			// pstmt.setBlob(parameterIndex, x);
			i = pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end" + i);
		return i;
	}

	public int insert(testpojo person) {
		Connection conn = getConn();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		int i = 0;
		String sql = "insert into typetest (id,docblob) values(?,?)";
		// String sql="insert into test (id,name) values(1234,'test');";
		// String sql="insert into clobtest values(?,?)";
		// String blobStr = "doc";
		byte[] data = null;
		try {
			data = "abc".getBytes("UTF-8");
			System.out.println(data);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, person.getId());
			// pstmt.setString(1, person.getId()+"");
			// pstmt.setBytes(2, data);//
			pstmt.setBlob(2, new ByteArrayInputStream(data));
			// pstmt.setString(2, "setString");
			// pstmt.setBlob(parameterIndex, x);
			i = pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end" + i);
		return i;
	}

	public int[] insertBatchStatement(testpojo person){
		Connection conn = getConn();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		int[] i = new int[0];
//		String sql = "insert into typetest (id,docblob) values(?,?);";
		 String sql="insert into test (id,boolean) values(?,?);";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			for(int j = 0; j < 2; j++){
				pstmt.setInt(1, j);
				pstmt.setBoolean(2, true);
				pstmt.addBatch();
			}
//			pstmt.setInt(1, 11);
//			pstmt.setString(2, "xxx");
//			pstmt.addBatch();
//			pstmt.addBatch();
			i = pstmt.executeBatch();
			// pstmt.setString(2, "setString");
			// pstmt.setBlob(parameterIndex, x);
			
			conn.commit();
			pstmt.clearBatch();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end" + i);
		return i;
	}
	
	public int insertlargeobject(testpojo person) {
		Connection conn = getConn();
		int i = 0;
		String sql = "insert into largeobjectoid  (id,obj) values(?,?)";
		byte[] data = null;

		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			FileInputStream fis = new FileInputStream("D:/1.txt");
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, person.getId());
			pstmt.setBlob(2, fis);
			i = pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
			conn.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("end" + i);
		return i;
	}

	@SuppressWarnings("finally")
	public int insertlargeobjectwithprovidefunc(testpojo person) {
		Connection conn = getConn();
		PreparedStatement pstmt;
		try {
			conn.setAutoCommit(false);
			LargeObjectManager lobj = ((com.highgo.jdbc.PGConnection) conn).getLargeObjectAPI();
			long oid = lobj.createLO(LargeObjectManager.READ
					| LargeObjectManager.WRITE);
			LargeObject obj = lobj.open(oid, LargeObjectManager.WRITE);
			FileInputStream fis = new FileInputStream("D:/1.txt");
			byte buf[] = new byte[2048];
			int s, tl = 0;
			while ((s = fis.read(buf, 0, 2048)) > 0) {
				obj.write(buf, 0, s);
				tl += s;
			}
			obj.close();
			String sql = "insert into largeobjectoid (id,obj) values(?,?)";
			int i = 0;
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setInt(1, person.getId());
			pstmt.setLong(2, oid);
			i = pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
			conn.close();
			System.out.println("end" + i);
			return i;
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return 0;
		}

	}

	public void getBlob() {
		Connection conn = getConn();
		String sql = "select * from typetest";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet res = pstmt.executeQuery();
			InputStream os = null;
			while (res.next()) {
				int readSize = 0;
				byte[] bytearray = new byte[1024];
				System.out.print(res.getInt("id") + "|");
				if (res.getBlob("docblob") != null) {
					os = res.getBlob("docblob").getBinaryStream();
					ByteArrayOutputStream bais = new ByteArrayOutputStream();
					try {
						while ((readSize = os.read(bytearray)) > 0) {
							bais.write(bytearray, 0, readSize);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print(bais.toString());
				}

				System.out.print("|" + res.getClob("docclob") + "|"
						+ res.getString("doctext") + "|");
				if (res.getBytes("docbytea") != null) {
					System.out.print(new String(res.getBytes("docbytea")));
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void getBytea() {
		Connection conn = getConn();
		String sql = "select * from byteatest";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				System.out.println(res.getInt("id") + "|" + res.getBlob("doc"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void createTable(){
		Connection conn = getConn();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String sql = "create table fl_test_04 (id int, name varchar)";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			// pstmt.setBlob(parameterIndex, x);
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getlong() {
		Connection conn = getConn();
		String sql = "select * from longtest";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				System.out.println(res.getInt("id") + "|" + res.getLong("doc"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void getClob() {
		Connection conn = getConn();
		String sql = "select * from typetest";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				System.out.println(res.getInt("id") + "|" + res.getBlob("docblob")
						+ "|" + res.getClob("docclob") + "|" + res.getString("doctext")
						+ "|" + res.getBytes("docbytea"));
			}
			pstmt.getWarnings();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void getBpChar() {
		Connection conn = getConn();
		String sql = "select ispublic from lcicbc9999.gspportal;";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				System.out.println(res.getString("ispublic"));
			}
			pstmt.getWarnings();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void callProcedure() throws SQLException{
//		Connection conn = getConn();
//		String sql = "{call procedure(?,?)}";
//		CallableStatement ss = conn.prepareCall(sql);
//		//ss.registerOutParameter(i, OracleTypes.BFILE);
//		ss.setInt(1, 123);
//		ss.registerOutParameter(2, OracleTypes.VARCHAR);
//		ss.execute();
//		//conn.commit();
//		conn.getWarnings();
//		String name = ss.getString(2);
//		System.out.println(name);
//		
		
		
	}
	
	public void ExecCMD(String command){
		Runtime runtime = Runtime.getRuntime();
		try {
			Process p = runtime.exec(command);
			p.waitFor();
			System.out.println(p.exitValue());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		/*
		 * // TODO Auto-generated method stub Driver driver = new Driver();
		 * 
		 * // 创建一个 Properties 实例； Properties p = new Properties(); FileInputStream
		 * in = new
		 * FileInputStream("src/main/java/org/postgresql/sometest.properties");
		 * p.load(in); in.close(); //连的上 driver.connect(
		 * "jdbc:postgresql://localhost:5866,192.168.100.100:586/highgo?user=highgo&password=highgo123&urlPropstest=SA"
		 * , p); //连不上 //driver.connect(
		 * "jdbc:postgresql://localhost:5866/test?user=highgo&&password=highgo123&&AJ=D&&urlPropstest=SA"
		 * , null);
		 */
		Test test = new Test();
//		test.insert(new testpojo(111111, "123"));
//		test.insertBatchStatement(new testpojo(111111, "123"));
//		 test.insertclob(new testpojo(111111,"123"));
		//test.insertlargeobject(new testpojo(111111, "123"));
//		test.getBlob();
//		 test.getClob();
		// test.getBytea();
		// test.getlong();
		//test.callProcedure();
//		test.getBpChar();
		test.createTable();
		

//		Connection conn = getConn();
		
		// test.ExecCMD("F:\\NotePad++\\notepad++.exe");
		 
		//Character.digit(char, int);将char 转化为对应16进制的值，不存在时返回-1，用它的原因是在
		//java传入时，每个char占两字节，8位二进制数，数据库中存储为2位16进制数     例： 'a' => 01100001 => 0x61
		//读取的时候以byte[]类型读取，即['6','1'],那么我们知道这两位范围在 十六进制的0~E之间，用digit('6',16)转化为十六进制，占四位二进制数1字节，高位向左移动4位，低位不需移动，合并出8位二进制，再转化位对应的char
		//System.out.println(Character.digit('a', 16));
		
		/*String url = "jdbc:highgo://192.168.100.244:9999/highgo";
        Connection conn = test.getConn();
        Statement stmt = null;
        try
        {
            //conn = JdbcHelper.getConnection(url, "u1", "qwer1234", false);
            stmt = conn.createStatement();
            stmt.execute("CREATE TEMP TABLE unused (a int primary key)"); 
            System.out.println("success");
            System.out.println("warning=" + stmt.getWarnings());
            
            Statement stmt = con.createStatement();
            // Will generate a NOTICE: for primary key index creation
            //stmt.execute("CREATE TEMP TABLE unused (a int primary key)");
            System.out.println("warning=" + stmt.getWarnings());
            //stmt.executeQuery("SELECT 1");
            // Executing another query should clear the warning from the first one.
            //assertNull(stmt.getWarnings());
            System.out.println("warning=" + stmt.getWarnings());
            stmt.close();
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }*/
		
		// byte[] bytes = new byte[]{65,66,67,68};
		// System.out.println(new String(bytes,5,1,3));
		// test.getConn();
		// System.out.println("=================================2");
		// test.getConn();
		// System.out.println("=================================3");
		// test.getConn2();
		// System.out.println("=================================4");
		// test.getConn2();
	}

	
}
