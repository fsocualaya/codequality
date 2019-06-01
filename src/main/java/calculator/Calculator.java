package calculator;

public class Calculator {
    float a ,b;
    Substraction substraction;
    Adition adition;
    Multiplication mult;
    Division divi;
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
        mult = new Multiplication(a,b);
    }
    void userDiv() { divi = new Division(a,b); }

}
