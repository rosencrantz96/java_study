package test.ch08.interface_extends;

public interface InterfaceC extends InterfaceA, InterfaceB{ // 2. 인터페이스 특징: 인터페이스가 인터페이스를 상속받을 수도 있다. (extends로 받아야 함)
	void methodC();
}
