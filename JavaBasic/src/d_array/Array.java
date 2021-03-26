package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열 - 여러 개의 값을 하나의 변수에 저장해서 사용하는 것이다. - 참조형 타입이다. - 인덱스로 값을 구분한다. -
		 * 길이를 변경할 수 없다.
		 */
		// 같은 타입의 데이터만 묶을 수 있다.

		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
							// int 5개를 저장할 공간을 만들겠다.
		// 배열 초기화시 기본값이 저장된다.
		/*
		 * 기본값 : 내가 저장하지 않았을 때 저장되는 값 byte, short, int, long : 0 float, double :
		 * 0.0 char : ' '(0) boolean : false 참조형 : null
		 */

		/*
		 * 변수 = 주소 주소{0, 0, 0, 0, 0}
		 */

		array = new int[] { 1, 2, 3, 4, 5 };

		// array = {1, 2, 3, 4, 5}; //선언과 초기화를 동시에 해야한다.

		int[] array2 = { 1, 2, 3, 4, 5 };

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * 10;
			System.out.println(array[i]);
		}

		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		
		int[] randoms = new int[10];
		
		//배열의 모든 인덱스에 1~100 사이의 랜덤한 값을 저장해주세요.
		
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(randoms));
		
		//배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		
//		구하고 싶은 것이 있으면 우선 변수로 만들 것
		
		int sum = 0;
		for (int i = 0; i < randoms.length; i++) {
			sum += randoms[i];
		}
		double avg = Math.round((double)sum / randoms.length * 10) / 10.0;
		
		System.out.println("합계 : " + sum + "/ 평균 : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
				
		int max = randoms[0];
		int min = randoms[0];
		for (int i = 0; i < randoms.length; i++) {
			if (randoms[i] > max) {
				max = randoms[i];
			}
			if (randoms[i] < min) {
				min = randoms[i];
			}
		}
		System.out.println("최대값 : " + max + " / 최소값 : " + min);

		
		int[] shuffle = new int[10];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어주세요.
		//랜덤 인덱스와 0번 인덱스의 자리를 바꿔주세요. (여러번 반복)
		
		for (int i = 0; i < shuffle.length * 10; i++) {
			int ran = (int)(Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[ran];
			shuffle[ran] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 랜덤값을 500번 생산하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		/*
		int[] count = new int[10];
		
		for (int i = 0; i < 500; i++) {
			int ran2 = (int)(Math.random() * 10) + 1;
			count[ran2 - 1] = count[ran2 - 1] + 1;
		}
		System.out.println(Arrays.toString(count));
		*/

		int[] counts = new int[10];
		
		for (int i = 0; i < 500; i++) {
			int random = (int)(Math.random() * 10) + 1;
			counts[random - 1]++;
		}
		System.out.println(Arrays.toString(counts));
		
		
		
		
		
		
		
		
		
		
		
	}

}
