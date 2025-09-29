package oop_basics.day07;

public class Circle {
    private double radius;
    private static final double PI = 3.14159;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
        radius = 1.0;
    }
    public static double getPI() {
        return PI;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public void printInfo(int index) {
        System.out.println("Круг " + index + ": " + "радиус=" + radius);
        System.out.println("Площадь: " + getArea());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Circle circle2 = new Circle();
        circle.printInfo(1);
        circle2.printInfo(2);
        System.out.println("Значение PI: " + getPI());

    }
}
