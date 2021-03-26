package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPractice {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc22";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from prod where prod_name like '여성%' ";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount();
			
			while(rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(md.getColumnName(i) + " : ");
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * insert, delete 경우
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into R values ('a2', 'b2', 'c2')";
			ps = con.prepareStatement(sql);
			
			int result = ps.executeUpdate(sql);
			System.out.println(result + "개의 행을 추가했습니다.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		*/
	}

}
