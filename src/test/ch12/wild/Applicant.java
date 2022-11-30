package test.ch12.wild;

public class Applicant<T> {
	public T kind;
//	public Person kind = new Person();
	
	// 생성자 
	public Applicant(T kind) {
		this.kind = kind;
	}
}
