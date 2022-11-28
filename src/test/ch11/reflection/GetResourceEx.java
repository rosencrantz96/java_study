package test.ch11.reflection;

public class GetResourceEx {

	public static void main(String[] args) {
		Class clazz = Car.class; // Car 클래스에 대한 정보를 가져옴 
		
		String photo1Path = clazz.getResource("pasted image 0.png").getPath();
		String photo2Path = clazz.getResource("images/pasted image 0.png").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
