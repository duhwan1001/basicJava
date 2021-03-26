package e_oop.score2;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int rank;

	void ran (int i) {
		name = "학생" + (i + 1);
		rank = 1;
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
	}
	
	int nameSum() {
		return kor + eng + math;
	}
	
	double nameAvg() {
		return Math.round(nameSum() / 3.0 * 100) / 100.0;
	}
		
	void print() {
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(nameSum() + "\t");
		System.out.print(nameAvg() + "\t");
		System.out.print(rank + "\t");
		System.out.println();
	}
	


}



	
	
	
	
	
	

