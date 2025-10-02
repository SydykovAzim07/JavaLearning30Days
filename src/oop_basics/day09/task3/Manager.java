package oop_basics.day09.task3;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void work () {
        System.out.printf("Менеджер %s управляет командой из %d человек%n", name, teamSize );
    }
}
