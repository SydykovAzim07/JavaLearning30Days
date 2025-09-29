package oop_basics.day07;

public class Box {
    private double length;
    private double width;
    private double height;
    public Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }
    public Box(double size) {
        length = size;
        width = size;
        height = size;

    }
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return length * width * height;
    }

    public void printInfo(int index) {
        System.out.println("Коробка " + index + ": " + "длина=" + length + ", " + "ширина=" + width + ", " + "высота=" + height );
        System.out.println("Объем: " + getVolume());
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2 , 3 , 4);

        box1.printInfo(1);
        box2.printInfo(2);
        box3.printInfo(3);
    }
}
