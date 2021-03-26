package e_oop;

public class ClassMaker2 {
	
	//인스턴스변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int a = 10;
	String name = "홍길동";
	
	//위에서 선언한 인스턴스변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		a = 20;
	}
	
	{
		name = "정유진";
	}
	
	//위에서 선언한 인스턴스변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int a) {
		this.a = 30;
	}
	
	ClassMaker2(String name){
		this.name = name;
	}
	
	//위에서 선언한 인스턴스변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(int a, int b) {
		this.a = 40;
	}
	
	ClassMaker2(){
		this("홍길동");
	}
	
	//명시자 초기화부터 시작하여 생성자 초기화로 오기 때문에 마지막 생성자에 의해서 초기화
	//초기화 순서 : 명시적 초기화 -> 초기화 블럭 -> 생성자
	
	public static void main(String[] args) {
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.name);
		
		ClassMaker2 cm2 = new ClassMaker2("김이현");
		System.out.println(cm2.name);
	}
	

}
