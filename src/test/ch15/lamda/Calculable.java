package test.ch15.lamda;

@FunctionalInterface // 컴파일 과정에서 추상메소드가 하나인지 검사해줌 
public interface Calculable {
	void calculate(int x, int y);
}
