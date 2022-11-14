package test.ch05;

import java.util.Calendar;

public class WeekEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null; // enum에 작성한 Week임!
		
		// 자바에서 제공해주는 라이브러리 (임포트 해줘야 함)
		Calendar cal = Calendar.getInstance();
		
		// 요일을 숫자로 얻는다. (week에 요일이 숫자 형태로 주어짐.) 
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입. (아까 이넘에서 만들어준 열거 상수들)
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUSEDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		// 저장해둔 열거 상수 그대로 불러와서 쓰면 됨. 
		if (today == Week.SUNDAY) {
			System.out.println("일요일 입니다.");
		} else {
			System.out.println("일요일이 아닙니다.");
		}
	}

}
