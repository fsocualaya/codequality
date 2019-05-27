package calculator;

public class Resta extends Operation {
    public Resta(float aa, float bb) {
        a = aa;
        b = bb;
    }
    public float operar() {
        return a-b;
    }
}
