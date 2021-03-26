package c_statement;

import java.util.Scanner;

public class BaseballAnswer {

	public static void main(String[] args) {
		/*
		 * 135 123 : 1S 1B 1O 531 : 1S 2B 0O 321 : 0S 2B 1O
		 * 
		 * 1~9 사이의 겹치지 않는 숫자 3개 발생하고 시작
		 */

		int a1 = 0;
		int a2 = 0;
		int a3 = 0;

		do {
			a1 = (int) (Math.random() * 9) + 1;
			a2 = (int) (Math.random() * 9) + 1;
			a3 = (int) (Math.random() * 9) + 1;
		} while (a1 == a2 || a1 == a3 || a2 == a3);

		Scanner sc = new Scanner(System.in);

		int count = 0;
		while (true) {
			System.out.println("3가지 숫자>");
			int input = Integer.parseInt(sc.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;

			int strike = 0;
			int ball = 0;
			int out = 0;

			if (a1 == i1)
				strike++;
			if (a2 == i2)
				strike++;
			if (a3 == i3)
				strike++;

			if (a1 == i2 || a1 == i3)
				ball++;
			if (a2 == i1 || a2 == i3)
				ball++;
			if (a3 == i1 || a3 == i2)
				ball++;

			out = 3 - strike - ball;

			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
					+ strike + "S " + ball + "B " + out + "O");
			if (strike == 3) {
				System.out.println("정답입니다!");
				break;
			}

		}

	}

}