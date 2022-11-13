package my.idea.list;

public class CreditPaymentService {

    public float calculateAnn(float s, float p, int m) {

        float p0 = (p / 100 / 12);
        float i = (p0 + 1);
        float n = (float) Math.pow (i, m);
        float g = (n - 1);
        float h = (p0 / g);
        float k = (p0 + h);
        float f = (s * k);
        return f;

    }

    public float calcAnnOverpay(float s, int m, int rez) {

        int per = (int) ((rez * m) - s);
        return per;

    }

}