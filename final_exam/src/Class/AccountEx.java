package Class;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
		
		System.out.println("현재 잔고는" + account.getBalance());
		
		account.setBalance(100000);
		System.out.println("현재 잔고는" + account.getBalance());
		
		
	}
}
