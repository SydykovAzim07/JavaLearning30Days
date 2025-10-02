package oop_basics.day08.task2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = (width > 0) ? width : 0;
        this.height = (height > 0) ? height : 0;
    }
    @Override
    public void draw() {
        System.out.printf("Рисую прямоугольник цвета %s, ширина= %.1f  высота=%.1f%n" , color, width, height);
    }
    public double getArea () {
        return width * height;
    }

    public static void main(String[] args) {
        Shape shape = new Shape("red");
        Rectangle rectangle = new Rectangle("Blue", 5.0, 5.0);
        shape.draw();
        rectangle.draw();
        System.out.print("Площадь прямоугольника: " + rectangle.getArea());
    }

}
