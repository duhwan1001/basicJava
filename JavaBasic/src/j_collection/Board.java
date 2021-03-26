package j_collection;

import java.util.ArrayList;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {
	
	static ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만드록,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ──────────────────────────────
		 * 번호		제목		작성자	작성일
		 * ──────────────────────────────
		 * 1	  안녕하세요 	홍길동	2/9
		 * 1	  안녕하세요 	홍길동	2/9
		 * 1	  안녕하세요 	홍길동	2/9
		 * 1	  안녕하세요 	홍길동	2/9
		 * ──────────────────────────────
		 * 1.조회	  2.등록  		3.종료 
		 * 
		 * 조회 후 수정, 삭제 가능
		 */
	
		Board b = new Board();
		
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
	
	}

	
	public void showinfo() {
		System.out.println("──────────────────────────────────");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("──────────────────────────────────");
		
		for (HashMap<String, Object> board : table) {
			System.out.print(board.get("번호") + "\t");
			System.out.print(board.get("제목") + "\t");
			System.out.print(board.get("작성자") + "\t");
			System.out.print(board.get("작성일"));
			System.out.println();
		}
	
		System.out.println("──────────────────────────────────");
		System.out.println("1.조회 \t2.등록\t3.종료");
	}
	
	public void write() {
		HashMap<String, Object> board = new HashMap<>();
		
		int num = 1;
		if (table.size() != 0) {
			num = (int) table.get(table.size() - 1).get("번호") + 1;
		} 
		board.put("번호", num);
		
		System.out.println("제목을 입력해주세요>");
		board.put("제목", ScanUtil.nextLine());
		
		System.out.println("내용을 입력해주세요>");
		board.put("내용", ScanUtil.nextLine());

		System.out.println("작성자를 입력해주세요>");
		board.put("작성자", ScanUtil.nextLine());
		
		System.out.println("작성일을 입력해주세요>");
		board.put("작성일", ScanUtil.nextLine());
		
		table.add(board);
		
	}
	
	public void read() {
		System.out.println("조회할 글의 번호를 입력해주세요>");
		int num = ScanUtil.nextInt();
		HashMap<String, Object> board = null;
		
		for (HashMap<String, Object> b : table) {
			if((int)b.get("번호") == num) {
				board = b;
				break;
			}
		}
		System.out.println("──────────────────────────────────");
			
		System.out.println("번호 : " + board.get("번호"));
		System.out.println("제목 : " + board.get("제목") + "\t");
		System.out.print("작성자 : " + board.get("작성자") + "\t");
		System.out.println("작성일 : " + board.get("작성일"));
		System.out.println("──────────────────────────────────");
		System.out.println(board.get("내용"));
		System.out.println();
		System.out.println("──────────────────────────────────");
		System.out.println("1.수정\t2.삭제\t3.목록으로");
		
		switch (ScanUtil.nextInt()) {
		case 1: //수정
			modify((int)board.get("번호"));
			break;
		case 2: //삭제
			delete((int)board.get("번호"));
			break;
		case 3: //목록
			break;
		}
	}
	
	public void modify(int num) {
		for (int i = 0; i < table.size(); i++) {
			if((int)table.get(i).get("번호") == num) {
				HashMap<String, Object> b = table.get(i);
				
				System.out.println("제목 수정 Y/N?>");
				String yn = ScanUtil.nextLine();
				if(yn.equalsIgnoreCase("Y")) {
					System.out.println("수정하려는 제목 입력 후 엔터>");
					b.put("제목", ScanUtil.nextLine());
				}
				
				System.out.println("내용 수정 Y/N?");
				yn = ScanUtil.nextLine();
				if(yn.equalsIgnoreCase("Y")) {
					System.out.println("수정하려는 내용 입력 후 엔터>");
					b.put("내용", ScanUtil.nextLine());
				}
				System.out.println("수정이 완료되었습니다.");
				
				break;
			}
		}
	}

	public void delete(int num) {
		for (int i = 0; i < table.size(); i++) {
			if((int)table.get(i).get("번호") == num) {
				table.remove(i);
				System.out.println("게시글이 삭제되었습니다.");
				break;
			}
		}
	}
}
