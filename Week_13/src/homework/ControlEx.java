package homework;

public class ControlEx {
	public static void main(String[] args) {
		Audio audio = new Audio();
		TV tv = new TV();
		Computer computer = new Computer();
		
		Control[] array = new Control[3];
			array[0] = tv;
			array[1] = audio;
			array[2] = computer;
			
		for(int i=0; i<3; i++) {
			array[i].turnOn();
			array[i].turnOff();
			array[i].setMute(false);
			array[i].Volume();
			System.out.println("");
		}
	}
}
