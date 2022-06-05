package homework;

public class TV implements Control {

	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
		
	}
	
	public void Volume() {
		System.out.println("ÇöÀç TV º¼·ý:" + MAX_VOLUME);
	}

}
