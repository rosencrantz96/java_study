package test.ch12.interfaceGeneric;

public class GenericEx {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent(); // 객체를 리턴함(코드 가보세요) 
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
	}

}
