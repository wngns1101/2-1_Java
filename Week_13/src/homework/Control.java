package homework;

public interface Control {
	
	public int MAX_VOLUME = 25;
	
	public void turnOn();
	public void turnOff();
	public void	Volume();
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("���� ó���մϴ�.");
		else
			System.out.println("���� �����մϴ�.");
	}
}
