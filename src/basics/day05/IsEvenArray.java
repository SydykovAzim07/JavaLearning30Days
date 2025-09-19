package basics.day05;

import java.util.Scanner;

public class IsEvenArray {
    public static boolean isAllEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива (1-10): ");
        int num = sc.nextInt();
        if (num >= 1 && num <= 10) {
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                System.out.println("Введите число " + (i + 1) + " :");
                arr[i] = sc.nextInt();
            }
            System.out.println("Все элементы четные: " + isAllEven(arr));
        }
        else {
            System.out.println("Неверный размер массива");
        }
        sc.close();
    }
}
