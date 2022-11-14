package test.ch06;

public class CarEX {

	public static void main(String[] args) { // 필드에 변수 만들었으면 메인 메소드에서 객체 생성?
		// TODO Auto-generated method stub
		// 1. 객체 생성 해주기 (그래야 객체 안에 있는 필드에 접근 가능)  // 객체를 만들지만 사실 저장하는건 주소임 (데이터는 힙에 저장)
		// 객체를 생성했기 때문에 필드에는 접근 가능하지만! 필드에 할당한 값이 없으면 결과는 null, false, 0(디폴트 데이터 나옴)
		// 값을 외부에서 가져오기!
		// 객체가 생성되는 순간 생성자가 실행 됨 ( 객체 데이터들이(?) 생성되자마자 바로 생성자에 들어감 !) 
		Car myCar = new Car("그랜저", "검정", 250); // 얘는 10번지로 가야하고 
//		Car myCar2 = new Car(); // 얘는 20번지로 가야 함. 완전히 다른 객체임! (객체는 같은 객체지만! 다르다!!)
		
		System.out.println(myCar.company); // 필드에 할당되어 있기 때문에 출력!! 
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed); // 모델, 컬러, 맥스스피드는 객체에 할당된 값 출력 
		System.out.println(myCar.speed); // speed는 필드에 할당한 값이 없기 때문에 디폴트 데이터인 0이 나옴
		System.out.println("==================================");
		
		Car car2 = new Car("자가용"); // 변수: 주소 이름, 번지 수 (스택 영역) , 객체 : 실제 값 저장 (힙 영역)
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println("==================================");
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println(car3.model);
		System.out.println(car3.color);
		
		// 외부에서 필드 데이터 변경하는 방법 
//		myCar.speed = 60; // 필드 값 변경 
//		myCar2.speed = 70; // 필드 값 변경 
//		System.out.println(myCar.speed); // 값을 할당했기 때문에 수정된 값 60이 나온다. 
//		System.out.println(myCar2.speed); // 값을 할당했기 때문에 수정된 값 60이 나온다. 
	}

}
