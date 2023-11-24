package _05_class;



public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle(double width) {	
		this.width = width;
	}
	
	
	
	public double area() {
		return width*height;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
