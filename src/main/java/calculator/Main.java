

package calculator;

import java.util.Scanner;

public class Main {
    static boolean  tienedosnum(String cade) {
        String[] cortado = cade.split("");
        int suma = cade.indexOf('+');
        int resta = cade.indexOf('-');
        if(suma >= 0 && resta >= 0) {
            return false;
        }
        if (suma >= 0) return false;
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String matematica = "";
        do {
            System.out.println("Ingresar la expresion que contenga 2 numeros y un operador como + o -");
            matematica = sc.nextLine();

            Calculadora calculadora = new Calculadora(3, 4);
            System.out.println(calculadora.resta.operar());
            System.out.println(calculadora.suma.operar());

        } while(tienedosnum(matematica));
    }
}
