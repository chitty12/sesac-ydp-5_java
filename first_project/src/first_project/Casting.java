package first_project;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		형변환
//		- 데이터 타입 변환
//		- (type) var
//		- type : 데이터 타입
//		- var : 변수명
		
//		묵시적 형변환(wider conversion)
//		- 작은 타입에서 큰 타입으로의 자동 형변환을 말함.
//		- 반대의 경우에는 명시적으로 형변환 해야 함.
		int smallNumber = 10;
		double bigNumber = smallNumber; // int 를 double 로 자동 형변환
		System.out.println("smallNumber:" + smallNumber );
		System.out.println("bigNumber: " + bigNumber);

	
//	 	명시적 형변환
//		- 더 큰 타입에서 작은 타입으로 강제 변환을 말함
//		- 주의) 큰 타입에서 작은 타입으로 강제 변환을 하다보니 데이터 손실이 날 수 있음.
		
		double anotherBigNumber = 20.5;
		int anotherSmallNumber =(int) anotherBigNumber;
		
	 System.out.println("anotherBigNumber:" + anotherBigNumber);
	 System.out.println("anotherSmallNumber:" + anotherSmallNumber);
	
	}

}
