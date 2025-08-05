package basics.day02;

import java.util.Locale;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите стоимость покупки: ");
        double price = sc.nextDouble();
        System.out.println("Вы премиум-клиент? (true/false): ");
        boolean isPremium = sc.nextBoolean();
        if (price >= 1000 && isPremium) {
            System.out.println("Итоговая стоимость после скидки: " + price * (1 - 0.15));
        }
        else if (price < 1000 && isPremium) {
            System.out.println("Итоговая стоимость после скидки: " + price * (1 - 0.10));
        }
        else if (price >= 1000 && !isPremium) {
            System.out.println("Итоговая стоимость после скидки: " + price * (1 - 0.05));
        }
        else {
            System.out.println("Итоговая стоимость после скидки: " + price );
        }
        sc.close();
    }
}
