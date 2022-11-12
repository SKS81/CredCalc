package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditPaymentServiceTest {

    @Test
    public void rez12Month() {
        CreditPaymentService service = new CreditPaymentService();
        int expected = 87911;
        int actual = (int) service.calculate(1_000_000, (float) 9.99, 12);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

    @Test
    public void rez24Month() {
        CreditPaymentService service = new CreditPaymentService();
        int expected = 46140;
        int actual = (int) service.calculate(1_000_000, (float) 9.99, 24);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

    @Test
    public void rez36Month() {
        CreditPaymentService service = new CreditPaymentService();
        int expected = 32262;
        int actual = (int) service.calculate(1_000_000, (float) 9.99, 36);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");
    }

}