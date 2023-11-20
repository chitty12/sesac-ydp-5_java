package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		int number = 10;
		if(number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		
//		String 객체 비교
		
		System.out.println("이름을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine(); // 엔터 이전까지의 문자열 읽음.
		System.out.println("name 값 확인: " + name);
				
		
//		안좋은예
		if(name == "김새싹") {  // => "김새싹"을 올바르게 입력해도 else 절로 넘어감.
			System.out.println("환영합니다");
		} else {
			System.out.println("이름을 다시 확인해주세요");
		}
		
		
//		Good
		if(name.equals("김새싹")) {
			System.out.println("**환영합니다");
		} else{
			System.out.println("**이름을 다시 확인해주세요");
		}
		
//		why??
//		- '==' 연산자 : 두 객체의 참조 비교(동일한 메모리 위치 가르키는지 확인함_)
//		- '.equals()' : 두 객체의 '내용'이 동일한지 비교함.
		
//		"문자열 리터럴"(new 연산자로 문자열을 생성하지 않고, 큰 따옴표로 생성한 문자열) 경우, java 특별하게 취급. 동일한 문자열 리터럴이 사용될 경우, 같은 참조를 가리킨다
		
		String str1 = "hello";
		String str2 = "hello";
		
		if(str1 == str2) {
			System.out.println("같은 참조를 가리킵니다");
		} else {
			System.out.println("다른 참조를 가리킵니다");
		}
		
		
		if(str1.equals(str2)){
			System.out.println("내용이 같다");
		}else {
			System.out.println("내용이 다르다");
		}
		
		
//		문자열 "동적 할당" 
//		new 연산자로 각각의 객체를 생성 (str3, str4)는 서로 다른 객체에 해당함.
//		'==' 연산자로 비교시 false
//		'.equals()' 메소드 비교시 true
		String str3 = new String("hi");
		String str4 = new String("hi");
		
		if(str3 == str4) {
			System.out.println("같은 참조를 가리킵니다");
		} else {
			System.out.println("다른 참조를 가리킵니다");
		}
		
		
		if(str3.equals(str4)){
			System.out.println("내용이 같다");
		}else {
			System.out.println("내용이 다르다");
		}
		
		
		
		
//		if ~ if else
		if(number % 3 == 0) {
			System.out.println("3의 배수");
		}else if(number % 5 == 0) {
			System.out.println("5의 배수");
		} else {
			System.out.println("3의 배수도 5의 배수도 아님");
		}
		
		
//		switch ~ case 
		
		String dayOfWeek;
		int day = 1;
		
		switch (day) {
		case 1:
			dayOfWeek = "일요일";
			break;
		case 2:
			dayOfWeek = "월요일";
			break;
		case 3:
			dayOfWeek = "화요일";
			break;
		case 4:
			dayOfWeek = "수요일";
			break;
		case 5:
			dayOfWeek = "목요일";
			break;
		case 6:
			dayOfWeek = "금요일";
			break;
		case 7:
			dayOfWeek = "토요일";
			break;
			
			default:
				dayOfWeek = "잘못된 입력";
				break;
			
		}
		
		System.out.println(dayOfWeek + "입니다!");
	}

}
