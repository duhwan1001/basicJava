package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int yCount = 0;
		String answer;

		System.out.println("아침을 배불리 먹을 후 점심시간 전에 배가 고프다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("정말 배고프지 않더라도 먹을 때가 있다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못 간다>");
		answer = sc.nextLine();
		if (answer.equals("Y")) {
			yCount++;
		}
		System.out.println("자가테스트 결과 Y는 총 " + yCount + "개 입니다.");
		
		if (yCount == 3) {
			System.out.println("주의! 위험한 수준은 아니지만 관리 필요");
		} else if (4 <= yCount && yCount <= 6) {
			System.out.println("위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
		} else if (7 <= yCount) {
			System.out.println("중독! 전문의 상담이 필요함");
		}

	}
}
