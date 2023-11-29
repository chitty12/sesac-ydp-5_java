package _08_collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Test01 {

	public static void main(String[] args) {

		        Set<Integer> test = new HashSet<>();
		        Scanner sc = new Scanner(System.in);

		        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다");

		        while(true) {
		        System.out.print("정수 입력: ");
		        int input = sc.nextInt();

		        if (input != -1) {
		        test.add(input);
		        } else {
		            break;
		        }
		        }

		        System.out.println("중복 제거된 정수 목록: " + test);
		    }
	

	}


