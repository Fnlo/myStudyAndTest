package Fnlo.Test.Pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCPool {

	public static void main(String[] args) {
		JDBCPool.select("select * from bmsql_item");

	}
	/**
	 *  * 查询，返回结果集  
	 */
	public static List<Map<String, Object>> select(String sql) {
		List<Map<String, Object>> returnResultToList = null;
		try {
			Connection connection = JDBCUtil.getConnection();
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet resultSet = pst.executeQuery();
			//	returnResultToList = returnResultToList(resultSet);
			JDBCUtil.close(resultSet, pst, connection);
		} catch (SQLException e) {
 
			System.out.println("异常提醒：" + e);
		}
		return returnResultToList;
	}
}
