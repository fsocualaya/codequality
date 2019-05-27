package calculator;


public class Multiplicacion  extends Operation {
    public Multiplicacion(float aa, float bb) {
        a = aa;
        b = bb;
    }

    public float operar() {
        return a*b;
    }
}