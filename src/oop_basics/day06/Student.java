package oop_basics.day06;

import java.util.Scanner;

public class Student {
    private String name;
    private double grade;
    public Student(String name, double grade) {
        this.name = name;
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }
    public void printInfo() {
        System.out.println("Студент: " + getName() + ", " +  "оценка: " + getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студена: ");
        String name = sc.nextLine();
        System.out.println("Введите оценку (0.0-100.0): ");
        double grade = sc.nextDouble();
        Student student = new Student(name, grade);
        student.printInfo();
        System.out.println("Введите новую оценку: ");
        grade = sc.nextDouble();
        student.setGrade(grade);
        student.printInfo();
        sc.close();
    }
}
