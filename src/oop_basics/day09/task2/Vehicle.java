package oop_basics.day09.task2;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }
    public void move() {
        System.out.printf("Транспорт движется со скоростью %d%n " , speed);
    }
}
