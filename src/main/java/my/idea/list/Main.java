package my.idea.list;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        Scanner console = new Scanner(System.in);
        System.out.println("Вас приветствует программа Кредитный калькулятор.");
        System.out.println("Расчёт аннуитетного платежа.");
        System.out.println();
        System.out.println("Если числа дробные, используйте запятую.");
        System.out.println("Укажите сумму кредита:");
        float s = console.nextFloat();
        System.out.println("Если числа дробные, используйте запятую.");
        System.out.println("Укажите %%-ставку по кредиту:");
        float p = console.nextFloat();
        System.out.println("Укажите срок кредита в полных месяцах:");
        int m = console.nextInt();
        int rez = (int) service.calculateAnn(s, p, m);
        System.out.println("Размер аннуитетного платежа: " + rez);
        int annOver = (int) service.calcAnnOverpay(s, m, rez);
        System.out.println("Ваша переплата за " + m + " месяцев составит: " + annOver);
        System.out.println();
        System.out.println("Расчёт является ознакомительным, значения округлены.");
        System.out.println("Результат может отличаться от расчёта в банке, т.к. здесь не учтены возможные дополнительные банковские комиссии и страховки.");

    }

}