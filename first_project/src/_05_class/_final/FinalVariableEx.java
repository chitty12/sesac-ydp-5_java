package _05_class._final;

// final 필드
// - final 키워드가 지정된 변수는 한 번 초기화되면 값 변경 불가능.

public class FinalVariableEx {

	public static void main (String[] args) {
//		final 변수 선언, 초기화
		final int finalNum = 1;
		
//		finalNum = 5; // final 필드는 값 변경 불가하여 컴파일 에러 발생!
		
//		final 필드는 오로지 "읽기 전용" 으로만 쓰인다!
		System.out.println("Final Number: " + finalNum);
		
	}


}
