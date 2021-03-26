package k_jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import d_array.Array;

public class JDBCUtilYj {

	// 싱글톤 패턴 : 인스턴스 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	private JDBCUtilYj() {

	}

	// 인스턴스를 보관할 변수
	private static JDBCUtilYj instance;

	// 인스턴스를 빌려주는 메서드
	public static JDBCUtilYj getInstance() {
		if (instance == null) {
			instance = new JDBCUtilYj();
		}
		return instance;
	}

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc22";
	String password = "java";

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	/*
	 * Map<String, Object> selectOne(String sql)
	 * Map<String, Object> selectOne(String sql, List<Object> param) 	//sql 쿼리 param 물음표에 들어갈 값?
	 * List<Map<String, Object>> selectList(String sql)					//쿼리를 조회에서 메서드에 넣어준다?
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * int update(String sql)
	 * int update(String sql, List<Object> param)
	 */

	//★★ public을 붙여야만 다른 패키지에서 사용할 수 있음 ★★
	
	public Map<String, Object> selectOne(String sql){
		Map<String, Object> row = null; //new HashMap<>() 보다는 null 넣는 것이 좋음
										//한줄도 조회되지 않는 경우를 생각하여 null 넣는 것?
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
					
			ResultSetMetaData metaDate = rs.getMetaData();
			
			int columnCount = metaDate.getColumnCount();
			
			while (rs.next()) {
				row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaDate.getColumnName(i), rs.getObject(i));
				}			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return row;
	}

	public Map<String, Object> selectOne(String sql, List<Object> param) {
		Map<String, Object> row = new HashMap<>();
		
		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}

			rs = ps.executeQuery();

			ResultSetMetaData metaDate = rs.getMetaData();
			int columnCount = metaDate.getColumnCount();

			while (rs.next()) {
				row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaDate.getColumnName(i), rs.getObject(i));
				}			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return row;
	}
	
	public List<Map<String, Object>> selectList(String sql, List<Object> param) {
		List<Map<String, Object>> list = new ArrayList<>();

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}

			rs = ps.executeQuery();

			ResultSetMetaData metaDate = rs.getMetaData();
			int columnCount = metaDate.getColumnCount();

			while (rs.next()) {
				HashMap<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaDate.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return list;

		// 연습
	}
		
	public List<Map<String, Object>> selectList(String sql) {
		List<Map<String, Object>> list = new ArrayList<>();	
	
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
						
			rs = ps.executeQuery();
			
			ResultSetMetaData metaDate = rs.getMetaData();
			int columnCount = metaDate.getColumnCount();
			
			while (rs.next()) {
				HashMap<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaDate.getColumnName(i), rs.getObject(i));
				}			
				list.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return list;
		
	}

	public int update(String sql) {
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return result;
		
	}
	
	public int update(String sql, List<Object> param) {
		int result = 0;
		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return result;
		
	}
}