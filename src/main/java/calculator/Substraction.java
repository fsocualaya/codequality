package calculator;

public class Substraction extends Operation {
    public Substraction(float _firstNumber, float _secondNumber) {
        a = _firstNumber;
        b = _secondNumber;
    }
    public float operar() {
        return a-b;
    }
}
