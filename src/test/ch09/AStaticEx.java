package test.ch09;

public class AStaticEx {

	public static void main(String[] args) {
		AStatic.B b = new AStatic.B();
		
		System.out.println(b.field1);
		b.method1(); 
	}

}
