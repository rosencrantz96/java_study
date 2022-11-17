package test.ch06.question;

public class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		// id가 hong이고 password가 12345일 때 true 리턴=> 조건문을 쓰자! (판단을 해야 하니까)		
		if (id == "hong" && password == "12345") { // =id가 hong이고 password가 12345일 때
			return true; // 여기서 끝나면 빨간줄이 뜹니다. else로 해당이 안 될 때도 적어줘야 한다! (false값을 리턴하는 경우도 써주기) 
		} else {
			return false;
		}
	}
	
	void logout (String id) {
		System.out.println("님이 로그아웃 되었습니다.");
	}
	
	public static void main(String[]args) {
		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if(result) {
		     System.out.println("로그인 되었습니다.");
		     memberService.logout("hong");
		} else {
		     System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	
	// 아놔... 다시 풀어보기... ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
	
}
