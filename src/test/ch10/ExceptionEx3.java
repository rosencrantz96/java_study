package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100", "1ㅇㅇ"};
		
		for (int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); // Integer.parseInt: int형 데이터로 바꿔줌 (형변환)
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) { // 배열에서 인덱스의 범위를 벗어나는 오류 (ctrl + space 단축키로 선택)
				e.printStackTrace();
			} catch (NumberFormatException e) { // 형변환 오류 (int형으로 못 바꾼다 ㅠ), 
				// NumberFormat 생략해도 똑같은 결과 출력함 (Exception의 하위에 있는 클래스라서! 하지만 상위 클래스가 먼저 검사되면 안된다.)
				e.printStackTrace();
			}
		}
	}

}
