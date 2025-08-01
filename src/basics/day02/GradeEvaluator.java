package basics.day02;


import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5: ");
        int grade = sc.nextInt();
        if (grade == 5) {
            System.out.println("Отлично");
        }
        else if (grade == 4) {
            System.out.println("Хорошо");
        }
        else if (grade == 3) {
            System.out.println("Удовлетворительно");
        }
        else if (grade == 2) {
            System.out.println("Неудовлетворительно");
        }
        else if (grade == 1) {
            System.out.println("Плохо");
        }
        else {
            System.out.println("Неверная оценка");
        }

        System.out.println("С использование switch: ");
        switch (grade) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 1:
                System.out.println("Плохо");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        sc.close();
    }
}
