package _05_class._abstract;

// 구체적인 클래스 - 도형 (사각형)
public class Square extends Shape {
	
	double width;
	double height;
	
  public Square(String color, Double width, Double height) {
    super(color, width, height); // 부모 생성자 호출
  }

  // 추상 메소드 구현
  void draw() {
    System.out.println("사각형을 그리는 중입니다...");
  }
  
  
	double calculateArea() {
		return width*height;		
	}
}