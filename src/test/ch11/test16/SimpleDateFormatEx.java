package test.ch11.test16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		Date now = new Date(); // 현재 날짜와 시간 생성 
//		System.out.println(now);
//		String strNow1 = now.toString();
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분"); // 객체만 만들어둔 상태 (포맷 형태의 객체 생성)
		String strNow2 = sdf.format(now); // Date 객체를 넣어준다. 
		System.out.println(strNow2); // 문자열 변환되어서 우리가 포멧팅한 형태로 나온다. 
	}
}
