package _05_class;

import java.util.ArrayList;

import java.util.Scanner;

public class RectangleEx {

	public static void main(String[] args) {
		
		ArrayList<Rectangle> rect = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		
		

		
		while(true) {
			
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			
			double num1 = sc.nextInt();		
			double num2 = sc.nextInt();
			
			if(num1 == 0 && num2 ==0) {
				break;
			}
			
			Rectangle array1 = new Rectangle(num1);
			array1.setHeight(num2);
			
			
			rect.add(array1);
				
		}
		
		
		System.out.println(rect);
		for (Rectangle n: rect) {
			
			System.out.println("가로 길이는:" + n.getWidth());
			System.out.println("세로 길이는:" + n.getHeight());
			System.out.println("넓이는:" + n.area());
			System.out.println("-------------------------");
		}
		
		System.out.println("Rectangle 인스턴스의 개수는: " + rect.size());
		

	}

}
