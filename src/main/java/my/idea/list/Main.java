package my.idea.list;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        Scanner console = new Scanner(System.in);
        System.out.println("Вас приветствует программа Кредитный калькулятор");
        System.out.println("Расчёт аннуитетного платежа");
        System.out.println();
        System.out.println("Если числа дробные, используйте запятую.");
        System.out.println("Укажите сумму кредита:");
        float s = console.nextFloat();
        System.out.println("Если числа дробные, используйте запятую.");
        System.out.println("Укажите %%-ставку по кредиту:");
        float p = console.nextFloat();
        System.out.println("Укажите срок кредита в полных месяцах:");
        float m = console.nextFloat();
        int rez = (int) service.calculate(s, p, m);
        System.out.println("Размер аннуитетного платежа: " + rez);

    }

}