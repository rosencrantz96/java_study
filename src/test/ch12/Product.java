package test.ch12;

public class Product<K, M> { // 타입 파라미터 정의 (2개나 함!)
	// 필드 
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
