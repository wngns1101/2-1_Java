package week7;

public class CircleEx {
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "����");
		double area = 3.14*pizza.radius*pizza.radius;
		System.out.println(pizza.name + "�� ���� = " + area);
	
		Circle donut = new Circle();
		donut.name = "����";
		area = 3.14*donut.radius*donut.radius;
		System.out.println(donut.name + "�� ����" + area);
	}
}
