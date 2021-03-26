package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String의 주요 메서드
		 * - equals() : 문자열의 내용이 같은지 반환한다.
		 * - length() : 문자열의 길이를 반환한다.
		 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다.
		 * - substring() : 문자열의 특정 부분을 잘라서 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다.
		 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
		 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
		 */
		
		boolean equals = "문자열".equals("문자열");
//		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
//		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str1));
		//null이 있을 수 있는 변수를 앞에 두지 않는다.
		
		String str = "12345";
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char charAt = str.charAt(i);
			System.out.println(charAt);
		}
	
		//문자열 뒤집기
		String rev = "";
		for (int i = str.length() - 1; 0 <= i; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 끝까지 잘라서 반환한다.
		System.out.println(sub1);
		String sub2 = str.substring(5, 8); //5번 인덱스부터 8번 인덱스 전까지 잘라서 반환한다.
		System.out.println(sub2);
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지");
//		System.out.println(index);
		
		//substring과 indexOf를 조합해서 문자열 자르기
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		for (int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.print(name + " : ");
			
			//가격만 잘라서 int 타입의 변수에 저장해주세요.
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ") + 1, menu[i].indexOf("원")));
			System.out.println(price);
		}
		
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		//오렌지가 메뉴의 몇 번 인덱스에 있는지 찾기
		for (int i = 0; i < menu.length; i++) {
			if(menu[i].contains("수박")) {
				System.out.println("수박은 " + i + "번 인덱스에 있습니다.");
			}
		}
		
		//split
		str = "a/b/c/";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		
		
		//메뉴명과 가격 나누기
		for (int i = 0; i < menu.length; i++) {
			split = menu[i].split(" ");
			System.out.println("메뉴명 : " + split[0] + " / 가격 : " + split[1]);
		}
		
		str = "문자열";
		String trim = str.trim();
		System.out.println("[" + str + "] -> [" + trim + "]");
		
		//사용자의 실수로 아이디나 비밀번호 앞뒤에 공백이들어가는 것을 방지하기 위해 사용할 수 있다.
		String id = "myId";
		String password = "myPassword";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		int number = 10;
		str = number + "";
		str = String.valueOf(number);
		
		
	}

}






































