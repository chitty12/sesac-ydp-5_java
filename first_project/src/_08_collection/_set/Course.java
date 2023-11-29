package _08_collection._set;

import java.lang.annotation.Target;
import java.util.Objects;

public class Course {
	private int id;
	private String title;
	
	public Course(int id, String title) {
	
		this.id = id;
		this.title = title;
	}

	
//	id, title 값이 같으면 동일한 hashCode 리턴
// hashCode란?
// - hashCode: 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
// - hashCode() 메소드 : Object클래스 정의되어 있고, 객체의 해시 코드를 반환하는 역할
// - Course 클래스에서 hashCode() 재정의 : 객체의 내부 상태를  	

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}



// id, title 값이 같으면 true 리턴

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Course target) {
//			id: int 형 == 연산자로 값 비교 가능
//			title: String .equals() 내용 비교
			return target.id == id && target.title.equals(title);
		} else {
			return false;
		} 
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	
}
