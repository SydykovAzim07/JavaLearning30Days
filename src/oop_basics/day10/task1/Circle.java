package oop_basics.day10.task1;

public class Circle implements Drawable{
    private double radius;

    public Circle(double radius) {
        this.radius = (radius > 0) ? radius : 0;
    }

    public void draw() {
        System.out.printf("Рисую круг радиуса %.1f%n", radius);
    }

    @Override
    public void fill() {
        System.out.printf("Заполняю круг радиуса %.1f%n", radius);
    }
}
