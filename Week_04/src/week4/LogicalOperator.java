package week4;

public class LogicalOperator {
	public static void main(String[] args) {
		int charCode1 = 'A';
		if(charCode1 >= 65 & charCode1 <= 90) {
			System.out.println((char)charCode1 + "�� ���ĺ� �빮���Դϴ�");
		}
		
		int charCode2 = 'b';
		if(charCode2 >= 97 && charCode2 <= 122) {
			System.out.println((char)charCode2 + "�� ���ĺ� �ҹ����Դϴ�");
		}
		
		int charCode3 = '9';
		if(!(charCode3 < 48) && !(charCode3 > 57)) {
			System.out.println((char)charCode3 + "�� 0~9 ������ �빮���Դϴ�");
		}
		
		int iValue = '4';
		if( (iValue%2 == 0) | (iValue%3 == 0) ) {
			System.out.println(iValue + "�� 2 �Ǵ� 3�� ����Դϴ�");
		}
	}
}
