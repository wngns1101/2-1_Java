package week4;

public class ifElse {
	public static void main(String[] args) {
		int score = 83;
		
		System.out.println("score = " + score);
		
		if(score >= 90) {
			System.out.println("������ 90���� ũ�ų� ����");
			System.out.println("����� A�Դϴ�");
		} else if(score >= 80) {
			System.out.println("������ 80���� ũ�ų� ����");
			System.out.println("����� B�Դϴ�");
		} else if(score >= 70) {
			System.out.println("������ 70���� ũ�ų� ����");
			System.out.println("����� C�Դϴ�");
		} else if(score >= 60) {
			System.out.println("������ 60���� ũ�ų� ����");
			System.out.println("����� D�Դϴ�");
		}else {
			System.out.println("������ 60���� �۰�");
			System.out.println("����� F�Դϴ�");
		}
	}
}
