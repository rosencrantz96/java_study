package test.ch14.verctor;

import java.util.HashSet;
//import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		
		set.add("스레드 개같은거");
		set.add("프로세스 뻐큐머겅");
		set.add("자바 짜증나");
		set.add("스레드 개같은거");

		int size = set.size();
		System.out.println(size); // 출력 결과 3임. 왜냐면 동일한 주소는 저장하지 않음 ㅡㅡ
	}

}
