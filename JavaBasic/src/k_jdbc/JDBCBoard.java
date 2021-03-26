package k_jdbc;

import j_collection.Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import e_oop.ScanUtil;

public class JDBCBoard {
	
//	static ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO(PK), TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc22";
		String password = "java";
		
		try {
			con = DriverManager.getConnection(url, user,password);
			
			JDBCBoard b = new JDBCBoard();
			
			while (true) {
				b.showinfo();
				try {
					int s = ScanUtil.nextInt();
					switch (s) {
					case 1:
						b.read();
						break;
					case 2:
						b.write();
						break;
					case 3:
						System.exit(0);
						break;
					}
				} catch (Exception e) {
					System.out.println("올바른 숫자를 입력해주세요>");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
		if(rs != null) try { rs.close(); } catch(Exception e) {}
		if(ps != null) try { ps.close(); } catch(Exception e) {}
		if(con != null) try { con.close(); } catch(Exception e) {}
	}
}
	
	public void showinfo() throws Exception {
		System.out.println("──────────────────────────────────");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("──────────────────────────────────");
		
		String sql = "SELECT BOARD_NO, TITLE, USER_ID, TO_CHAR(REG_DATE, 'YYYY-MM-DD') AS REG_DATE FROM TB_JDBC_BOARD ORDER BY BOARD_NO";

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.print(rs.getString("BOARD_NO") + "\t");
				System.out.print(rs.getString("TITLE") + "\t");
				System.out.print(rs.getString("USER_ID") + "\t");
				System.out.print(rs.getString("REG_DATE"));
				System.out.println();
			}
		System.out.println("──────────────────────────────────");
		System.out.println("1.조회 \t2.등록\t3.종료");
	}
	
	public void write() throws Exception {
		String sql = "INSERT INTO TB_JDBC_BOARD"
				+ " VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
		ps = con.prepareStatement(sql);

		System.out.println("제목을 입력해주세요>");
		ps.setString(1, ScanUtil.nextLine());
		
		System.out.println("내용을 입력해주세요>");
		ps.setString(2, ScanUtil.nextLine());

		System.out.println("작성자를 입력해주세요>");
		ps.setString(3, ScanUtil.nextLine());
		
		int result = ps.executeUpdate();
		System.out.println(result + "개의 게시물이 등록되었습니다.");
	}
	
	public void read() throws Exception{
		System.out.println("조회할 글의 번호를 입력해주세요>");
		int num = ScanUtil.nextInt();
		String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, TO_CHAR(REG_DATE, 'YYYY-MM-DD') AS REG_DATE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, num);
		rs = ps.executeQuery();
		
		System.out.println("──────────────────────────────────");
		
		while(rs.next()){
		System.out.println("번호 : " + rs.getInt("BOARD_NO"));
		System.out.println("제목 : " + rs.getString("TITLE") + "\t");
		System.out.print("작성자 : " + rs.getString("USER_ID") + "\t");
		System.out.println("작성일 : " + rs.getString("REG_DATE"));
		System.out.println("──────────────────────────────────");
		System.out.println(rs.getString("CONTENT"));
		System.out.println();
		System.out.println("──────────────────────────────────");
		}
		System.out.println("1.수정\t2.삭제\t3.목록으로");
		
		switch (ScanUtil.nextInt()) {
		case 1: //수정
			modify(num);
			break;
		case 2: //삭제
			delete(num);
			break;
		case 3: //목록
			break;
		}
	}
	
	public void modify(int num) throws Exception{
		String sql = "UPDATE TB_JDBC_BOARD SET TITLE = ? WHERE  BOARD_NO = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(2, num);
		
		System.out.println("제목 수정 Y/N?>");
		String yn = ScanUtil.nextLine();
		if(yn.equalsIgnoreCase("Y")) {
			System.out.println("수정하려는 제목 입력 후 엔터>");
			ps.setString(1, ScanUtil.nextLine());
			ps.executeUpdate();
		}
		
		sql = "UPDATE TB_JDBC_BOARD SET CONTENT = ? WHERE  BOARD_NO = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(2, num);
		
		System.out.println("내용 수정 Y/N?");
		yn = ScanUtil.nextLine();
		if(yn.equalsIgnoreCase("Y")) {
			System.out.println("수정하려는 내용 입력 후 엔터>");
			ps.setString(2, ScanUtil.nextLine());
			ps.executeUpdate();
		}
		System.out.println("수정이 완료되었습니다.");
				
	}

	public void delete(int num) throws Exception{
		String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";	
		ps = con.prepareStatement(sql);
		ps.setInt(1, num);
		ps.executeUpdate();
		System.out.println("게시글이 삭제되었습니다.");
		
	}
	
}

/*
DB에 SEQUENCE 추가

CREATE SEQUENCE BOARD_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 1000;
*/