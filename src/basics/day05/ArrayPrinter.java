package basics.day05;

import java.util.Scanner;

public class ArrayPrinter {
       public static void printArray(int[] arr, String prefix) {
        for (int num : arr) {
            System.out.println(prefix + ": " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива (1-10): ");
        int num = sc.nextInt();
        if (num >= 1 && num <= 10) {
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Введите число " + (i + 1) + " : ");
                arr[i] = sc.nextInt();
            }
         printArray(arr, "Элемент");
         printArray(arr, "Число");

        }
        else {
            System.out.println("Неверный размер массива");
        }
        sc.close();

    }
}
