package calculator;

public class Calculator {
    float a ,b;
    Substraction substraction;
    Adition adition;
    Multiplication multiplication;
    Division division;
    Calculator(float _firstNumber, float _secondNumber) {
        a = _firstNumber;
        b = _secondNumber;
    }

    void usarSuma(){
        adition = new Adition(a, b);
    }
    void usarResta(){
        substraction = new Substraction(a, b);
    }
    void usarMult() {
        multiplication = new Multiplication(a,b);
    }
    void userDiv() { division = new Division(a,b); }

}
