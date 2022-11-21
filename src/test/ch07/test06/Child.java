package test.ch07.test06;

public class Child extends Parent {
	public int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		// 부모의 기본 생성자를 호출하기 위해서는 super(매개값); 필요함. 
		super(name);
		this.studentNo = studentNo;
	}
}
