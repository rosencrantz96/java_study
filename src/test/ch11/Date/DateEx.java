package test.ch11.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date(); // 현재 날짜와 시간 생성 
		System.out.println(now); // Date객체
		String strNow1 = now.toString();
		System.out.println(strNow1); // 문자열 변경 (같은게 찍히지만 여기 찍히는 건 문자열임)
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 객체만 만들어둔 상태 (포맷 형태의 객체 생성)
		String strNow2 = sdf.format(now); // Date 객체를 넣어준다. 
		System.out.println(strNow2); // 문자열 변환되어서 우리가 포멧팅한 형태로 나온다. 
		
 				
		
	}

}
