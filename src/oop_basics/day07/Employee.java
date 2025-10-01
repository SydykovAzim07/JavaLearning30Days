package oop_basics.day07;

import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private static int employeeCount;
    public Employee(String name) {
        this(name ,1000.0);
    }

    public Employee(String name, double salary) {
        employeeCount++;
        this.name = name;
        this.salary = (salary > 0) ? salary : 1000.0;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
    public void printInfo() {
        System.out.printf("Сотрудник: %s, зарплата: %.1f%n", name, salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите имя сотрудника 1: ");
        String name = sc.nextLine();
        System.out.println("Введите зарплату: ");
        double salary = sc.nextDouble();
        Employee employee = new Employee(name, salary);
        sc.nextLine();
        System.out.println("Введите имя сотрудника 2:");
        String name2 = sc.nextLine();
        Employee employee2 = new Employee(name2);
        sc.close();
        employee.printInfo();
        employee2.printInfo();
        System.out.println("Общее количество сотрудников: " + getEmployeeCount());


    }
}
