package studentPracticeTest.test13;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		((Bus) vehicle).checkFare();
	}

}
