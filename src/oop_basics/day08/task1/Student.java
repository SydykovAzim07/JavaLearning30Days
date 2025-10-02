package oop_basics.day08.task1;

import java.util.Scanner;

public class Student extends Person {
    private double grade;
    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = (grade <= 100 && grade >= 0) ? grade : 0;
    }
    @Override
    public void introduce(){
        System.out.printf("Я %s мне %d лет, моя оценка %.2f ",name, age,  grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите оценку (0.0-100.0):");
        double grade = sc.nextDouble();
        sc.close();
        Student student = new Student(name, age, grade);
        student.introduce();
    }
}
