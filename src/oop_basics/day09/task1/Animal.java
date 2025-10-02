package oop_basics.day09.task1;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public Animal (){

    }
    public void makeSound () {
        System.out.println("Звук животного");
    }
}
