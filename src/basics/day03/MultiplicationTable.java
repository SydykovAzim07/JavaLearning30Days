package basics.day03;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число (1-10):");
//        int num = sc.nextInt();
//        if (1 <= num && num <= 10) {
//            for (int i = 1; i < 11; i++) {
//                int multiplication = num * i;
//                System.out.println(num + " x " + i + " = " + multiplication);
//            }
//        }
//        else {
//            System.out.println("Неверное число");
//        }
//        sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число (1-10):");
        int num = sc.nextInt();
        if (num >= 1 && num <= 10) { // Уточнено условие для большей ясности
            for (int i = 1; i <= 10; i++) { // Изменено условие цикла на i <= 10 для точности
                System.out.println(num + " x " + i + " = " + (num * i)); // Убрана переменная multiplication
            }
        } else {
            System.out.println("Неверное число");
        }
        sc.close();
    }
}
