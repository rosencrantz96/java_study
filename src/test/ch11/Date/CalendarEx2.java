package test.ch11.Date;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx2 {

	public static void main(String[] args) {
		// 타임존 객체 생성 
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar now = Calendar.getInstance(timeZone); // 타임존 시간과 날짜를 가져온다. 
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day= now.get(Calendar.DAY_OF_MONTH); // 일
		int week= now.get(Calendar.DAY_OF_WEEK); // 요일 일요일:1 ~ 토요일:7
		
		System.out.print(year);
		System.out.print("년 ");
		System.out.print(month);
		System.out.print("월 ");
		System.out.print(day);
		System.out.print("일 ");
//		System.out.print(week);

		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY: strWeek = "월 "; break; 		
		case Calendar.TUESDAY: strWeek = "화 "; break; 		
		case Calendar.WEDNESDAY: strWeek = "수 "; break; 		
		case Calendar.THURSDAY: strWeek = "목 "; break; 		
		case Calendar.FRIDAY: strWeek = "금 "; break; 		
		case Calendar.SATURDAY: strWeek = "토 "; break; 		
		case Calendar.SUNDAY: strWeek = "일 "; break; 		

		}
		
		System.out.println(strWeek);
		System.out.println("=================");
		int amPm = now.get(Calendar.AM_PM); // am, pm인지 나타내준다. (0:am, 1:pm)
//		System.out.println(amPm); // 0
		
		if(amPm == Calendar.AM) { // Calender.AM과 값이 같은지 다른지를 비교해서 오전/오후를 구분하는 것이다. 
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}
		
		System.out.println(now.get(Calendar.HOUR) + ", " + now.get(Calendar.MINUTE) + ", " + now.get(Calendar.SECOND));
		
		// HOUR: 오전/오후 기준(0~11)
	}
	
}
