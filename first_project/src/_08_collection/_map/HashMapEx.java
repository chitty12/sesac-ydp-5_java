package _08_collection._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map 컬렉션
// - key, value => entry
// - 키는 중복 x, 값은 중복 o
// - 기존에 저장된 키와 동일한 키로 값을 저장하면 => 기존 값이 새로운 값으로 대체

public class HashMapEx {
	public static void main(String[] args) {
//		key(id), value(map) HashMap
		
//		Map 컬렉션 생성
		Map<Integer, String> map = new HashMap<>();
		
//		entry 추가
		map.put(1001, "홍길동");
		map.put(1002, "성춘향");
		map.put(1003, "강해린");
		map.put(1004, "홍길동");
		
//		전체 객체 수
		System.out.printf("총 %d 명의 학생이 있습니다. %n%n", map.size());
		
		
//		키로 값 얻기
		int key =1003;
		String value = map.get(key);
		System.out.printf("%d 번에 해당하는 학생은 %s 입니다. %n%n", key, value);
		
//		키와 값으로 구성된 모든 Map.Entry 객체들을 Set 에 담아 리턴
		Set<Map.Entry<Integer, String>> entrySet =map.entrySet();
		System.out.println(entrySet);
		System.out.println();
		
//		iterator 로 반복
		Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
//			entry: 1001 = 홍길동
//			k: 1001
//			v: 홍길동
			
			Map.Entry<Integer, String> entry = iterator.next();
			Integer k = entry.getKey();
			String v = entry.getValue();
			System.out.printf("%s 학생은 %d 번입니다. %n%n", v, k);
			
			
			
		}
		System.out.println();
		
		
//		키에 대한 Set 컬렉션
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		
//		주어진 key 와 일치하는 entry삭제
		String deletedValue = map.remove(1003);
		
		System.out.printf("%s 학생이 삭제됨.", deletedValue);
		
		int size2 = map.size();
		System.out.printf("총 %명의 학생이 있습니다. %n%n", size2);
		
	}
}
