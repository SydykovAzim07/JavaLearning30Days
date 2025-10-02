package oop_basics.day09.task1;

public class Dog  extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
    public void fetch () {
        System.out.printf("Собака %s приносит мяч %n" , name);
    }
}
