package oop_basics.day10.task2;

public interface Resizable {
    void resize(double factor);

    default void printSize() {
        System.out.println("Размер изменен");
    }
}
