package homework;

public class Computer implements Control{
	@Override
	public void turnOn() {
		System.out.println("Computer¸¦ ÄÕ´Ï´Ù");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Computer¸¦ ²ü´Ï´Ù.");
		
	}
	public void Volume() {
		System.out.println("ÇöÀç Computer º¼·ý:" + MAX_VOLUME);
	}
}
