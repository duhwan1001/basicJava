package d_array;

import java.util.Arrays;

public class Programmers {

	public static void main(String[] args) {
		
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100);
		}
		System.out.println(Arrays.toString(numbers));

		int limit = 0;
		for (int i = 0; i < numbers.length; i++) {
			limit += i;
		}
		System.out.println(limit);
		
		int[] temp = new int[limit]; 
		int count = 0;
		boolean zerochk = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
					int sum = 0;
					sum = numbers[i] + numbers[j];
					if (sum == 0) zerochk = true;
					boolean flag = false;
					for (int k = 0; k < temp.length; k++) {
						if(temp[k] == sum) flag = true;
					}
					if(!flag) temp[count++] = sum;
				}
		}
		System.out.println(Arrays.toString(temp));
		
		if (zerochk) count++;
		System.out.println(count);
		
		int[] answer = new int[count];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp[i];
		}
		System.out.println(Arrays.toString(answer));
		
		for (int i = 1; i < answer.length; i++) {
			int temp2 = answer[i];
			int j = 0;
			for (j = i - 1; j >= 0; j--) {
				if(temp2 < answer[j]) {
					answer[j + 1] = answer[j];
				}else break;
			}
			answer[j + 1] = temp2;
				
		}
		System.out.println(Arrays.toString(answer));
		
		
		
		
		/*
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		
		int[] temp = new int[10000];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
					int sum = 0;
					sum = numbers[i] + numbers[j];
					boolean flag = false;
					for (int k = 0; k < temp.length; k++) {
						if(temp[k] == sum) flag = true;
					}
					if(!flag) temp[count++] = sum;
				}
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(count);
		
		int[] answer = new int[count];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp[i];
		}
		System.out.println(Arrays.toString(answer));
		*/
		
		
		
	}

}
