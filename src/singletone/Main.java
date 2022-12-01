package singletone;

public class Main {

	public static void main(String[] args) {
		User[] user = new User[10]; // user 객체를 담을 배열을 정의  
		
		for(int i = 0; i<user.length; i++) {
			// user 객체 생성 후 배열에 담아준다 
			user[i] = new User("user" + i); // user0, user1 ...
			user[i].print(); // 배열에 객체가 생성됨과 동시에 생성한 객체에서 print 메소드도 실행된다. 
		}
		
	}

}
