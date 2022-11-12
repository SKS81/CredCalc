package my.idea.list;

public class CreditPaymentService {

    public float calculate(float s, float p, float m) {

        float p1 = (p / 100 / 12);
        float i = (p1 + 1);
        float n = (float) Math.pow (i, m);
        float g = (n - 1);
        float h = (p1 / g);
        float k = (p1 + h);
        float f = (s * k);
        return f;

    }

}