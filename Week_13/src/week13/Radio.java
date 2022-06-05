package week13;

public class Radio implements Volume {
	private int VolLevel;
	
	public Radio() {
		
	}
	
	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		if(VolLevel > Volume.MAX_VOLUME)
			VolLevel = Volume.MAX_VOLUME;
		System.out.println("���� ������ �ø��ϴ�: " + VolLevel);
		
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		if(VolLevel < Volume.MIN_VOLUME)
			VolLevel = Volume.MIN_VOLUME;
			System.out.println("���� ������ �����ϴ�: " + VolLevel);
	}
	
}
