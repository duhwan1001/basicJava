package a_variable;								//클래스의  위치

import java.util.Scanner;
//단축키: Ctrl + Shift + o


public class Variable {							//클래스, 클래스 이름 {

	public static void main(String[] args) {	//메서드 - ()가 붙은 것	
		//메서드 : 명령문의 집합 (메서드 말고 변수가 있음)
		//main은 메서드의 이름, main메서드: 프로그램의 시작과 끝
		//{} 메서드의 범위
		
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용)
		
		//한줄 주석 : Ctrl + Shift + c
		
		/* 범위 주석 : Ctrl + Shift + /(해제: \) */ 
		
//		데이터
//			- 기본형       → 오늘 배울 것!
//			- 배열
//			- 클래스
//
//		조작
//			- 산술연산
//			- 비교연산
//			- 논리연산
//			- 조건문
//			- 반복문
		
//		변수를 만드는 방법 : 데이터의 형태(데이터 타입) + 이름
		
//		기본형 타입
//		 	- 정수: byte(1), short(2), *int(4), long(8)
//		 	- 실수: float(4), *double(8)
//		 	- 문자: char(2)
//		 	- 논리: boolean(1)
		
		int x; 		//정수를 저장할 수 있는 x라는 이름을 가진 그릇을 만들어라.
					//변수를 만드는 것을 변수 선언이라도 표현한다.
		
//		double x;	//블럭{}안에서 이름이 중복될 수 없다.
		double y;
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		x = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; //변수의 타입에 맞는 값을 저장해야 한다.
		
		
		int abc = 30;	//일반적으로 선언과 초기화를 한번에 한다.
		long l = 40L;	//접미사 L을 부여야 long타입이 된다.
						//소문자로 쓰면 숫자와 헷갈리므로 대문자 사용 
		float f = 5.5f;	//접미사 F를 붙여야 float타입이 된다.
		char c = '한';	//따옴표 안에 반드시 한글자를 넣어야 한다.
		boolean b = true; 	//true, false
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		byte a =1;
		short bc = 2;
		int d = 3;
		long l1 = 4L;
		float f1 = 5.5f;
		double g = 3.14;
		char h = '밍';
		boolean i = false;
		
		x = 20; //기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
		y = 5.5;
		
		//위에서 만든 8개의 변수에 새로운 값을 저장해주세요.
		a = 127;
		bc = 32767;
		d = 2147483647;
		l1 = 9223372036500000000L;
		f1 = 32768f;
		g = 2.041992;
		h = '뎁';
		i = true;
		
		//콘솔창에 출력 (실행 단축기 : Ctrl + F11)
		System.out.println(a);
		System.out.println(bc);
		System.out.println(d);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		System.out.println(204);
		System.out.println("유딩");
		
		//문자열
		String str = "문자 여러개...";		//클래스는 참조형타입 데이터이다.
		System.out.println(str);
		//문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.
		System.out.println(str + 44 + 56);
		System.out.println(44 + 56 + str);
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해주어야 하는데 이를 형변환(type casting)이라 한다.
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		big = small;		//표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
		
		/* !!암기!!
		 * 명명규칙
		 * - 영문 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		   				 한글은 사용할 수 있지만 사용하진 않는다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [낙타식 표기법을 사용한다. (mySampleVariable)]			//괄호가 없으면 변수, 있으면 메서드
		 * - [클래스명의 첫글자를 대문자로 한다. (MySampleClass)]		//[] 반드시 해야하는 건 아니지만 암묵적 약속
		 */
		
		/*
		 * 상수
		 * - 값을 변경할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER = 10;		//final을 변수 앞에 붙이면 상수가 되고 값을 변경할 수 없음
//		MAX_NUMBER = 100; //컴파일 에러 발생
		
		//출력
		System.out.print("줄바꿈을 하지 않는다.\n");	//역슬래시는 탈출 문자
												// \t : 탭, 
		System.out.println("줄바꿈을 한다.");
		System.out.printf("문자열 : %s, 숫자: %d", "안녕", 10);	//출력 포맷을 지정한다.
		System.out.println();
		
		//입력
		Scanner sc = new Scanner(System.in);	//입력 받기 위한 클래스
//		System.out.println("아무거나 입력해주세요>");
//		String str2 = sc.nextLine();
//		System.out.println("입력 받은 내용 : " + str2);
		//입력을 받게 되면 사용자가 입력할 때까지 프로그램이 멈추게 된다.
		//내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.
		
//		System.out.println("int 입력>");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!");
		
		//숫자 입력
//		System.out.println("int 입력>");
//		int number = Integer.parseInt(sc.nextLine());	//Interger.parseInt 문자열을 숫자로 바꾸는 것
//		System.out.println(number);
		
		//문제: 자신의 이름을 저장변수를 선언해주세요.
		String myName = sc.nextLine();
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
		System.out.println("이름을 입력해주세요>");
		myName = sc.nextLine();
		
		//자신의 나이를 저장할 변수를 선언해주세요.
		int myAge;
		
		//위에서 선언한 변수를 초기화하기 위해 나이를 입력 받아주세요.
		System.out.println("나이를 입력해주세요>");
		myAge = Integer.parseInt(sc.nextLine());
//		Double.parseDouble(sc.nextLine());
		
		System.out.println("이름 : " + myName + " / 나이 : " + myAge);
		
		
		//!!과제!!
		//다음과 같은 프로그램을 작성해주세요.
		/*
		 * ======== 회원가입 ========
		 * 아이디>admin
		 * 비밀번호(4자리숫자)>1234
		 * 이름>홍길동
		 * 나이>99
		 * 키>185.5
		 * ========================
		 * 아이디 : admin
		 * 비밀번호 : 1234
		 * 이름 : 홍길동
		 * 나이 : 99세
		 * 키 : 185.5cm
		 * 
		 */
		
		String id;
		int password;
		String name;
		int age;
		double height;
		
		System.out.println("아이디를 입력해주세요>");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요>");
		password = Integer.parseInt(sc.nextLine());
		System.out.println("이름을 입력해주세요>");
		name = sc.nextLine();
		System.out.println("나이를 입력해주세요>");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("키를 입력해주세요>");
		height = Double.parseDouble(sc.nextLine());
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		
	}

}
















