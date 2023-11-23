package _03_array;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Array_List_ex {

	public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력해주세요.");
			String input = sc.next();	
			
	
		if(!input.equals("exit"))
		{				
			result.add(input);
		}
		
		else {
			
			break;
		}		
		}
		
		
			for(String rs: result) {
				System.out.println(rs + " ");				
			}
			System.out.println();			
		}


	}


