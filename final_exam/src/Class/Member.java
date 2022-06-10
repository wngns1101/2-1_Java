package Class;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member(String a, String b) {
		name = a;
		id = b;
	}
	
	public boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}

	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}
