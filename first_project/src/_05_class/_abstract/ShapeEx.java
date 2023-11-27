package _05_class._abstract;

public class ShapeEx {

	public static void main(String[] args) {
		Circle c = new Circle("blue");
		Square s = new Square("yellow");
		
		
		c.start();
		s.start();
		
		c.draw(); // 추상 메소드 구현
		System.out.printf("===%s 도형의 정보===", c.);
		System.out.println("원의 색상은 " + c.getColor());
		
	}

}
