package week14;

public class MyThread extends Thread{
	private  int x;
	
	public MyThread(int x) {
		this.x = x;
		setDaemon(true);
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		System.out.println(x + "��° �������Դϴ�.");
	}
}
