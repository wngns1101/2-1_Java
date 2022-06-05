package Week11;

public class Account {
	private String accNo;
	private String owner;
	private int balance;

	public Account(String accNo, String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
		
	}

	public int getBalance() {
		return balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		if(balance >= 0 && balance <= 1000000) {
			this.balance += balance;
			System.out.println("�Ա� ����");
		} else {
			System.out.println("�ܰ� ���� ����");
		}
		}
	
	public void search() {
		System.out.println("<���� ��ȸ>");
		System.out.println(getAccNo()+ " " + getOwner() + " " + getBalance());
		return;
	}
	
	
}
