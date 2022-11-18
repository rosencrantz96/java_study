package test.ch07.poly;

public class InstanceofEx {
	// 메소드 
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		if(person instanceof Student) { // person이 Stundent객체(타입)를 참조하고 있냐?
			Student student = (Student)person; // 강제타입변환
			System.out.println(student.studentNo);
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
	
		Person p2 = new Student("권수경", 12153003);
		personInfo(p2);
	}	
	

}
