package test.ch11.Math;

public class RandomEx {

	public static void main(String[] args) {
		// 0.0 ~ 1.0 사이의 숫자 출력 (소수, double타입)
		System.out.println(Math.random());
		
		int n = 9; // n(여기선 9)개의 정수: 1부터 9개의 정수를 얻겠다. (내가 얻고 싶은 정수의 개수) 
		int start = 1; // 시작하는 숫자 
		int num = (int) (Math.random() * n) + start;

		System.out.println(num);
	}

}
