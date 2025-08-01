package basics.day01;

import java.util.Locale;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите ширину: ");
        double width = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите длину: ");
        double lenght = sc.nextDouble();
        double area = width * lenght;
        System.out.println("Площадь вашего прямоугольника равна: " + area);
        sc.close();
    }
}
