package week13;

public class PolyEx {
	public static void main(String[] args) {
		ClassC classC = new ClassC();
		InterfaceA interA = new ClassC(); //������ ���� ��ü�� ���� �������̽� ������ ����
		InterfaceB interB = new ClassC(); //�� �� �ڵ� Ÿ�� ��ȯ�� �Ͼ
		
		classC.methodA(); //Ŭ���� classC�� ������ ��� ����� ȣ���� �� �ִ�
		classC.methodB(); //Ŭ���� classC�� ������ ��� ����� ȣ���� �� �ִ�
		
		interA.methodA(); //�������̽� iterfaceA�� ���ǵǤ��� �޼ҵ常 ȣ�� ����
		//interA.methodB(); �ڵ� ��ȯ �Ŀ��� �ش� �������̽� ����� ȣ���� �� �ִ�
		
		//interB.methodA(); //classC�� ���ǵǾ� �־ �������̽��� �ڿ˺�ȯ�Ǹ鼭 ȣ�� �Ұ���
		interB.methodB(); // �������̽� interfaceB�� ���ǵ� �޼ҵ常 ȣ�� ����

		if(interA instanceof ClassC) {
			ClassC castA = (ClassC)interA;
			castA.methodB();
		}
		
		//interB.methodA();
		interB.methodB();
		
		if(interB instanceof ClassC) {
			ClassC castb = (ClassC)interB;
			castb.methodA();
		}
	}
}
