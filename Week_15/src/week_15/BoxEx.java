package week_15;

public class BoxEx {
public static void main(String[] args) {
	Box<String> box1 = new Box<>();
	box1.setT("Hello");
	String str1 = box1.getT();
	System.out.println(str1);
	
	Box<Integer> box2 = new Box<>();
	box2.setT(100);
	int int1 = box2.getT();
	System.out.println(int1);
}
}
