package juhoon;

public class Calculator1Ex {
	public static void main(String[] args) {
		int  radius = 8;
		
		double circleArea = Calculator1.pi * radius * radius;
		System.out.printf("�������� %d�� ���� ���� = %.2f\n", radius, circleArea);
		
		int x = 8;
		int y = 7;
		System.out.printf("(%d,%d)�� ��=%d\n", x, y, Calculator1.plus(x, y));
		System.out.printf("(%d,%d)�� ��=%d\n", x, y, Calculator1.minus(x, y));
		
		
	}
}