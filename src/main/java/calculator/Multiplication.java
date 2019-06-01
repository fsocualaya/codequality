package calculator;


public class Multiplication extends Operation {
    public Multiplication(float _firstNumber, float _secondNumber) {
        a = _firstNumber;
        b = _secondNumber;
    }

    public float operar() {
        return a*b;
    }
}