package _02_control_statement;

import java.util.Scanner;

public class Control_ex {

	public static void main(String[] args) {

		
		System.out.println("나이를 입력하세요.");
		
		Scanner sc = new Scanner(System.in); 

		int number = sc.nextInt();
		
		
		if(0 < number && number <=7) {
			System.out.println("유아");
		} else if(7< number && number <= 13) {
			System.out.println("초등학생");
		} else if(13< number && number <= 16) {
			System.out.println("중학생");
		} else if(16< number && number <=19) {
			System.out.println("고등학생");
		} else if(19<number) {
			System.out.println("성인");
		} else {
			System.out.println("잘못된 입력");
		}


		System.out.println("이름를 입력하세요.");
		String name = sc.next();
		
		switch (name) {
		case "홍길동":
			System.out.println("남자");
			break;
		case "성춘향":
			System.out.println("여자");
			break;
		default:
			System.out.println("모르겠어요");
			break;
		}
		
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int i;
		
		for (i = 1; i <= num; i ++) {
			System.out.print(i + " ");
		}
		
		
		sc.close();
	}

}
