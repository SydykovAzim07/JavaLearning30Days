package basics.day03;

import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число (1-100): ");
//        int number = sc.nextInt();
//        if (number > 100 || number < 1) {
//            do {
//                System.out.println("Неверное число, попробуйте снова:");
//                number = sc.nextInt();
//                if (number <= 100 && number >= 1) {
//                    System.out.println("Число принято: " + number);
//                }
//
//            } while (number > 100 || number < 1);
//        } else {
//            System.out.println("Число принято: " + number);
//        }
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите число (1-100): ");
            number = sc.nextInt();
            if (number < 1 || number > 100) { // Упрощено условие проверки
                System.out.println("Неверное число, попробуйте снова");
            }
        } while (number < 1 || number > 100); // Условие цикла проверяет диапазон
        System.out.println("Число принято: " + number); // Вывод после цикла
        sc.close();
    }
}
