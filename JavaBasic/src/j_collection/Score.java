package j_collection;

import java.util.ArrayList;

import d_array.Array;

public class Score {

	public static void main(String[] args) {

		//학생 및 과목 생성
		ArrayList<String> names = new ArrayList();
		names.add("강건우");
		names.add("공슬기");
		names.add("김두환");
		names.add("김민지");
		names.add("김이현");
		names.add("김현슬");
		names.add("김현태");
		names.add("명민호");
		names.add("박상영");
		names.add("정유진");
		
		ArrayList<String> subs = new ArrayList();
		subs.add("국어");
		subs.add("영어");
		subs.add("수학");
		subs.add("사회");
		subs.add("과학");
		subs.add("Oracle");
		subs.add("Java");
		
		//랜덤 스코어 생성
//		ArrayList<Integer> score = new ArrayList();
		ArrayList<ArrayList<Integer>> score2 = new ArrayList<>();
		
		for (int i = 0; i < names.size(); i++) {
			ArrayList<Integer> score = new ArrayList();
			for (int j = 0; j < subs.size(); j++) {
				score.add((int)(Math.random() * 101));
			}
			score2.add(score);
		}

		ArrayList<Integer> nameSum = new ArrayList<>();
		ArrayList<Double> nameAvg = new ArrayList<>();
		for (int i = 0; i < score2.size(); i++) {
			int sum = 0;
			double avg = 0;
			for (int j = 0; j < score2.get(i).size(); j++) {
				sum += score2.get(i).get(j);
			}
			avg = Math.round((double)sum / subs.size() * 100) / 100.0;
			nameSum.add(sum);
			nameAvg.add(avg);
		}
		
		ArrayList<Integer> subSum = new ArrayList<>();
		ArrayList<Double> subAvg = new ArrayList<>();
		for (int i = 0; i < score2.get(i).size(); i++) {
			int sum = 0;
			double avg = 0;
			for (int j = 0; j < score2.size(); j++) {
				sum += score2.get(j).get(i);
			}
			avg = Math.round((double)sum / names.size() * 100) / 100.0;
			subSum.add(sum);
			subAvg.add(avg);
		}
		
		ArrayList<Integer> rank = new ArrayList<>();
		for (int i = 0; i < score2.size(); i++) {
			int ranks = 1;
			rank.add(1);
			for (int j = 0; j < score2.size(); j++) {
				if(nameSum.get(i) < nameSum.get(j)) {
					ranks = rank.get(i);
					ranks++;
					rank.set(i, ranks);
				}
			}
		}
		
		//석차순으로 정렬
		for (int i = 0; i < nameSum.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nameSum.size(); j++) {
				if(nameSum.get(j) > nameSum.get(min)){
					min = j;
				}
			}
			ArrayList<Integer> temp = score2.get(i);
			score2.set(i, score2.get(min));
			score2.set(min, temp);
			
			int temp2 = nameSum.get(i);
			nameSum.set(i, nameSum.get(min));
			nameSum.set(min, temp2);
			
			double temp3 = nameAvg.get(i);
			nameAvg.set(i, nameAvg.get(min));
			nameAvg.set(min, temp3);
			
			int temp4 = rank.get(i);
			rank.set(i, rank.get(min));
			rank.set(min, temp4);
			
			String temp5 = names.get(i);
			names.set(i, names.get(min));
			names.set(min, temp5);
			
			
			
			
			
		}
		
		
		
		
		


		
		
		
		
		
		

		
		
		
		//출력
		for (int i = 0; i < subs.size(); i++) {
			System.out.print("\t" + subs.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		
		for (int i = 0; i < score2.size(); i++) {
			System.out.print(names.get(i) + "\t");
			for (int j = 0; j < score2.get(i).size(); j++) {
				System.out.print(score2.get(i).get(j) + "\t");
			}
			System.out.println(nameSum.get(i) + "\t" + nameAvg.get(i) + "\t" + rank.get(i));
		}
		
		System.out.print("과목합계\t");
		for (int i = 0; i < subSum.size(); i++) {
			System.out.print(subSum.get(i) + "\t");
		}
		System.out.println();
		
		System.out.print("과목평균\t");
		for (int i = 0; i < subAvg.size(); i++) {
			System.out.print(subAvg.get(i) + "\t");
			
		}
		
	}

}
