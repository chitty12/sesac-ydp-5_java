package _05_class._interface;

public class InterfaceEx03 {

	public static void main(String[] args) {
//		interface 도 하나의 타입 : 참조형!! => 변수의 타입 사용 가능
//		- 참조타입이므로 null 가능!
		RemoteControl rc;
		
		
//		1. 모니터 객체 생성
		rc = new Monitor(); 
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
		
//		2. 스피커 객체 생성, rc 변수의 객체를 교체
		rc = new Speaker(); 
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
	}
}
