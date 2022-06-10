package Class;

public class Account {
	private int balance;
	
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
		
	}
}
