package test.ch08.interface_extends;

public class InterfaceCImpl implements InterfaceC { // 인터페이스 상속이니까 implements

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl methodB()");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl methodC()");
	} 

}
