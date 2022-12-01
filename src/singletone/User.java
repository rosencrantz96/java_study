package singletone;

public class User {
	private String name; // 사용자 이름
	
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter(); // static이라서 객체 없이 클래스에서 바로 호출 가능
		System.out.println(this.name + "사용자가 사용하는 프린트: " + printer.toString()); 
		// Object에 있는 toString(): 객체의 주소 반환 (해시코드로 반환)
	}
}
