package juhoon;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�� �����մϴ�");
		} else {
			System.out.println("�ٸ� Singleton ��ü�� �����մϴ�");
		}
	}
}
