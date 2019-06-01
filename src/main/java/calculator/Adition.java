package calculator;


public class Adition extends Operation {
    public Adition(float _firstNumber, float _secondNumber) {
        a = _firstNumber;
        b = _secondNumber;
    }

    public float operar() {
      return a+b;
    }
}
