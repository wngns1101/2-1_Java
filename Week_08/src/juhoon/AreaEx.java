package juhoon;

public class AreaEx {
	public static void main(String[] args) {
		Area mycal = new Area();
		
		double result1 = mycal.areaCal(1.5);
		System.out.println("���� ����" + result1);
		
		int result2 = mycal.areaCal(5);
		System.out.println("���簢�� ����" + result2);
		
		int result3 = mycal.areaCal(3, 5);	
		System.out.println("���簢��" + result3);
	}
	
}
