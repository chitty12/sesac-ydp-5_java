package _01_DataTypes;

import java.util.Scanner;


public class java_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		



		System.out.println("안녕하세요!" + name + "님(" + age + "세)");
		sc.close();
	}

}
