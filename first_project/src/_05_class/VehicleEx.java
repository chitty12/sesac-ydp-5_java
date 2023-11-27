package _05_class;

import java.util.ArrayList;

public class VehicleEx {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
//		Car car = new Car();
//		Airplane airplane = new AirPlane();
		
		vehicles.add(new Car("자동차", 100));
		vehicles.add(new Airplane("비행기", 500));
		
		for(Vehicle v: vehicles) {
			v.move();
			
			if(v instanceof Flyable) {
				((Flyable) v).fly();
			}
			
		}
	}

}
