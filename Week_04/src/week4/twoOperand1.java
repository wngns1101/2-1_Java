package week4;

public class twoOperand1 {
	public static void main(String[] args) {
		int apple =1;
		int number =7;
		double pieceUnit = 0.1;
		
		double result = apple - pieceUnit*number;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + " ������ ���´�");
		
		System.out.println("---------------------------");
		int totalPieces = apple * 10;
		int calPieces = totalPieces - number;
		
		result = calPieces / 10.0;
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����");
		System.out.println(result + " ������ ���´�");
		
	}
}
