package week6;

public class Array2 {
	public static void main(String[] args) {
		int num[] = new int[10];
		int sum = 0;
		double avg = 0;
		
		System.out.println("==���� ������ ���� �迭==");
		
		for (int i = 0; i < num.length; i++) {
			double randomValue = Math.random();
			int random = (int)(randomValue * 100);
			num[i] = random;
			System.out.printf("score[%d] = %d\n", i, num[i]);
			sum += num[i];
		}
		
		avg = sum / 10.0;
		
		System.out.println("==���� �� ���==");
		System.out.println("���� : " + sum);
		System.out.println("���: " + avg);
	}
}
