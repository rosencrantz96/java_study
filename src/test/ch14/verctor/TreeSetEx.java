package test.ch14.verctor;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx { // 정렬에 적합함 

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 데이터 추가 
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
		for (Integer s : scores) {
			System.out.println(s + " "); // 자동으로 정렬이 된다. (오름차순)
		} 
		System.out.println();
		
		System.out.println("가장 낮은 값: " + scores.first());
		System.out.println("가장 높은 값: " + scores.last());
		System.out.println("5보다 작은 값: " + scores.lower(5)); // 작은 값 하나만 찍음
		System.out.println("5보다 큰 값: " + scores.higher(5)); // 큰 값 하나만 찍음 
		
		System.out.println();
		// 내림차순       
		NavigableSet<Integer> desc = scores.descendingSet();
		for (Integer s : desc) {
			System.out.println(s + " ");
		}
		System.out.println(" ");
		
		// 범위 검색 (5 <= )
		// tailSet(값, boolean): 주어진 값보다 높은 값을 가져온다. (boolean은 해당 값을 포함 하는지, 포함하지 않는지. true: 포함, false: 미포함)
		NavigableSet<Integer> rangSet = scores.tailSet(5, true);
		for (Integer s : rangSet) {
			System.out.println(s);
		}
		System.out.println();
		
		// 범위 검색 (4 <= score < 9)
		NavigableSet<Integer> rangeSet = scores.subSet(4,true, 9, false);
		for (Integer s : rangeSet) {
			System.out.println(s + "");
		}
		
	}

}
