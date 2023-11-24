package _05_class._inheritance;

public class Student extends Person {
//  // Case1. public 필드를 선언
//  public String campus;
//
//  // 생성자
//  public Student(String name, int age) {
////    // super() 는 생성자의 첫줄에 작성
////    super(); // 생략 가능 (컴파일시 자동 추가) -> "부모 클래스의 생성자를 호출"
////    System.out.println("자식 클래스의 Student(String name, int age) 생성자가 실행됨");
////
////    // 부모로부터 상속받은 필드
////    this.name = name;
////    this.age = age;
//
//    // 부모 클래스가 "매개변수르 갖는 생성자"를 갖는 경우
//    super(name, age);
//    System.out.println("자식 클래스의 Student(String name, int age) 생성자가 실행됨");
//  }

  // Case2. 필드가 private 인 경우
  private String campus;

  public Student(String name, int age) {
    // 부모로 부터 상속받은 필드
    setName(name);
    setAge(age);
  }

  public String getCampus() {
    return campus;
  }

  // 일반 메소드
  public void setCampus(String campus) {
    this.campus = campus;
    System.out.printf("%s 캠퍼스에서 공부 중!! \n", campus);
  }
}