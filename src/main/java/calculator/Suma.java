package calculator;


public class Suma  extends Operation {
    public Suma(float aa, float bb) {
        a = aa;
        b = bb;
    }

    public float operar() {
      return a+b;
    }
}
