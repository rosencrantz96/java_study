package test.ch12.interfaceGeneric;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home(); // Home 객체를 리턴 
	}

}
