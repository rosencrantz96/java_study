package test.ch06.question;

public class Example2 {
	
	public static int max(int[] arr) { // 배열을 매개변수로 받는 방법! 
		// 주어진 배열이 null이거나 크기가 0인 경우 -999999 반환 
		if (arr == null || arr.length == 0) {
			return -999999;
		} 
		
		// 주어진 int형의 배열 값 중에서 가장 큰 값을 반환
		int max = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} // 배열 값이랑 비교 
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}
	

}
