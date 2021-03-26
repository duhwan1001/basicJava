package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 135
		 * 123 : 1S 1B 1O
		 * 531 : 1S 2B 0O
		 * 321 : 0S 2B 1O
		 
		 * 1~9 사이의 겹치지 않는 숫자 3개 발생하고 시작
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = (int)(Math.random() * 9) + 1;
		int n2 = (int)(Math.random() * 9) + 1;
		while(n1 == n2){
			n2 = (int) (Math.random() * 9 + 1);
		}
		int n3 = (int)(Math.random() * 9) + 1;
		while(n1 == n3 || n2 == n3){
			n3 = (int)(Math.random() * 9) + 1;
		}
		
		System.out.println(n1 + "" + n2 + "" + n3);

		int m1;
		int m2;
		int m3;
		
		int s = 0;
		int b = 0;
		int o = 0;
		
		while (s != 3) {
			s = 0;
			b = 0;
			o = 0;
			
			System.out.println("숫자 3개를 입력해주세요>");
			m1 = Integer.parseInt(sc.nextLine());
			m2 = Integer.parseInt(sc.nextLine());
			m3 = Integer.parseInt(sc.nextLine());
			
			if (n1 == m1) s++;
			else if (n1 == m2 || n1 == m3) b++;
//			else if (n1 == m3) b++;
			else o++;
			
			if (n2 == m2) s++;
			else if (n2 == m1 || n2 == m3) b++;
//			else if (n2 == m3) b++;
			else o++;
			
			if (n3 == m3) s++;
			else if (n3 == m1 || n3 == m2) b++;
//			else if (n3 == m2) b++;
			else o++;
			
			System.out.println(s + "S " + b + "B " + o + "O");
		}
		
		System.out.println(s + "스트라이크 정답입니다!");
		
						
	}

}
