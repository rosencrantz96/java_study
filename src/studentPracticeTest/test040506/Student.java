package studentPracticeTest.test040506;

public class Student {
	// 필드 
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// 생성자
	public Student() {}
	
	public Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		initScore(no, ban, no);
	}
	
	// 메소드
	void initScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	public int getTotal() {
		return kor + eng + math; 
	}
	
	public float getAverge() {
		return (kor + eng + math) / 3;
	}
	

	@Override
	public String toString() {
		return "학생이름: " + name + ", 반: " + ban + ", 번호: " + no;
	}
	
	
}
