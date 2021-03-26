package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCUtilTest {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();							//객체생성
		
		//물음표에 들어갈 값 담기
		/*
		String sql = "select * from cart where cart_member = ?";
		List<Object> param = new ArrayList<>();
		param.add("a001");
		
		List<Map<String, Object>> list = jdbc.selectList(sql, param);
		System.out.println(list);
		*/
		
//		?는 ''로 감싸지 않아야 함 -> 오류터짐		
		String sql = "select * from member where mem_id = ?";
		List<Object> param = new ArrayList<>();
		param.add("a001");
		
		Map<String, Object> row = jdbc.selectOne(sql, param);
		System.out.println(row);
		
		
		/*
		 * Map<String, Object> row = null 일 때
		 * if(row == null){}로 한 줄도 없는 경우를 확인 (선생님은 이게 낫다고 생각)
		 * 
		 * null이 아니고 new HashMap<>() 일 때
		 * if(row.size() == 0){}로 한 줄도 없는 것을 확인
		 */
		
//		String sql = "insert into tb_jdbc_board values(BOARD_SEQ.NEXTVAL,?,?,?,sysdate)";
//		List<Object> param = new ArrayList<>();
//		param.add("제목");
//		param.add("내용");
//		param.add("a001");
//		
//		int result = jdbc.update(sql, param);
//		System.out.println(result + "행이 영향을 받았습니다.");
//		
		
		
		
	}

}




















