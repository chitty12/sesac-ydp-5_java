package _05_class._abstract;


// 구체적인 클래스 - 도형(원)


public class Circle extends Shape {
	
	double radius;
	
	public Circle(String color, Double radius) {
		super(color, radius); // 부모 생성자 호출
		
	}
	
	
//	추상 메소드 구현
	void draw() {
		System.out.println("원을 그리는 중입니다...");
	}
	
	double calculateArea() {
		return radius*radius*Math.PI;
		
	}
	
	
	
}
