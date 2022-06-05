package homework;

public class Audio implements Control {
	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ²ü´Ï´Ù.");
		
	}
	public void Volume() {
		System.out.println("ÇöÀç Audio º¼·ý:" + MAX_VOLUME);
	}
}
