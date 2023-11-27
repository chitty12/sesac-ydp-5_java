package _05_class._access_modifier._pack07;

import _05_class._access_modifier._pack03.A;

public class D extends A{

	public D() {
		super(); // 부모 생성자 호출
		
		
		
//		다른 클래스의 멤버임에도 상속 받는 자식 클래스는 접근 가능!
		this.field1 = 111;
		this.method1();
	}
	
	
}
