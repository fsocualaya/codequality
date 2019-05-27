package calculator;

public class Calculadora {
    float a ,b;
    Resta resta;
    Suma suma;
    Multiplicacion mult;
    Division divi;
    Calculadora(float aa, float bb) {
        a = aa;
        b = bb;
    }

    void usarSuma(){
        suma = new Suma(a, b);
    }
    void usarResta(){
        resta = new Resta(a, b);
    }
    void usarMult() {
        mult = new Multiplicacion(a,b);
    }
    void userDiv() {
        divi = new Division(a,b);
    }

}
