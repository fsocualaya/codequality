

package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String matematica = "";
        float a = 0;
        float b = 0;
        char operator;
        System.out.println("Ingresa numero 1 : ");
        a = sc.nextFloat();
        System.out.println("Ingresa el operador : ");
        operator = sc.next().charAt(0);
        System.out.println("Ingresa numero 2 : ");
        b = sc.nextFloat();
        if (operator == '/' && b == 0) {
            System.out.println("ERROR NO SE PUEDE DIVIDIR ENTRE CERO");
        }
        else {
            Calculadora calc = new Calculadora(a, b);
            if(operator == '+' ) {
                calc.usarSuma();
                System.out.println(calc.suma.operar());
            }
            if(operator == '-') {
                calc.usarResta();
                System.out.println(calc.resta.operar());
            }

            if(operator == '*') {
                calc.usarMult();
                System.out.println(calc.mult.operar());
            }

            if (operator == '/') {
                calc.userDiv();
                System.out.println(calc.divi.operar());
            }
        }
    }
}
