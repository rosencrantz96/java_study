package test.ch06;

public class KoreaEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korea k1 = new Korea("123456-1234567", "감자바"); // 생성자를 만들어놨기 때문에 매개변수를 두 개 줘야 한다. (ssn, name)
		k1.name = "김하서"; 
//		k1.nation = "미국"; // 얜 안돼요
		
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
	}

}
