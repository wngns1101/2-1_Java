package homework;

public interface Control {
	
	public int MAX_VOLUME = 25;
	
	public void turnOn();
	public void turnOff();
	public void	Volume();
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제합니다.");
	}
}
