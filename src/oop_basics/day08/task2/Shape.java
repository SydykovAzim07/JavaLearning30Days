package oop_basics.day08.task2;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    public void draw () {
        System.out.printf("Рисую фигуру цвета %s%n", color);
    }

}
