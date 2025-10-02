package oop_basics.day08.task1;

public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = (age > 0) ? age : 0;
    }
    public void introduce(){
        System.out.println("Я [name], мне [age] лет");
    }
}
