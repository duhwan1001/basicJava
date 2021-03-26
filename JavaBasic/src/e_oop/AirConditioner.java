package e_oop;

public class AirConditioner {

	/*
	 * 과제. 임의의 사물을 대상으로 클래스를 만들어주세요.
	 * 사물이 가지고 있는 속성을 변수로 만들고,
	 * 변수와 관계된 동작들을 메서드로 만들어주시면 됩니다.
	 */
	
	//에어컨 리모컨
	
	boolean power;
	int temperature;
	int airvolume;
	int airdirection;
	int mode;
	boolean clean;
	
	final int MIN_TEMPERATURE = 18;
	final int MAX_TEMPERATURE = 30;
	final int MIN_AIRVOLUME = 0;
	final int MAX_AIRVOLUME = 10;
	
	AirConditioner(){
		power = false;
		temperature = 20;
		clean = false;

		
		
		
	}
	
	void power() {
		power = !power;
		System.out.println(power ? "에어컨 전원 켜짐" : "에어컨 전원 꺼짐");
	}
	
	void clean() {
		clean = !clean;
		System.out.println(clean ? "자동청소 모드 켜짐" : "자동청소 모드 꺼짐");
	}
	
//	void changeTemp(int temperature){
//		if(power){
//			if(MIN_TEMPERATURE <= temperature && temperature <= MAX_TEMPERATURE){
//				this.temperature = temperature;
//			}
//			System.out.println("설정온도 : " + this.temperature);
//		}
//	}
	
	void tempUp(){
		if(power){
			if(temperature < MAX_TEMPERATURE){
				temperature++;
			}
			System.out.println("설정온도 : " + temperature);
		}
	}
	
	void tempDown(){
		if(power){
			if(MIN_TEMPERATURE < temperature){
				temperature--;
			}
			System.out.println("설정온도 : " + temperature);
		}
	}
	
	void changeDir(int dir){
		switch (dir) {
		case 1: System.out.println("좌우풍향 ON"); break;
		case 2: System.out.println("좌우풍향 OFF"); break;
		case 3: System.out.println("상하풍향 ON"); break;
		case 4: System.out.println("상하풍향 OFF"); break;
		case 5: System.out.println("상하좌우풍향 ON"); break;
		case 6: System.out.println("상하좌우풍향 OFF"); break;
		}
	}
	
	void changeMode(int mode){
		switch (mode) {
		case 1: System.out.println("냉방"); break;
		case 2: System.out.println("난방"); break;
		case 3: System.out.println("송풍"); break;
		case 4: System.out.println("제습"); break;
		case 5: System.out.println("공기청정"); break;
		}
	}
	
	void airUp(){
		if(power){
			if(airvolume < MAX_AIRVOLUME){
				airvolume++;
			}
			showAir();
		}
	}
	
	void airDown(){
		if(power){
			if(MIN_AIRVOLUME < airvolume){
				airvolume--;
			}
			showAir();
		}
	}
	
	void showAir(){
		System.out.print("풍속. ");
		for(int i = MIN_AIRVOLUME + 1; i <= MAX_AIRVOLUME; i++){
			if(i <= airvolume){
				System.out.print("▶");
			} else {
				System.out.print("▷");
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		AirConditioner air = new AirConditioner();
		
		while(true){
			System.out.println("-------------샘숭에어컨-------------");
			System.out.println( "1.전원     2.모드     3.온도▲   4.온도▼" );
			System.out.println( "5.풍향    6.풍속▲  7.풍속▼   8.자동청소" );
			System.out.println("---------------------------------");
			System.out.println("번호 입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: air.power(); break;
			
			case 2:
				System.out.println("모드 선택(1~5)>");
				System.out.println("1.냉방 2.난방 3.송풍 4.제습 5.공기청정");
				int md = ScanUtil.nextInt();
				air.changeMode(md);
				break;
				
			case 3: air.tempUp(); break;
			case 4: air.tempDown(); break;
			
			case 5:
				System.out.println("풍향 선택>");
				System.out.println("1.좌우ON 2.좌우OFF 3.상하ON 4.상하OFF");
				System.out.println("5.상하좌우ON 6.상하좌우OFF");
				int dr = ScanUtil.nextInt();
				air.changeDir(dr);
				break;
				
			case 6: air.airUp(); break;
			case 7: air.airDown(); break;
			
			case 8: air.clean(); break;
			
			default:
				System.out.println("종료합니다.");
				System.exit(0);
				break;
				
				
				
				
				
				
			}
		}
	}
}
