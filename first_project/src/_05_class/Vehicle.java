package _05_class;


interface Flyable {
	void fly();
}



public abstract class Vehicle {
	String name;
	Integer maxSpeed;
	
	
	public Vehicle(String name, Integer maxSpeed) {
		this.name =name;
		this.maxSpeed =maxSpeed;
	}
	
	
	
	abstract void move();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
