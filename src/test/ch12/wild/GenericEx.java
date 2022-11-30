package test.ch12.wild;

public class GenericEx {

	public static void main(String[] args) {
		// 모든 사람이 신청 (static 메소드라 객체 생성 없이 바로 사용 가능): <?>는 범위에 있는 모든 타입으로 대체 가능하기 때문에
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println("");
		
		// 학생만 신청 (Student와 하위클래스 HighStudent, MiddleStudent만 실행 가능): <? extends>
//		Course.registerCourse2(new Applicant<Person>(new Person()));
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println("");
		
		// 직장인 및 일반인만 신청 (자기 자신인 Worker클래스와 부모 클래스 Person만 실행 가능): <? super> 
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}
