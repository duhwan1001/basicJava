package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90	 	90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90	 	90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90	 	90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90	 	90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90	 	90		630		90.00	 1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */

		
		int[][] score = new int[24][11];	//전체 표 크기
		int[][] scores = new int[22][7]; 	//[학생수][과목수]
		int[] sum = new int[22]; 		//합계
		double[] avg = new double[22]; 	//평균
		int[] rank = new int[22];			//석차
		int[] subsum = new int[7];		//과목합계
		int[] subavg = new int[7];		//과목평균
				
		
		for (int i = 0; i < scores.length; i++) {				//점수랜덤
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 100) + 1;			
			}
//			System.out.println(Arrays.toString(scores[i]));		
		}
		
//		String subjects[] = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java", "합계", "평균", "석차"};
		String name[] = {"강건우", "공슬기", "김두환", "김민지", "김이현", "김현슬", "김현태", "명민호", "박상영",
						 "박예진", "변형균", "서주형", "유은지", "이광렬", "이휘로", "전윤주", "전재수", "정영인",
						 "정유진", "최영준", "최윤성", "현유진", "과목합계", "과목평균"};
//		
//		System.out.print("\t");	
//		for (int i = 0; i < subjects.length; i++) {
//			System.out.print(subjects[i] + " ");
//		}
//		System.out.println();
		
		System.out.println("\t국어\t영어\t수학\t사회\t과학\tOracle\t Java\t 합계\t 평균\t 석차");
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(name[i] + "\t");						//이름출력
			for (int j = 0; j < scores[i].length; j++) {			
				score[i+1][j+1] = scores[i][j];						//랜덤점수를 본 표에 대입
				sum[i] += scores[i][j];								//합계 산출
				System.out.print(score[i+1][j+1] + "\t");				//점수 출력
			}
			avg[i] = Math.round((double)sum[i] / 7 * 10) / 10.0;	//평균 산출
			System.out.print(sum[i] + "\t" +avg[i]);				//합계 및 평균 출력
			System.out.println();
		}
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				subsum[i] += score[i][j];
			}
		}
		
		System.out.println(Arrays.toString(subsum));
		
		
		
		
		
		
		 for (int i = 0; i < rank.length; i++) {
		 		rank[i] = 1;
		 }
		
		 for (int i = 0; i < rank.length; i++) {
		 		for (int j = 0; j < rank.length; j++) {
		 			if(avg[i] < avg[j]){
		 				rank[i]++;
		 			}
		 		}
		 }
		 System.out.println(Arrays.toString(rank));
		
			
		
		
//		//합계와 평균을 구해주세요.(평균은 소수점 1자리까지 표현해주세요.)
//		
//				for (int i = 0; i < scores.length; i++) {
//					for (int j = 0; j < scores[i].length; j++) {
//						sum[i] += scores[i][j];
//					}
//					avg[i] = Math.round((double)sum[i] / scores[i].length * 10) / 10.0;	//배열 길이로 나누기★
//																						//소수점 첫째 자리까지 구하기★
//				}
//					
//				System.out.println("합계 : " + Arrays.toString(sum) + " / 평균 : " + Arrays.toString(avg));
		
		
		
		
		
		
		
		
	
	
	}

}
