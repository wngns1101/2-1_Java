package week4;

public class ConditionOperator2 {
	public static void main(String[] args) {
		int score = 85;
		String result;
		
		result = (score > 90)? "���": ((score > 80)? "����": "�̴�");
		
		System.out.println("������= " + score);
		System.out.println("���������= " + result);
	}
}
