package week6;

public class Reference {
	public static void main(String[] args) {
		// �⺻ ������ Ÿ���� ������ ���ÿ����� �����Ǹ鼭 ���� ���� ����Ǵ�.
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1 == iVal2 :" + (iVal1 == iVal2));
		
		// ���� Ÿ���� ������ ���� ������ �����Ǹ鼭 �ش� ��ü�� �ּҸ� �����Ѵ�.
		String sVal1 = "Java";
		String sVal2 = "Java";
		
		// �ڹٴ� ���ڿ� ���ͷ��� �����ϴٸ� String ��ü�� �����Ѵ�.
		System.out.println("sVal1 == sVal2: " + (sVal1 == sVal2? "������ ����": "������ �ٸ�"));
		
		// ����Ÿ���� ������ �ʱⰪ���� null�� ����� �� �ִ�(���ؿ������� ������)
		String sVal5 = null;
		
		// ����Ÿ���� ������ null ���� ������ ���� ���� �ش� ������ ����� �� ����
		// =>NullPointerException ���� �߻�
		// Sysout.out println("sVal5.length = " + sVal5.length());
		
		// ���� �����ϴ� ���� �������� ��ü�� �����ǰ� �ش� �ּҰ� ���ÿ����� �������� �����
		sVal5 = "Java";
		System.out.println("sVal5 = " + sVal5);
		System.out.println("sVal1 == sVal5: "+(sVal1 == sVal5? "������ ����": "������ �ٸ�"));
	}
}
