

package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        float firstNumber = 0;
        float secondNumber = 0;
        char operator;
        System.out.println("Ingresa numero 1 : ");
        firstNumber = sc.nextFloat();
        System.out.println("Ingresa el operador : ");
        operator = sc.next().charAt(0);
        System.out.println("Ingresa numero 2 : ");
        secondNumber = sc.nextFloat();
        if (operator == '/' && secondNumber == 0) {
            System.out.println("ERROR NO SE PUEDE DIVIDIR ENTRE CERO");
        }
        else {
            Calculator calc = new Calculator(firstNumber, secondNumber);
            if(operator == '+' ) {
                calc.usarSuma();
                System.out.print("La suma es: ");
                System.out.println(calc.adition.operar());
            }
            if(operator == '-') {
                calc.usarResta();
                System.out.print("La resta es: ");
                System.out.println(calc.substraction.operar());
            }

            if(operator == '*') {
                calc.usarMult();
                System.out.print("La multiplicacion es: ");
                System.out.println(calc.multiplication.operar());
            }

            if (operator == '/') {
                calc.userDiv();
                System.out.print("La division es: ");
                System.out.println(calc.division.operar());
            }
        }
    }
}
