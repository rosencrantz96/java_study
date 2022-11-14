package test.ch05;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class ArrayEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3]; // 데이터는 없지만 일단 방 3개를 만들어 둔 것! 3개의 데이터만 넣을 수 있다. 
		
		/*
		 	<초기값!>
		  int, short, byte: 0
		  long: 0L
		  char: '\u0000'
		  float: 0.0f
		  double: 0.0
		  boolean: false
		  
		  String: null(클래스는 초기값이 null)
		*/
		
		for (int i=0; i<3; i++) {
//			System.out.println(arr1[i]);
			arr1[i] = 10;
		}
		
		for (int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];
		
		for (int i=0; i<3; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = new String[3];

		for (int i=0; i<3; i++) {
			System.out.println(arr3[i]);
		}
		
//		arr3.length = 10; length는 값을 읽을 수만 있다.
		
		
		/*
//		String[] season = {"Spring", "Summer", "Fall", "Winter"};
//		String season2[]; // 값이 없는 상태로 배열만 우선 선언할 수 있다. 
		String season[] = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();
		
		int[] scores = { 83, 90, 87};
		
		// 총합, 평균 구하기 
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		double avg = (double) sum/3;
		
		System.out.println(sum);
		System.out.println(avg);
		*/
	}

}
