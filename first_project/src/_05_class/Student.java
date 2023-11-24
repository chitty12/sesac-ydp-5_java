package _05_class;



// 클래스
// - 객체 지향 프로그래밍의 기초
// - 클래스를 통해 인스턴스 생성

public class Student {
// 공개 클래스 선언
	
	
	
//	1. 필드
	public String name;
	public int student_ID;
	public int grade;
	public static int totalStudents = 0;
	
	
//	2. 메소드
//	2-1. 생성자
	public Student(String name, int student_ID, int grade) {
//		this : 자기 자신 의미
//		this.name, this.grade : 현재 인스턴스의 name, grade 멤버 변수
//		멤버 변수와 매개변수 이름이 동일하다면, this 이용해 구분.
		this.name = name; // 매개변수의 name 을 현재 객체의 name 멤버 변수 할당
		this.grade = grade; // 매개변수의 grade 를 현재 객체의 grade 멤버 변수 할당
		this.student_ID = student_ID;
		this.totalStudents ++;
		
		
//		this를 쓰지 않는 생성자(추천x)
//	public Student(String n, int g) {
//		name = n;
//		grade = g;
//	}
		
	}
	
	
//	2-2. 일반 메소드
//	1) 인자 x, 반환값 x
	public void goToschool () {
		System.out.println("학교에 가자!");	
	
	}
	
//	2) 인자 o, 반환값 x
	public void study(String subject) {
		System.out.printf("%s 과목 공부중!\n", subject);
	}
	
//	3) 인자 x, 반환값 o
	public int getGrade () {
		return this.grade;
		
	}
	
//	4) 인자 o, 반환값 o
	public String getTestResult (int score) {
		return this.name + "학생의 점수 :" + score;
	}


	
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStudent_ID() {
		return student_ID;
	}


	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
