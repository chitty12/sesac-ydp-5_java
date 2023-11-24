package _05_class._inheritance;

public class DogEx {
  public static void main(String[] args) {
    // 자식 클래스 인스턴스 생성
    Dog myDog = new Dog();

    // 메소드 호출: 오버라이딩 된 메소드 호출
    myDog.makeSound();

    // 자식 클래스의 일반 메소드 호출
    myDog.fetch();
  }
}