package week6;

public class Array1 {
	public static void main(String[] args) {
		//�� ������� �迭�� �����ϴ� ���
		int [] score = {70,90,65,83,50};
		String[] pNames = {"java", "c", "python", "c#"};
		double[] dArray1;
		dArray1 = new double[] {0.1, 0.2, 0.3,0.4};
		
		//new �����ڷ� �迭�� �����ϸ� �ڵ������� �⺻������ �ʱ�ȭ�ȴ�
		int[] intArray = new int[5];
		System.out.println("intArray[0] = " + intArray[0]);
		
		double[] dArray2 = new double [5];
		System.out.println("dArray[0] = " + dArray2[0]);
		
		String[] sArray = new String[4];
		System.out.println("sArray[0] = " + sArray[0]);
		
		//�迭�� ���ο� ���� �����Ϸ��� ������ �����ڸ� �̿��Ѵ�.
		for (int i = 0; i < 4 ; i++) {
			sArray[i] = pNames[i];
			System.out.printf("sArray[%d] = %s\n", i, sArray[i]);
		}
	}
}
