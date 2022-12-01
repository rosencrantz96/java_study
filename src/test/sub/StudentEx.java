package test.sub;

public class StudentEx {

	public static void main(String[] args) {
		Student std1 = new Student();
		System.out.println("학생 이름: "+ std1.name);
		System.out.println("합계 점수: " + std1.getTotal());
		System.out.println("평균 점수: " + std1.getTotal());
		System.out.println(std1.toString());
	}

}
