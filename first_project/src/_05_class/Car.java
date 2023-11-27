package _05_class;

public class Car extends Vehicle{
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    void move(){
        System.out.println("도로를 따라 이동 중");
    }
}