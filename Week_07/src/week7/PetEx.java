package week7;

public class PetEx {
	public static void main(String[] args) {
		Pet dog = new Pet("������", 8);
		Pet cat = new Pet("�����", 13);
		Pet bird = new Pet("��", 6);
		
		System.out.println(dog.type + "��" + dog.age + "���� �Դϴ�");
		System.out.println(cat.type + "��" + cat.age + "���� �Դϴ�");
		System.out.println(bird.type + "��" + bird.age + "���� �Դϴ�");
		System.out.println();
		dog.leg = 4;
		cat.leg = 4;
		bird.leg = 2;
		
		System.out.println(dog.type + "�ٸ���" + dog.leg + "�Դϴ�");
		System.out.println(cat.type + "�ٸ���" + cat.leg + "�Դϴ�");
		System.out.println(bird.type + "�ٸ���" + bird.leg + "�Դϴ�");
	}
}
