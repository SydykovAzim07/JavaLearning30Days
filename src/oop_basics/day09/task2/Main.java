package oop_basics.day09.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(50);
        Vehicle car = new Car(120, 4);
        Bicycle bicycle = new Bicycle(20, true);
        Vehicle [] vehicles = new Vehicle[] {vehicle, car, bicycle};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
