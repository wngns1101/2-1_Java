package juhoon;

import java.util.Scanner;

public class CarEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ingas;
		boolean gasStat;
		
		Car myCar = new Car();
		myCar.setGas(5);
		
		while(true) {
		
		gasStat = myCar.isLeftGas();
		
		
		if(gasStat) {
			System.out.println("����մϴ�.");
			myCar.run();
			continue;
		}else {
			System.out.println("���Ḧ �����ϼ���.");
			ingas = sc.nextInt();
			if(ingas == 0)
				break;
			else
				myCar.setGas(ingas);
		}
		System.out.println("�ý��� ����");
		sc.close();
		}
	}	
}