package e_oop;

public class TV {

	//과제. TV를 대상으로 클래스를 만들어주세요.
	/*
	 * - 대상이 가지고 있는 속성을 변수로 만들기
	 * - 전원, 채널, 볼륨 <- 변경하고 싶은 속성들을 변수로 만들기
	 * 
	 * - 전원 껐다켰다, 채널 변경, 볼륨 변경 등을 메서드로 만들기 <- 리모컨의 버튼이 메서드가 된다고 생각
	 * - 리모컨의 전원버튼(전원을 키기도 하고 끄기도 하는 메서드)
	 * - 채널(채널변경하는 메서드 - 숫자키, 올리기, 내리기)
	 * - 볼륨(올리는 메서드, 내리는 메서드)
	 */
	
	boolean power = false;
	int channel = 100;
	int volume = 50;
	
	private int chMin = 0;		//fianl int MIN_CHANNEL = 0;
	private int chMax = 999;	//fianl int MAX_CHANNEL = 999;
	private int volMin = 0;		//fianl int MIN_VOLUME = 0;
	private int volMax = 100;	//fianl int MAX_VOLUME = 100;
	
	/*
	 * H_TV(){
	 * 	power = false;
	 * 	channel = 1;
	 * 	volume = 5;
	 * }
	 */
	
	
	//전원 On, Off
	void powerOn(){
		power = true;
		System.out.println("TV 전원이 켜집니다");
	}
	
	void powerOff(){
		power = false;
		System.out.println("TV 전원이 꺼집니다");
	}
	
	/**/
	
	
	//채널 : 숫자키, Up, Down (채널 000~999)
	void channelNum(int num){
		if (num < chMin || chMax <num) {
			System.out.println("채널은 0 ~ 999번 입니다. 다시 입력해 주세요.");
		} else {
			channel = num;
			System.out.println("채널 : " + channel + "번");
		}
	}
	
	void channelUp(){
		channel++;
		if (chMax < channel) {
			System.out.println("마지막 채널입니다");
			channel--;
		} else {
			System.out.println("채널 : " + channel + "번");
		}
	}
	
	void channelDown(){
		channel--;
		if (channel < chMin) {
			System.out.println("첫번째 채널입니다");
			channel++;
		} else{
			System.out.println("채널 : " + channel + "번");
		}
	}
	
	
	//볼륨 : Up, down (볼륨 0~100)
	void volumeUp(){
		volume++;
		if (volMax < volume) {
			System.out.println("최대 음량입니다");
			volume--;
		} else {
			System.out.println("볼륨 : " + volume);
		}
	}
	
	void volumeDown(){
		volume--;
		if (volume < volMin) {
			System.out.println("최소 음량입니다");
			volume++;
		} else {
			System.out.println("볼륨 : " + volume);
		}
	}
	
}
