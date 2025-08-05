package basics.day03;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i = 1;
//        int result = 0;
//        while (i != 0) {
//            System.out.println("Введите число (0 для завершения):");
//            i = sc.nextInt();
//            result = result + i;
//            if (i == 0) {
//                System.out.println("Сумма чисел: " + result);
//            }
//        }
//        sc.close();


        Scanner sc = new Scanner(System.in);
        int result = 0; // Переименовал переменную 'result' для ясности
        int number; // Переименовал 'i' в 'number' для семантической точности

        System.out.println("Введите число (0 для завершения):");
        number = sc.nextInt();
        while (number != 0) { // Условие цикла остается, но убрано лишнее условие внутри
            result += number; // Добавляем число к сумме до проверки на 0
            System.out.println("Введите число (0 для завершения):");
            number = sc.nextInt();
        }
        System.out.println("Сумма чисел: " + result); // Вывод суммы после цикла

        sc.close();
    }
}

