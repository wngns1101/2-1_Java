package week14;

public class CalUser1 extends Thread {
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		try {
			calculator.setMoney(100);
		} catch(InterruptedException e) {}
	}

}
