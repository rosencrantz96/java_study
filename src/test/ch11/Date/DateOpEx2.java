package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx2 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(); // 현재 날짜 시간 
		
		// 데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd E HH:mm:ss");
		System.out.println("현재시간: " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1); // 1년을 더함 
		System.out.println(result1); // 포맷팅 전 결과로 출력되지만 암튼 바뀜 
		
		LocalDateTime result2 = now.minusMonths(2); // 2월을 뺌  
		System.out.println(result2.format(dtf)); // 얘는 포맷 한 뒤의 결과 
		
		LocalDateTime result3 = now.plusDays(7); // 7일을 더함  
		System.out.println(result3.format(dtf)); // 얘는 포맷 한 뒤의 결과 
		
	}

}
