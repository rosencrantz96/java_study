package test.ch11.test11;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		String data = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(data, ",");
			
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
	
}
