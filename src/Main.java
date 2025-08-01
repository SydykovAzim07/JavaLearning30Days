import java.util.Locale;
import java.util.Scanner;

public class Main { // <---- объявление класса
    public static void main(String[] args) { // <---- создание метода,
//        // данный метод является main что означает он главный и отвечает за запуск
//        System.out.println("Hello world!"); // System это класс в пакете JDK, out метод в этом классе который отвечает
//        // за вывод данных, println принимает значения которые нужно вывести и является так же методом,
//        // ("то что необходимо вывести"); так же сюда можно поместить переменные
//        System.out.println("Hi. goofy XD");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите ваше возраст : ");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Введите ваш рост: ");
//        double weight = sc.nextDouble();
//        sc.nextLine();
//        System.out.println("Введите ваше имя: ");
//        String name = sc.next();
//        sc.nextLine();
//        System.out.println("Все ли верно? " + " Имя: " + name + " " + "возраст: " + age + " " + "рост: " + weight + " ");
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число которое хотите умножить на 2:");
//        int userNumber = sc.nextInt();
//        int result = userNumber * 2;
//        System.out.println("Ваше число, умноженное на 2 ровняется: " + multiplications);
//        sc.close();
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