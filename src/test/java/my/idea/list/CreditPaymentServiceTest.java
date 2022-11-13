package my.idea.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditPaymentServiceTest {

    @Test
    public void rez12Month() {

        CreditPaymentService service = new CreditPaymentService();
        int expected = 87911;
        int actual = (int) service.calculateAnn(1_000_000, (float) 9.99, 12);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");

    }

    @Test
    public void rez24Month() {

        CreditPaymentService service = new CreditPaymentService();
        int expected = 46140;
        int actual = (int) service.calculateAnn(1_000_000, (float) 9.99, 24);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");

    }

    @Test
    public void rez36Month() {

        CreditPaymentService service = new CreditPaymentService();
        int expected = 32262;
        int actual = (int) service.calculateAnn(1_000_000, (float) 9.99, 36);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");

    }

    @Test
    public void overPay12Month() {
        CreditPaymentService service = new CreditPaymentService();
        int expected = 54932;
        int actual = (int) service.calcAnnOverpay(1_000_000, 12, 87911);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");

    }

    @Test
    public void overPay24Month() {
        CreditPaymentService service = new CreditPaymentService();
        int expected = 107360;
        int actual = (int) service.calcAnnOverpay(1_000_000, 24, 46140);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");

    }

    @Test
    public void overPay36Month() {
        CreditPaymentService service = new CreditPaymentService();
        int expected = 161432;
        int actual = (int) service.calcAnnOverpay(1_000_000, 36, 32262);
        Assertions.assertEquals(expected, actual);
        System.out.println("Ожидаемый результат > " + expected + " = " + actual + " < Фактический результат");

    }

}