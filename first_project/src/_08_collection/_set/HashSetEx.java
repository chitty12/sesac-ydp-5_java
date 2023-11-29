package _08_collection._set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main (String[] args) {
//		HashSet 컬렉션 생성
		Set<String> set1 = new HashSet<>();
		
		
//		데이터 추가
		set1.add("apple");
		set1.add("banana");
		set1.add("kiwi");
		set1.add("orange");
		set1.add("apple");
		
		System.out.println(set1);
		
//		저장된 개수 출력
		int size = set1.size();
		System.out.printf("총 %d 종류의 과일이 있습니다. %n%n", size);
		
		
//////////////////////////////////
		Set<Course> set2 = new HashSet<>();
		Course java = new Course(101, "Java");
		Course js1 = new Course(102, "JavaScript");
		Course js2 = new Course(102, "JavaScript");
		
		
		System.out.println(java.hashCode());
		System.out.println(js1.hashCode());
		System.out.println(js2.hashCode());
		
		set2.add(java);
		set2.add(js1);
		set2.add(js2); // js1 과 동등객체로 간주되어서 객체 1개만 저장
		
		int size2 =set2.size();
		System.out.printf("총 %d 종류의 과정이 있습니다 %n%n", size2);
		
		// 전체 요소 출력
//		case1. 반복문 사용
		System.out.println("==반복문으로 set 객체 출력==");
		for(Course c : set2) {
			System.out.println(c);
		}
		System.out.println();
		
		
//		case2. iterator() 메소드로 반복자를 얻어서 객체 하나씩 가져오기
//		iterator 제공하는 메소드
//		- boolean hasNext() : 가져올 객체가 있으면 true, 없으면 false
//		- E next() : 컬렉션에서 객체 하나를 가져옴
//		- void remove() : next() 로 가져온 객체를 set 컬렉션 제거
		System.out.println("==iterator()로 set객체 출력==");
		Iterator<Course> iterator = set2.iterator();
		
		
		while(iterator.hasNext()) {
			Course c = iterator.next();
			System.out.println(c);
			
		}
		
		System.out.println();
	}
}
