package test.ch01_2;


public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동형변환!! 
//		byte byteValue = 10;
//		int intValue = byteValue; // 크기가 작은 byte가 int로 변환된다...? 
//		System.out.println(intValue);
//		
//		char charValue = '가'; // 유니코드 44032
//		intValue = charValue; 
//		System.out.println(intValue); // 44032 출력 
//		
//		intValue = 50;
//		long longValue = intValue;
//		System.out.println(longValue); // 50 출력 (long이 허용 범위가 더 크기 때문에?)
//		
//		longValue = 100;
//		float floatValue = longValue; 
//		System.out.println(floatValue); // 100.0 출력 (float가 허용 범위가 더 크기 때문에 잘 찍힌대요...!) 
//		// 근데 쌤은 100이 출력, 나는 100.0이 출력 되는 이유는 멀까? 
//		
//		floatValue = 100.5f;
//		double doubleValue = floatValue;
//		System.out.println(doubleValue); // 100.5 출력 (형 변환이 자동으로 되기 때문에 여기까지는 문제 없이 출력 되는 것임!!) 
		
		// 자동형변환 예외!! 
		// char 타입의 허용 범위는 음수 포함하지 않음. byte는 음수가 있기 때문에 아래처럼 하면 에러가 납니다. 
//		byte test = 60;
//		char charValue = test;

		// short와 char도 같은 범위에 있지만 안 된다! 에러 남. (short도 음수를 포함하고 있어서!) 
//		short a = 1;
//		char b = a;
		
		// 강제형변환!! (자료 손실 발생함)
//		int intValue = 103029770;
//		byte byteValue = (byte)intValue; 
//		
//		System.out.println(byteValue); // 값이 잘려서 출력됨. byte는 int만큼 큰 자료를 값을 담을 수 없어서. 
//		
//		long var1 = 300;
//		int var4 = (int)var1;
//		System.out.println(var4);
//
//		int var5 = 65;
//		char var6 = (char)var5;
//		System.out.println(var6);
//		
//		double var7 = 3.14; 
//		int var8 = (int)var7;
//		System.out.println(var8);
		
		byte x = 10;
		byte y = 20;
		// 연산식에서 자바는 자동형변환이 되기 때문에 강제형변환을 시켜줘야 함. 안그럼 에러남 ㅠ
		// byte result = x + y; <- 에러
//		byte result = (byte) (x + y);
		int result = x + y;
  		
		// 여러 데이터타입을 연산하려면 가장 큰 타입으로 연산을 해줘야 합니다. 
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L; 
		long result3 = v3 + v4 + v5; 
	
		char v6 = 'A'; // 65
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println(result4); // 66 
		System.out.println((char)result4); // 강제문자형변환해서 B 
		
		int v8 = 10;
		int result5 = v8 / v4; // 정수 연산의 결과는 항상 정수 
		
		System.out.println(result5);
		
		int v9 = 10;
//		double result6 = 10 / 4; // 2.0
		double result6 = v9 / 4.0; // 2.5 (4랑 4.0이랑 결과 다름! 이유- 정수의 연산 결과는 항상 정수이기 때문에?)
		System.out.println("값1" + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = v10 / v11; // 0.0 
//		double result7 = (double)v10 / v11; //0.5
//		double result7 = v10 / (double)v11;
//		double result7 = (double)v10 / (double)v11;
		System.out.println("값2" + result7);
		
		String str = "안녕하세요";
		int val = 1;
		String val2 = "3"; // 얘는 문자열임! 
		
		System.out.println(str + val);
		System.out.println(val + val2); // 1과 문자열3 합쳐져서 13으로 출력 
		System.out.println(2 + val + val2); // 1+2, 문자열3이 합쳐져서 33으로 출력 
		
		byte value = Byte.parseByte(val2); // 문자형을 byte형으로 변환
		int value2 = Integer.parseInt(val2); // 문자형을 int형으로 변환 
		double value3 = Double.parseDouble(val2); // 문자형을 double형으로 변환 
		
		String str2 = String.valueOf(val); // 기본형(primitive)을 String으로 변환 
//		String str2 = String.valueOf(3.14);
//		String str2 = String.valueOf(true);
		
		
 	}

}
