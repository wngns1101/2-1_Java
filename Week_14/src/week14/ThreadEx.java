package week14;

public class ThreadEx {
	public static void main(String[] args) {
		Thread mainThread  = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread);
		
		Thread threadA  = new ThreadA();
		threadA.start();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		
		
		Thread threadB  = new ThreadB();
		threadB.start();
		System.out.println("���α׷� ���� ������ �̸�: " + threadB.getName());
	}
}
