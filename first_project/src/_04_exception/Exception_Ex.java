package _04_exception;

import java.util.Scanner;

public class Exception_Ex {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};		
		try {
			for(int i = 0; i<=5; i ++) {
				System.out.println(arr[i]);
				}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스가 범위를 벗어남");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열크기를 입력해주세요");
		int i = sc.nextInt();
		int[] arr1 = new int[i];			
//		try {
//		}
//		
//		catch(InputMismatchException) {}
//		NegativeArraySizeException
		
		
		
		
		}
}
