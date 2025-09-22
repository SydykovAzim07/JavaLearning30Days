package oop_basics.day06;
public class Rectangle {
private double width;
private double height;
public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
}
public Rectangle() {
    width = 1.0;
    height = 1.0;
}
public double getWidth() {
    return width;
}
public double getHeight() {
    return height;
}
public double getArea() {
    return width * height;
}
public double getPerimeter() {
    return 2 * (width + height);
}

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle();
        System.out.println("Прямоугольник 1: ширина=" + rectangle.getWidth() + ", " + "высота=" + rectangle.getHeight());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        System.out.println("Прямоугольник 2: ширина=" + rectangle2.getWidth() + ", " + "высота=" + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.getArea());
        System.out.println("Периметр: " + rectangle2.getPerimeter());

    }
}
