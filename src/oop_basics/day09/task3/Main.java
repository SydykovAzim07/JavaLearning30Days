package oop_basics.day09.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя сотрудника 1: ");
        String name = input.nextLine();
        System.out.println("Введите зарплату: ");
        double salary = input.nextDouble();
        System.out.println("Введите размер команды: ");
        int sizeTeam = input.nextInt();
        input.nextLine();
        System.out.println("Введите имя сотрудника 2: ");
        String name2 = input.nextLine();
        System.out.println("Введите зарплату: ");
        double salary2 = input.nextDouble();
        input.nextLine();
        System.out.println("Введите язык программирования: ");
        String programmingLanguage = input.nextLine();

        Employee manager = new Manager(name, salary, sizeTeam);
        Employee developer = new Developer(name2, salary2, programmingLanguage);

        manager.work();
        developer.work();
    }
}
