package week13;

public class SmartTV implements Volume, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
		
	}

	@Override
	public void volumeUp(int level) {
		System.out.println("����ƮTV ������ �ø��ϴ�: " + level);
		
	}

	@Override
	public void volumeDown(int level) {
		System.out.println("����ƮTV ������ �����ϴ�: " + level);
		
	}
	
}
