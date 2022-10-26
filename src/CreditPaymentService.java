public class CreditPaymentService {

    public double calculate(double m) {

        int s = 1_000_000; // Сумма кредита
        double p = 9.99; // Процентная ставка
        double p1 = (p / 100 / 12); // 1/12 %% ставки
        double i = (p1 + 1); // скобки в формуле ан.пл.
        double n = Math.pow (i, m); // степень
        double g = (n - 1); // знаменатель
        double h = (p1 / g); // дробь ;
        double k = (p1 + h); // большие скобки
        double f = (s * k); // ФОРМУЛА
        return f; // вывод результата

    }

}