package _05_class._access_modifier._pack03;

public class B {

	public void method() {
//	A 와 B 는 같은 패키지
		A a = new A();
		
//		필드 변경
		a.field1 = 11; // o
		a.field2 = 22; // o
//		a.field3 = 33 // x : private field 이므로 같은 클래스에서만 접근 가능
		
//		메소드 호출
		a.method1();
		a.method2();
//		a.method3(); // x : private method 이므로 같은 클래스에서만 호출 가능
	}
}
