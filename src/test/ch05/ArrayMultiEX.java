package test.ch05;

import java.util.Iterator;

public class ArrayMultiEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] scores = { 10, 90, 10};

		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };
		int[][] mathScores = new int[2][3];

		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("수학점수: " + mathScores[i][k]);
//				mathScores[i][k] = 80; // for문으로 데이터 넣어주는 방법. 근데 여기선 전부 80만 찍힘.
			}
		}

		/*
		 * int[][] mathScores = { { 80, 81, 82 }, { 83, 84, 85 } };
		 */

		// 데이터를 개별로 넣어주는 방법

		mathScores[0][0] = 80;
		mathScores[0][1] = 81;
		mathScores[0][2] = 82;
		mathScores[1][0] = 83;
		mathScores[1][1] = 84;
		mathScores[1][2] = 85;

		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);

		System.out.println("첫 번째 반의 세 번째 학생: " + scores[0][2]);
		System.out.println("두 번째 반의 두 번째 학생: " + scores[1][1]);

		// 첫 번째 반의 평균 점수
		int class1Sum = 0;

		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i]; // 첫 번째 반의 점수를 다 더해주는 코드 (일단 첫 번재 반의 배열을 가지고 온 후 누적합산을 해주면 된다.)
		}

		double class1Avg = (double) class1Sum / scores[0].length; // 나누기니까 double로 형변환!
		System.out.println("첫 번째 반의 평균: " + class1Avg);

		// 두 번째 반의 평균 점수
		int class2Sum = 0;

		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i]; // 첫 번째 반의 점수를 다 더해주는 코드 (일단 첫 번재 반의 배열을 가지고 온 후 누적합산을 해주면 된다.)
		}

		double class2Avg = (double) class2Sum / scores[1].length; // 나누기니까 double로 형변환!
		System.out.println("두 번째 반의 평균: " + class2Avg);

		// 전체 학생의 평균 점수
//		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };

		int totalStudent = 0;
		int totalSum = 0;

		for (int i = 0; i < scores.length; i++) { // score 큰 배열의 length를 가져옴! (1반, 2반 데려옴)
			totalStudent += scores[i].length; // 학생의 숫자를 가져오게 되는 것! (인덱스 0일 때 length는 3, 인덱스 1일 때는 2니까 결국 학생 수 5명을 구하게
												// 되는 것.)

			for (int k = 0; k < scores[i].length; k++) { // scores 속의 배열의 length를 가져옴. (반 학생들의 점수)
				totalSum += scores[i][k]; // 점수를 합산
			}

			double totalAvg = (double) totalSum / totalStudent; // 나누기니까 double로 형변환!
			System.out.println("전체 학생 평균: " + totalAvg);

		}

	}

}
