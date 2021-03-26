package z_game2;

import java.util.Scanner;

import e_oop.ScanUtil;

public class MyGame {

	public static void main(String[] args) {
		new MyGame().start();
	}
	
	Character myChar;
	Opening opening;
	
	void start(){
		//오프닝 화면
		
				//1. 시작하기 2. 종료
				opening.opening();
				System.out.println("1.시작하기\t2.종료");
				Scanner sc = new Scanner(System.in);
				int start = sc.nextInt();
				
				if (start == 2) {
					Opening.gameover();
				}
				
				//캐릭터 선택창
				//1. 아이언 클래드 2. 사일런트 3. 와쳐
				
				while(true){
					System.out.println("원하는 캐릭터를 선택해주세요>");
					System.out.println("1.아이언 클래드 (HP120 ATT15 DEF5)");
					System.out.println("2.사일런트 (HP100 ATT18 DEF5)");
					System.out.println("3.와쳐 (HP95 ATT20 DEF5)");
					int selectChar = sc.nextInt();
					
					myChar = Character.getCharacter(selectChar);
					if (myChar != null) {
						break;
					}else{
						System.out.println("1~3의 숫자를 입력해주세요>");	
					}
				}
				System.out.println(myChar.name + "를 선택하셨습니다!");
				
				//시작 유물을 준다
				//1. 최체 10 2. 공 10 3. 방 10
				StartRelic startRelic = StartRelic.getRelic();
				System.out.println("---------------------------------------");
				System.out.println("시작 유물로 " + startRelic.name + "을 획득했습니다!");
				System.out.println(startRelic.itemInfo());
				
				myChar.relicEffect(startRelic); 
				
				//갈래길 선택
				//1.전투 2.상점 3.휴식
				int input = 0;
				while(true){
					System.out.println("1.내정보\t2.사냥\t3.상점\t4.휴식\t5.종료");
					input = ScanUtil.nextInt();
					
					switch (input) {
					case 1:
						myChar.showInfo();
						break;
						
					case 2:
						hunt();
						break;
						
					case 3:
//						shop();
						Shop shop = new Shop();
						System.out.println("보유 코인 : " + myChar.coin);
						shop.showItem();
						int num = 0;
						boolean lack = true;
						while(lack) {
							num = ScanUtil.nextInt();
							if (num == 0) {
								System.out.println("상점을 떠납니다.");
								break;
							}
							lack = shop.buyItem(myChar, num);
						}
							
						break;
						
					case 4:
						myChar.sleep();
						break;
						
					case 5:
						Opening.gameover();
					}
				}
				
				
				//갈래길 1~9 - 전투
				//전투 -> exp 획득 (레벨업)
				
				//10층 - 보스전
				//보스몹
				
				//엔딩 화면
				
			}
	
	void hunt(){
		Monster m = Monster.getMonster();
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				myChar.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "을(를) 처치하였습니다.");
					myChar.getExp(m);
					myChar.getCoin(m);
					break battle;
				}
				m.attack(myChar);
				if(myChar.hp <= 0){
					Opening.gameover();
				}
				break;
				
			case 2:
				break battle;
			}
		}
	}
	
//	void shop(){
//		Item item = Item.
//	}
	
}
