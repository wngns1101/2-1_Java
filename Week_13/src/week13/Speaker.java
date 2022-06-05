package week13;

public class Speaker implements Volume {
	private boolean mute;
	private int VolLevel;
	public Speaker() {
		VolLevel = 0;
	}
	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println("����Ŀ ������ �ø��ϴ�: " + VolLevel);
	}
	@Override
	public void volumeDown(int level) {
		VolLevel += level;
		if(VolLevel < 0)
			VolLevel = 0;
		System.out.println("����Ŀ ������ �����ϴ�: " + VolLevel);
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute)
			System.out.println("����Ŀ ���� ó���մϴ�.");
		else
			System.out.println("����Ŀ ���� �����մϴ�.");
	}
	
}
