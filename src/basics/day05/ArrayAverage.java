package basics.day05;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива (1-10): ");
        int num = sc.nextInt();
        if (num >= 1 && num <= 10) {
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Введите число " + (i + 1) +":");
                arr[i] = sc.nextInt();
            }
            System.out.println("Среднее арифметическое: " + calculateAverage(arr));

        } else {
            System.out.println("Неверный размер массива");
        }
        sc.close();
    }
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) return 0.0; // Проверка на пустой массив
        int sum = 0;
        for (int num : arr) { // Используем for-each для читаемости
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
