package e_oop.score;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int)(Math.random() * 101);
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
			student.sum = student.kor + student.eng + student.math;
			student.avg = student.sum / 3.0;
			
			students[i] = student;
			
//			System.out.println(student.name);
		}
		
		//성적관리 프로그램을 완성해주세요.
		String[] subs = {"국어", "영어", "수학"};
		int scores[][] = new int[students.length][subs.length];
				
		//학생합계 및 평균
		for (int i = 0; i < students.length; i++) {
			students[i].sum = students[i].kor + students[i].eng + students[i].math; 
			students[i].avg = Math.round((double)students[i].sum / 3.0 * 100) / 100.0;
		}
		
		
		
		//석차구하기
		int[] rank = new int[students.length];
		for (int i = 0; i < scores.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < scores.length; j++) {
				if (students[i].sum < students[j].sum) {
					rank[i]++;
				}
			}
		}
		
			
		
		//석차순으로 정렬
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if(students[j].sum > students[min].sum) {
					min = j;
				}
			}
			
			
			
			int temp2 = students[i].sum;
			students[i].sum = students[min].sum;
			students[min].sum = temp2;
			
			double temp3 = students[i].avg;
			students[i].avg = students[min].avg;
			students[min].avg = temp3;
			
			int temp4 = rank[i];
			rank[i] = rank[min];
			rank[min] = temp4;
			
			String temp5 = students[i].name;
			students[i].name = students[min].name;
			students[min].name = temp5;
		}
		
		
		
		
		//과목 출력
		for (int i = 0; i < subs.length; i++) {
			System.out.print("\t" + subs[i]);
		}
		System.out.println("\t합계\t평균\t석차");
			
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].name + "\t" + students[i].kor + "\t" + students[i].eng + "\t" + students[i].math + "\t");
			System.out.println(students[i].sum + "\t" + students[i].avg + "\t" + rank[i]);
		}
		
		System.out.print("과목합계\t");
		int sumKor = 0, sumEng = 0, sumMath = 0;
		for (int i = 0; i < students.length; i++) {
			sumKor += students[i].kor;
			sumEng += students[i].eng;
			sumMath += students[i].math;
		}
		System.out.println(sumKor + "\t" + sumEng + "\t" + sumMath);
		
		double avgKor = 0, avgEng = 0, avgMath = 0;
		System.out.print("과목평균\t");
		for (int i = 0; i < students.length; i++) {
			avgKor = Math.round((double)sumKor / students.length * 100) / 100.0;
			avgEng = Math.round((double)sumEng / students.length * 100) / 100.0;
			avgMath = Math.round((double)sumMath / students.length * 100) / 100.0;
		}
		System.out.println(avgKor + "\t" + avgEng + "\t" + avgMath);
		
		
		
		
		
		

	}

}
