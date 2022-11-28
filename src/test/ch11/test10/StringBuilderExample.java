package test.ch11.test10;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 100; i++) {
			str += i;
		}
		System.out.println();
		
		StringBuilder str2 = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			str2.append(i);
		}
		System.out.println(str2);
	}

}
