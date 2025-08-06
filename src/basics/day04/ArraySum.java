package basics.day04;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива (1-10): ");
        int [] arr = new int[sc.nextInt()];
        int result = 0;
        if (arr.length <= 10 && arr.length > 0) {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Введите число " + (i + 1) + " :");
                arr[i] = sc.nextInt();
                result += arr[i];
            }
            System.out.println("Сумма элементов: " + result);
        }
        else {
            System.out.println("Неверный размер массива");
        }
        sc.close();
    }
}
