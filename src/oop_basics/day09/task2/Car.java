package oop_basics.day09.task2;

public class Car extends Vehicle {
    protected int doors;

    public Car(int speed, int doors) {
        super(speed);
        this.doors = doors;
    }
    @Override
    public void move() {
        System.out.printf("Машина с %d дверями едет со скоростью %d%n", doors, speed);
    }
}
