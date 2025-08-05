package basics.day02;

import java.util.Scanner;

public class AccessChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = sc.nextInt();
        System.out.println("Есть ли подписка? (true/false): ");
        boolean hasSubscription = sc.nextBoolean();

        if (hasSubscription && age >= 18) {
            System.out.println("Доступ разрешен");
        }
        else if (age < 18 && hasSubscription ) {
            System.out.println("Доступ ограничен: возраст меньше 18");
        }
        else if (age >= 18 && !hasSubscription) {
            System.out.println("Доступ ограничен: требуется подписка");
        }
        else if (age < 18 && !hasSubscription) {
            System.out.println("Доступ запрещен");
        }
        sc.close();
    }
}
