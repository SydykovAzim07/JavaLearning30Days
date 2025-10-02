package oop_basics.day10.task1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();
        circle.fill();
        Drawable.info();
    }
}
