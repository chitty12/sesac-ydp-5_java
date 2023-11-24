package _05_class._inheritance;

public class StudentEx {
  public static void main(String[] args) {
    Student std1 = new Student("김새싹", 20);

//    // Case1. 부모, 자식 클래스의 필드가 public 인 경우
//    // Person (부모) 로부터 상속받은 필드
//    System.out.println(std1.name); // 김새싹
//    System.out.println(std1.age); // 20
//    // Studnet 필드
//    System.out.println(std1.campus); // null
//
//    // Person (부모) 로부터 상속받은 메소드
//    std1.say();
//    std1.eat("바나나");
//
//    // Student 메소드 호출
//    std1.setCampus("새싹 영등포");
//    System.out.println(std1.campus); // 새싹 영등포

    // Case2. 부모, 자식 클래스의 필드가 private 인 경우
    // Person (부모) 로부터 상속받은 필드
    System.out.println(std1.getName()); // 김새싹
    System.out.println(std1.getAge()); // 20
    // Student 필드
    System.out.println(std1.getCampus()); // null

    // Person (부모) 로부터 상속받은 메소드
    std1.say();
    std1.eat("바나나");

    // Student 메소드 호출
    std1.setCampus("새싹 영등포");
    System.out.println(std1.getCampus()); // 새싹 영등포
  }
}