package week2;

public class Print5 {
	public static void main(String[] args) {
		System.out.println(23 + 18);
		System.out.println("23 + 18 = " + (23+18));
		
		/*���� ��� ���� */
		//% : ����Ʈ ���� ��ȣ
		//d : decimal(����)
		System.out.printf("%d\n", (23+18));
		System.out.printf("���� ����: 23 + 18 = %d", (23+18));
		
		System.out.println("\n��Ģ����(53, 17)");
		System.out.printf("���ϱ�: 53 + 17 = %d\n", (53+17));
		System.out.printf("�� ��: 53 - 17 = %d\n", (53-17));
		System.out.printf("���ϱ�: 53 * 17 = %d\n", (53*17));
		System.out.printf("������: 53 / 17 = %d\n", (53/17));
		
	}
}
