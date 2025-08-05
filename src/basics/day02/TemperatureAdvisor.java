package basics.day02;

import java.util.Scanner;

public class TemperatureAdvisor {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру (в градусах Цельсия): ");
        int temperature = sc.nextInt();
        if (temperature >= 25) {
            System.out.println("Жарко, надень легкую одежду");
        }
        else if(15 <= temperature && temperature < 25){
            System.out.println("Тепло, надень кофту");
        } else if (0 <= temperature && temperature < 15) {
            System.out.println("Холодно, надень пальто и шапку");
        }
        else {
            System.out.println("Холодно, надень пальто и шапку");
        }
        sc.close();
    }
}
