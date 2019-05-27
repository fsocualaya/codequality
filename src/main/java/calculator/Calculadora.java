package calculator;

public class Calculadora {
    float a ,b;
    Resta resta;
    Suma suma;
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

}
