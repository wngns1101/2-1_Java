package Week11;

import java.util.Scanner;

public class AccountEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account("123-45-6789", "ȫ�浿", 100000);
		System.out.println("���� ���� �Ϸ�");
		
		account.search();
		
		System.out.println("���� �Ա� �ݾ� >>");
		int amt = sc.nextInt();
		account.setBalance(amt);
		
		account.search();		
		sc.close();
	}
	
}
