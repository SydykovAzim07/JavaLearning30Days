package oop_basics.day09.task3;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.printf("Сотрудник %s работает %n", name);
    }
}
