package oop_basics.day09.task1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound () {
        System.out.println("Мяу!");
    }
    public void scratch () {
        System.out.printf("Кот %s царапает мебель %n", name);
    }

}
