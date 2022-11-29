package test.ch12;

public class GenericEx2 {

	public static void main(String[] args) {
		// 제너릭을 이용해서 다양한 제품을 생산할 수 있다. 
		Product<TV, String> product1 = new Product<>();
		product1.setKind(new TV()); // setKind를 이용해서 객체를 넣어줌 
		product1.setModel("스마트TV"); 
		
		TV t = product1.getKind();
		String tModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("BMW");
		
		Car c = product2.getKind();
		String cModel = product2.getModel();
	}

}
