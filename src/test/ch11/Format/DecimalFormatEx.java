package test.ch11.Format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###"); // 포맷을 정한다.
		System.out.println(df.format(num)); // 포맷을 적용.

		df = new DecimalFormat("#,###.0"); // 정수 10진수, 소수점 출력하겠다는 의미 
		System.out.println(df.format(num)); 
	}

}
