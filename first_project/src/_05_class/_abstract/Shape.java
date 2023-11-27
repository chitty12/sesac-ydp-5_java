package _05_class._abstract;


// 추상 클래스
public abstract class Shape {
	
//	필드 선언
	String color;
	Double area;
	
//	생성자 선언
	public Shape (String color, Double area) {
		this.color = color;
		this.area = area;
	}
	
//	추상 메소드 선언
//	- abstract 키워드 사용
//	- 선언만 하고, 구현은 하지 않은 메소드
//	- 중괄호 없음.
//	- 메소드 구현은 자식 클래스마다 다른 경우에 추상 메소드 사용!
	
	abstract void draw();
	
	abstract double calculateArea();	
	
//	일반 메소드
	void start() {
		System.out.println("도형을 그려보자!");
	}
	
	public String getColor() {return color;}

	public Double getArea() {
		return area;
	}
	
	
	
}
