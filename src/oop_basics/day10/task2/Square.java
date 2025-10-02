package oop_basics.day10.task2;

public class Square extends Shape{
    public Square(double size) {
        super(size);
    }

    @Override
    public void printSize() {
        System.out.printf("Размер квадрата: %.1f\n", size);
    }

    public static void main(String[] args) {
        Square s = new Square(1);
        s.resize(2);
        s.printSize();
    }
}
