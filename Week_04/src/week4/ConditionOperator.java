package week4;

public class ConditionOperator {
	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 47;
		String result;
		
		result = (num1 > num2)? "num1�� num2���� Ů�ϴ�":"num1�� num2���� �۽��ϴ�";
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
		System.out.printf("�� ���� ���� �����%s\n\n", result);
		
		System.out.printf("%d�� %d���� Ů�ϱ�? %b\n\n", num1, num2,(num1 > num2));
		
		boolean bResult;
		bResult = (num1 > num2)? true:false;
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
		System.out.printf("num1�� num2���� Ů�ϱ�? %b\n\n", num1, num2,(num1 > num2));
	}
}
