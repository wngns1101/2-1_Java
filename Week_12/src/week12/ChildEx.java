package week12;

public class ChildEx {
	public static void main(String[] args) {
		// Parent Ŭ������ ��ӹ��� Child Ŭ������ �̿��Ͽ� ��ü�� ����
		Child child = new Child();
		// �ڽ� Ŭ������ ������ ��þ�� �θ� Ŭ������ ������ ��ü�� ������ �� �ִ�
		// �� �� �ڵ� Ÿ�� ��ȯ�ȴ�
		Parent parent = child;
		
		parent.method1();
		//�ڵ� Ÿ�� ��ȯ�� ���E�� ��� �θ� Ŭ���� ��ü�� �ڽ� Ŭ������ �����ǵ� �޼ҵ尡 ȣ��ȴ�.
		parent.method2();
		
		//�ڽ� ��ü�� �θ� ��ü�� Ÿ�� ��ȯ�Ǹ� �ڽ� ��ü���� ���ǵ� �޼ҵ�� ȣ��� �� ����
		//parent.method3();
	}
}
