package week12;

public class Car {
	//필드
	Tire frontLeft = new Tire("앞왼쪽", 6);
	Tire frontRight = new Tire("앞오른쪽", 2);
	Tire backLeft = new Tire("뒤왼쪽", 3);
	Tire backRight = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("자동차가 달립니다.");
		if(!frontLeft.roll()) {
			stop();
			return 1; //1번 타이어 리턴
		} 
		if(!frontRight.roll()) {
			stop();
			return 2;
		}
		if(!backLeft.roll()) {
			stop();
			return 3;
		}
		if(!backRight.roll()) {
			stop();
			return 4;
		}
		return 0;
		
	}
	void stop() {
		System.out.println("자동차가 정지합니다.");
	}
}
