package _02_control_statement;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요");
		
		int[] nums = new int[5];
		
		for(int i=0; i<5; i++) {
			int number = sc.nextInt();
			nums[i] = number; 
		}
		
		int sum = 0;
		
		for(int n: nums) {
			sum += n;
		}
		
		System.out.println("평균은" + (double)sum/5);
		    
		}



	}


