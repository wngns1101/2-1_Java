package Class;

public class MemberService {
	public static void main(String[] args) {
		Member member = new Member("ȫ�浿", "hong");
		
		boolean result = member.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			member.logout();
		} else {
			System.out.println("id �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		
	}
}
