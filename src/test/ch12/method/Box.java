package test.ch12.method;

public class Box<T> {
	private T t; // t에 대한 타입은 아직 모르는 상태 
	
	public T get() {
		return t;
	}
	
	public void set(T t) { // 그래서 매개 변수도 똑같이 t로 준다
		this.t = t;
	}
}
