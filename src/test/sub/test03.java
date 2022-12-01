package test.sub;

public class test03 {

	public static void main(String[] args) {
		int money = 2680;
		
		int fiveH = money / 500;
		int oneH = (money % 500) / 100;
		int fiveT = (money % 100) / 50;
		int tenT = (money % 50) / 10;
		
		System.out.println("500원: " + fiveH);
		System.out.println("100원: " + oneH);
		System.out.println("50원: " + fiveT);
		System.out.println("10원: " + tenT);
		
	}
	
}
