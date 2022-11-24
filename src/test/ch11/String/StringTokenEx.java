package test.ch11.String;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr  =  data1.split("&|,"); // & 또는(|) , 에서 끊어주겠다는 의미, 그리고 배열에 넣어줌 
		for(String token : arr) {
			System.out.println(token);
		}
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/"); // /구분자로 나눠주겠다는 의미 
		System.out.println(st.countTokens());
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}
