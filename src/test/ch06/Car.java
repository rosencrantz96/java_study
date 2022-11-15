package test.ch06;

public class Car { // 필드에 속성을 만들기? // 클래스: 설계도 (Car라는 설계도를 만든 것), new (객체 생성) => 자동차를 만드는 것? 찍어내는 것?? 
	// 1. 필드: 객체의 데이터를 저장하는 곳 (필드 선언)
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	// static은 전역 변수... (함수의 외부에서 선언된 변수)
	static int numbering = 0;
//	boolean start = ; // 시동 여부 
	
	
	// 생성자... 
	Car() {
		numbering++;
	}
	  
	
	
	// 2. 생성자 (같은 이름으로 해줘야 함): 자바는... 생성자를 명시하지 않으면 컴파일 과정에서 알아서 생성자를 생성해준다.
	// 생성자에서는 초기화 코드 넣을 수 있음... 그렇다는 것 같음. 필드 초기화를 가장 많이 한다. 
	
	// 생성자 overloading (같은 이름의 메소드를 여러개 선언하는 것) (★ 단, 매개변수의 타입, 개수, 순서 중 하나가 달라야 함!)
	// 자바에서 알아서 생성자 하나 있는걸 잡아줌
	Car(String model) {
//		this.model = model;
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}
	
	// 중복된 코드가 많으면 선언해 준 것이 가장 많은 애로... 간다? (필드에 할당을 가장 많이 해 준 애로 실행) 
	Car(String model, String color, int maxSpeed) { // this -> 생성자의 객체를 말해줌. 객체 자체를 말하는 것. 현재 객체! 객체 안에 쓰이는 필드? 필드에 있는 모델, 컬러, 맥스 스피드를 말함. 
		// 여기에 받아온 값을 각각 넣어주는 것임. // 그럼 필드에 값이 들어감! (위에 필드) 
		// 객체가 생성될 때 실행되는 코드?
		this.model = model; // this.객체 안에 있는 (클래스 안에 있는 필드) = 생성자를 생성할 때 매개변수로 받아온 애들 
		this.color = color; // this: '이 객체' 라는 뜻
		this.maxSpeed = maxSpeed;
	}
}
