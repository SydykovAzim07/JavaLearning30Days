package oop_basics.day10.task2;

public class Shape implements Resizable{
    protected double size;

    public Shape(double size) {
        this.size = (size > 0 ? size : 0);
    }


    public void resize(double factor) {
        size *= (factor > 0 ? factor : 0);
    }

    @Override
    public void printSize() {
        System.out.printf("Размер фигуры: %.1f\n", size);
    }

}
