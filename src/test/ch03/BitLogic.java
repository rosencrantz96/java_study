package test.ch03;

public class BitLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("45 & 25 = " + (45 & 25)); // 9
		System.out.println("45 | 25 = " + (45 | 25)); // 61
		System.out.println("45 ^ 25 = " + (45 ^ 25)); // 52
		System.out.println("~45 = " + (~45)); // -46
		// 보수: 2진수를 반대로 바꿔주는 거! (00101101 -> 11010010(=-46) 
		System.out.println("----------------------------------");
		
		byte recieveData = -128;
		int unsignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt);
		
	}

}
