package basics.day02;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня недели (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("С помощью switch: Понедельник — рабочий день");
                break;
            case 2:
                    System.out.println("С помощью switch: Вторник — рабочий день");
                    break;
            case 3:
                System.out.println("С помощью switch: Среда — рабочий день");
                break;
            case 4:
                System.out.println("С помощью switch: Четверг — рабочий день");
                break;
            case 5:
                System.out.println("С помощью switch: Пятница — рабочий день");
                break;
            case 6:
                System.out.println("С помощью switch: Суббота — выходной день");
                break;
            case 7:
                System.out.println("С помощью switch: Воскресенье — выходной день");
                break;
            default:
                System.out.println("С помощью switch: Неверный номер дня");
        }

        if ( day > 0 && day < 5) {
            System.out.println("С помощью if-else: Это рабочий день");
        }
        else if ( day > 5 && day < 7) {
            System.out.println("С помощью if-else: Это выходной день");
        }
        else {
            System.out.println("С помощью if-else: Неверный номер дня");
        }
        sc.close();
    }
}
