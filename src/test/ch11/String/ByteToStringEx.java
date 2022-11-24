package test.ch11.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		
		byte[] arr1 = data.getBytes("UTF-8"); // utf-8 로 인코딩
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1)); // 배열을 문자열로 바꾼다.
		
		String str1 = new String(arr1, "UTF-8"); // utf-8로 디코딩 (String 문자로 변환)
		System.out.println(str1); // 배열을 문자열로 바꾼다.

	}

}
