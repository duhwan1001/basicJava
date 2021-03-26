package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체 간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(10);
		System.out.println(returnValue);
		
		sc.flowTest1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메서드를 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드를 리턴 받은 값을 출력해주세요.
		
		ClassMaker cm = new ClassMaker();
		
		System.out.println(cm.str);
		
		cm.a();
		
		cm.b();
		
		cm.c(123);
		
		System.out.println(cm.d(10, 20));
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값  * 123456
		//3. 2번의 결과값  / 123456
		//4. 3번의 결과값  - 654321
		//5. 4번의 결과값 % 123456
		
		Calculator cal = new Calculator();
		
//		double sum = cal.add(123456, 654321);
//		System.out.println(sum);
//		
//		double mul = cal.mul(sum, 123456);
//		System.out.println(mul);
//		
//		double div = cal.div(mul, 123456);
//		System.out.println(div);
//		
//		double sub = cal.sub(div, 654321);
//		System.out.println(sub);
//		
//		double mod = cal.mod(sub, 123456);
//		System.out.println(mod);
		
		double result = cal.add(123456, 654321);
		result = cal.mul(result,  123456);
		result = cal.div(result, 123456);
		result = cal.sub(result, 654321);
		result = cal.mod(result, 123456);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
