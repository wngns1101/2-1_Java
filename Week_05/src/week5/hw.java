package week5;
import java.util.Scanner;


public class hw {
	public static void main(String[] args) {
		System.out.print("�̸��� �Է��ϼ���: ");
		Scanner name = new Scanner(System.in);
		String bmi_name = name.nextLine();
		
		System.out.print("Ű(cm)�� �Է��ϼ���: ");
		Scanner height = new Scanner(System.in);
		double s_height = height.nextInt();
		double bmi_height = s_height / 100.0;
		
		System.out.print("������(kg)�� �Է��ϼ���: ");
		Scanner weight = new Scanner(System.in);
		double bmi_weight = height.nextInt();
		
		double BMI = bmi_weight / (bmi_height * bmi_height);
		
		if(BMI>=18.5 && BMI <= 22.9) {
			System.out.println(bmi_name + "���� Ű��" + s_height + "�̰� �����Դ�"
					+ bmi_weight + "�Դϴ�" );
			System.out.println("BMI ������" + (Math.ceil(BMI*100)/100.0) + "�̰� �����Դϴ�");
		} else if (BMI>=23.0 && BMI <= 24.9) {
			System.out.println(bmi_name + "���� Ű��" + s_height + "�̰� �����Դ�"
					+ bmi_weight + "�Դϴ�" );
			System.out.println("BMI ������" + (Math.ceil(BMI*100)/100.0) + "�̰� ��ü���Դϴ�");
		} else if (BMI>=25 && BMI <= 29.9) {
			System.out.println(bmi_name + "���� Ű��" + s_height + "�̰� �����Դ�"
					+ bmi_weight + "�Դϴ�" );
			System.out.println("BMI ������" + (Math.ceil(BMI*100)/100.0) + "�̰� ���Դϴ�");
		} else if (BMI >= 30) {
			System.out.println(bmi_name + "���� Ű��" + s_height + "�̰� �����Դ�"
					+ bmi_weight + "�Դϴ�" );
			System.out.println("BMI ������" + (Math.ceil(BMI*100)/100.0) + "�̰� �����Դϴ�");
		} else {
			System.out.println("�ٽ� �Է����ּ���");
		}
			
	}
}
