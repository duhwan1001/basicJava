package e_oop;

import java.util.Scanner;

public class TvRemoteControl {

	public static void main(String[] args) {

		TV tv = new TV();
		
		tv.powerOn();
		
		Scanner s = new Scanner(System.in);
		System.out.println("채널을 입력해 주세요");
		int num = s.nextInt();

		while (num < 0 || 999 < num) {
			tv.channelNum(num);
			num = s.nextInt();
		}
		tv.channel = num;
		System.out.println("채널 : " + num + "번");
		
		tv.channelUp();
		
		tv.volumeDown();
		
		tv.powerOff();
		
	}

}
