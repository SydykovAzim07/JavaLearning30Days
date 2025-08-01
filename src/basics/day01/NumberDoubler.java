package basics.day01;

import java.util.Scanner;

public class NumberDoubler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число которое хотите умножить на 2:");
        int userNumber = sc.nextInt();
        int result = userNumber * 2;
        System.out.println("Ваше число, умноженное на 2 ровняется: " + result);
        sc.close();
    }
}
