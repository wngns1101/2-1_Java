package week5;

import java.io.IOException;

public class KeyControl2 {
	public static void main(String[] args) throws IOException {
		int keycode = 0;
		int count = 0;
		
		System.out.println("���� �Է��ϻ���");
		
		while (true) {
			keycode = System.in.read();
			
			if(keycode != 13 && keycode != 10) {
				System.out.println("�Է��� ����" + (char) keycode + "�Դϴ�");
				System.out.println("���ڸ� �Է��ϼ���(0~9)");
			
			
			//Ű����� ���� �Է¹��� ������ī��Ʈ���� 5���� �Է¹����� ������������ �Ѵ�
			count++;
			
			if(count > 5) {
				break;
			}
			}
			
		}
		System.out.println("���α׷� ����");
	}
}
