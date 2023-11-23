package _04_exception;

//import java.io.IOException;
import java.util.InputMismatchException;
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
		
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("배열크기를 입력해주세요");
			int i = sc.nextInt();
			int[] arr1 = new int[i];			
			
			int sum = 0;
			for (int n: arr1) {
				sum += n;				
			}
			
			System.out.println("배열의 평균값 :" + (double) sum/i);
			
		}
		 catch(ArithmeticException e){
			System.out.println("0으로 정수를 나눌수 없어요");
		}
		  catch(InputMismatchException e) {
			System.out.println("배열 크기가 정수값이 아닙니다.");
			
		} catch(NegativeArraySizeException e) {
			System.out.println("배열 크기값은 양수값입니다."); 
			
		} catch(NullPointerException e) {
			System.out.println("null값 입력 오류");
		} catch(ClassCastException e) {
			System.out.println("형변환이 불가함.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스의 범위를 벗어남.");
		}
		
		}
}
