package basics.day01;

import java.util.Scanner;

public class VariablesPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше возраст : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите ваш рост: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите ваше имя: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Все ли верно? " + " Имя: " + name + " " + "возраст: " + age + " " + "рост: " + weight + " ");
        sc.close();
    }
}
