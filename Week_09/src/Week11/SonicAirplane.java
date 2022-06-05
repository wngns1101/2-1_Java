package Week11;

public class SonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
 			System.out.println("¿Ã¶ó°©´Ï´Ù.");
		}else { 
			super.fly();
		}
	}
	
	
}