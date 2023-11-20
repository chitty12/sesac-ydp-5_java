package _01_basic_syntax;

public class DataTypes {
	public static void main(String[] args) {
		System.out.println("===Primitive Type(기본형)===");
		
//		정수형 변수
		int x = 10;
		long y = 10000000L; // long 타입은 뒤에 L, l 붙어야 함.
		short z = 32767;
		byte b = 123;
		
//		실수형 변수
		float a = 3.14f; // float 타입은 뒤에 f, F 붙어야 함.
		double c = 2.71286; 
		
//		문자형 변수 선언
//		- 유니코드(세계 각국의 문자를 0 ~ 65535 숫자로 매핑한 국제 표준 규약) 저장
		char ch = 'A'; // 65 매핑
		char ch2 = '가'; // 4403 매핑
		
//		논리형 변수
		boolean bool = true;
		boolean bool2 = false;
	
		
		System.out.println("정수형 변수:" + x + ", "+ y + ", " + z + ", "+b);
		System.out.println("실수형 변수:" + a + ", "+c);
		System.out.println("문자형 변수:" + ch + ", "+ch2);
		System.out.println("논리형 변수:" + bool + ", "+bool2);
	}
	
	
}
