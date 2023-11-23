package _02_control_statement;

import java.util.Scanner;

public class Method_ex {

	public static void main(String[] args) {


	    
		System.out.println("숫자 두개를 입력하세요.");
		
		Scanner sc = new Scanner(System.in); 

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println("덧셈결과:" + add(number1, number2));
		System.out.println("뺄셈결과:" + minus(number1, number2));
		System.out.println("나눗셈결과:" + dvd(number1, number2));
		System.out.println("곱셈결과:" + mult(number1, number2));
		

		
		sc.close();

		
		
	    // 1. 객체 생성
		Method_ex ol = new Method_ex();

	    // 2. 객체의 메소드 사용
		
		System.out.println("반지름이 5인 원의 넓이:" + ol.result(5));
		System.out.println("가로4, 세로7 직사각형 넓이:" + ol.result(4, 7));
		System.out.println("밑변6, 높이 3 삼각형의 넓이:" + ol.result(6, 3, 2));

	}
	

	public static double add(int a, int b) {
		return  + a+b;

	}
	
	public static double minus(int a, int b) {
		return  a-b;
	}
	
	public static double dvd(int a, int b) {
		System.out.println(a/b);
		return  a/b;
	}
	
	public static  double mult(int a, int b) {
		return  a*b;
	}

	public double result(double a) {
		return Math.PI*(a*a);
	}
	
	public double result(double a, double b) {
		return a*b;
	}
	
	public double result (double a, double b, double c) {
		return a*b/c;
	}

	
}