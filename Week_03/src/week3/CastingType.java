package week3;

public class CastingType {
	public static void main(String[] args) {
		int iData = 65;
		char cData = (char)iData;
		System.out.printf("cData = %c\n", cData);
		
		long lData = 500;
		iData = (int)lData;
		System.out.printf("iData = %d\n", iData);
		
		double dData = 3.14;
		iData = (int)dData;
		System.out.printf("iData = %d\n", iData);

		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.printf("bValue = %d\n", bValue);
		
		if (iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue;
			System.out.printf("bValue = %d\n", bValue);
		} else {
			System.out.printf("Casting �ϰ��� �ϴ� ������ ���� Ȯ���ϼ���\n");
			System.out.printf("������ ����ϴ�.");
		}
	}
}
