package _03_array;

import java.util.Arrays;

// 표준 배열
// 배열
// - 배열에 저장할 자료형 선언 => 배열이름, 크기 선언
// - 배열 원소는 모두 같은 패턴
// - 처음 선언한 배열 크기 변경 불가능

public class Array {

	public static void main(String[] args) {
//	   배열 변수 선언
//		1. 타입[] 변수;
//		2. 타입 변수[];
		
		int[] arr1;
		int arr2[];
		

		
//		- 배열 변수 "참조"type. null 초기화 가능
//		ex. 타입[] 변수 = null;
//		=> 배열 변수가 null 값을 가진 상태에서 인덱싱한다면 null pointer exception!!
		String[] temp = null;
		System.out.println(temp); //null
//		System.out.println(temp[2]); //error
		
		
		
//		- "값 목록"으로 배열 변수 선언/ 생성
		int[] intArray = {16, 22, 43, 41, 59};
		System.out.println("intArray[0]" + intArray[0]);
		
		System.out.println(intArray); //참조값
		
		
		intArray[1] = 77; //인덱스 1번 원소 값을 변경.
		System.out.println("intArray[1]"+ intArray[1]);
		
		
//		* 배열 변수 선언과 대입 시점 다르다면
		char[] charArray;
//		charArray = {"A", "B", "C"} // error
		charArray = new char[] {'A', 'B', 'C'};
		
		
//		- new 연산자로 배열 선언 /생성
//		: 배열 원소 값은 기본 값을 초기화 됨.
		double[] doubleArray = new double[3];
		System.out.println("new 연산자로 초기화된 값:" + doubleArray[0]);
		doubleArray[0] = 0.1;
		doubleArray[1] = 1.2;
		doubleArray[2] = 4.2;
		System.out.println("doubleArray[0]" + doubleArray[0]);
		System.out.println("doubleArray[1]" + doubleArray[1]);
		System.out.println("doubleArray[2]" + doubleArray[2]);
		System.out.println();
		
		
		
		///////////////////////////////////
//		배열 길이
//		- 배열 변수.length;
		System.out.println("doubleArray 배열 길이:" + doubleArray.length);
//		doubleArray.length = 5; // error : length 필드는 읽기 전용이라 수정 불가능함. 
		
		
		
//		ex. 총합, 평균
		int sum = 0;
		for(int i =0; i<intArray.length; i ++) {
			sum += intArray[i];
		}
		System.out.println("총합" + sum);
		
		double avg =(double) sum / intArray.length;
		System.out.println("평균" + avg);
		
//		- 배열 길이를 벗어난경우의 에러 코드
//		System.out.println(doubleArray[doubleArray.length]); //ArrayIndexOutOfBoundsException
		
		////////////////////////////////////////
//		배열 출력
//		- toString(); : 배열 내용을 문자열로 변환해서 출력
//		- 배열 주소(참조) 값이 아니라 배열 내부의 값을 보고 싶을 때 사용!
		
		System.out.println("intArray" + Arrays.toString(intArray));
		System.out.println("charArray" + Arrays.toString(charArray));
		System.out.println("doubleArray" + Arrays.toString(doubleArray));
		System.out.println();
		
		
		///////////////////////////////////////
//		다차원 배열
//		- 배열 안에 또 다른 배열이 존재하는 배열
//		2*3 배열
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
		System.out.println("matrix :");
		for(int i = 0; i<matrix.length; i ++) {
			for(int j = 0; j<matrix[i].length; j ++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		3*2 배열 생성/ 초기화
		int[][] matrix2 = new int[3][2];
		matrix2[0][0] =1;
		matrix2[0][1] =2;
		matrix2[1][0] =3;
		matrix2[1][1] =4;
		matrix2[2][0] =5;
		matrix2[2][1] =6;
		
		System.out.println("\nmatrix2 :");
		
		for(int i = 0; i<matrix2.length; i ++) {
			for(int j = 0; j<matrix2[i].length; j ++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		3차원 배열 생성/ 초기화
		int[][][] threeArray = {{{1, 2},{3, 4}},{{5, 6},{7, 8}}};
		
		System.out.println("\nthreeArray :");
		
		for(int i = 0; i<threeArray.length; i ++) {
			for(int j = 0; j<threeArray[i].length; j ++) {
				for(int k = 0; k<threeArray[i][j].length; k++) {
					
					System.out.print(threeArray[i][j][k] + " ");
					
				}
				System.out.println();
			}
			System.out.println();
		}

		
		
		
		
		
	}

}
