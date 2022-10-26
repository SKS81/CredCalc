public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int m = 12; // Срок кредита 12 = 1 год, 24 = 2 года, 36 = 3 года
        int rez = (int) service.calculate(m);
        System.out.println(rez);

    }

}

