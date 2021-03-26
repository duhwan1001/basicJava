package e_oop.score2;

import java.util.Arrays;

public class ScoreProgram {
	
	public static void main(String[] args) {
	
		Student[] students = new Student[10];
		
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			
			student.ran(i);
			students[i] = student;
		}
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].nameSum() < students[j].nameSum()) {
					students[i].rank++;
				}
			}
		}
		
		for(int i = 0; i < students.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < students.length; j++){
				if(students[j].nameSum() > students[min].nameSum()){
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;
		}
		
		System.out.println("\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){
			students[i].print();
		}
		
		int[] subSum = new int[3];
		double[] subAvg = new double[3];
		for(int i = 0; i < students.length; i++){
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		subAvg[0] = subSum[0] / students.length;
		subAvg[1] = subSum[1] / students.length;
		subAvg[2] = subSum[2] / students.length;
		System.out.print("과목합계\t");
		for(int i = 0; i < subSum.length; i++){
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for(int i = 0; i < subAvg.length; i++){
			System.out.print(subAvg[i] + "\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
