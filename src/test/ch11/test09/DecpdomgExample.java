package test.ch11.test09;

public class DecpdomgExample {

	public static void main(String[] args) throws Exception {
		byte[] bytes = {-20, -107, -120, -21, -123, -107};
		String str = new String(bytes);
		System.out.println("str: " + str);
	}

}
