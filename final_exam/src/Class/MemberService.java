package Class;

public class MemberService {
	public static void main(String[] args) {
		Member member = new Member("홍길동", "hong");
		
		boolean result = member.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			member.logout();
		} else {
			System.out.println("id 또는 비밀번호가 올바르지 않습니다.");
		}
		
		
		
	}
}
