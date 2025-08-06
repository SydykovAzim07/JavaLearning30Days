package basics.day04;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива (1-10): ");
        int[] arr = new int[sc.nextInt()];
        int [] reverseArr = new int[arr.length];
        if (arr.length <= 10 && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {

                  System.out.println("Введите число " + (i + 1) + " :");
                  arr[i] = sc.nextInt();
                  reverseArr[arr.length - 1 - i] = arr[i];
            }
            System.out.println("Исходный массив: " + Arrays.toString(arr));
            System.out.println("Перевернутый массив: " + Arrays.toString(reverseArr));
        } else {
            System.out.println("Неверный размер массива");
        }
        sc.close();
    }
}
