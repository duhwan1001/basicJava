package e_oop;

public class StaticTest {
	
	static int classVar;	//클래스 변수
	int instanceVar;		//인스턴스 변수

	public static void main(String[] args) {
		System.out.println(classVar);
		System.out.println(new StaticTest().instanceVar); //객체생성을 통해 메모리로 올리고 인스턴스 변수 사용 가능해짐
		
		StaticTest st = new StaticTest();
		System.out.println(st.instanceVar);	//위의 new StaticTest(). 와 같은 것
		
		
	}
	
	void instanceMethod(){	//인스턴스 메서드
		System.out.println(classVar);
		System.out.println(instanceVar);
	}

}
