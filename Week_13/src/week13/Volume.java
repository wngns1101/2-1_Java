package week13;

public interface Volume {
	//�������̽��� ��ü ��� �����̹Ƿ� ��Ÿ�� �� �����͸� ������ �� �ִ� �ʵ带 ������ �� ����.
	//�������̽����� ���� ������ ���� �Ǽ�(static final) �ʵ��̴�.
	//����� ������ ���� �ݵ�� �ʱⰪ�� �����ؾ� �Ѵ�.
	//static final�� �����ص� ������ �������� �ڵ� �����ȴ�.
	public int MAX_VOLUME = 25;
	public int MIN_VOLUME = 0;
	
	
	// �������̽��� ����� �޼ҵ�� ���๮�� ���� �߻� �޼ҵ��̴�.
	// public abstract �����ص� ������ �������� �ڵ����� �����ȴ�.
	// ���������� ���� Ŭ�������� ���ǵǰ� ��ü���� ����ȴ�.
	public void volumeUp(int level);
	public void volumeDown(int level);
	
	
	
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("���� ó���մϴ�.");
		else
			System.out.println("���� �����մϴ�.");
	}
}
