package week13;

public class BookEx {
	public static void main(String[] args) {
		Book book = new Book("863��", "�ڽ���", "Į���̰�");
		printState(book);
		book.checkOut("ȫ�浿", "2019-05-19");
		printState(book);
		book.checkOut("ȫ�浿", "2019-05-20");
		book.checkIn();
	}
	
	private static void printState(Book book) {
		if(book.state == Lendable.STATE_NORMAL)
		{
			System.out.println("------------------");
			System.out.println("����: " + book.title);
			System.out.println("���� ����: ���� ����");
			System.out.println("------------------");
		} else if(book.state == Lendable.STATE_BORROWED){
			System.out.println("------------------");
			System.out.println("����: " + book.title);
			System.out.println("���� ����: ������");
			System.out.println("������: " + book.person);
			System.out.println("������: " + book.checkDate);
			System.out.println("------------------");
		}
	}
}
