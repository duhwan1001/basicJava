package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두 개의 숫자와 연산자를 입력 받아 연산 결과를 알려주는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요>");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("두번째 숫자를 입력해주세요>");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("연산자를 입력해주세요>");
		String o = sc.nextLine();
		
		double r =	o.equals("+") ? a + b :
					o.equals("-") ? a - b :
					o.equals("*") ? a * b :
					o.equals("/") ? a / b :
					o.equals("%") ? a % b : 0;		//연산자 이외의 값 입력 받았을 때 에러메시지가 뜨게 하는 방법은?
		
		System.out.println(r);
		
		
/*		
 		선생님 답안
 		System.out.println("첫번째 숫자>");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("연산자>");
		String op = sc.nextLine();
		System.out.println("두번째 숫자>");
		int y = Integer.parseInt(sc.nextLine());
		
		int result = op.equals("+") ? x + y
				: op.equals("-") ? x - y
				: op.equals("*") ? x * y
				: op.equals("/") ? x / y
				: x % y;
		System.out.println(x + " " + op + " " + y + " = " + result);
*/
		
		
	}

}
