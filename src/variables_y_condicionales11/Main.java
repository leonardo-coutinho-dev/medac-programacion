package variables_y_condicionales11;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 11 - Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene. \n");

        int numero;

        System.out.println("Please, type a number between 0 and 9.999: \n");
        numero = Entrada.entero();

        System.out.println("\nYou have typed: " + numero + "\n");
        System.out.println("Type: " + ((Object)numero).getClass().getName());

        if (numero < 0 | numero > 9999) {
            while (numero < 0 | numero > 9999) {
                System.out.println("\nPlease, type a number between 0 and 9.999: \n");
                numero = Entrada.entero();
            }
        }

        if (numero >= 0 & numero <= 9999) {
            System.out.println("\nThe number " + numero + " has been accepted. \n");

            if (numero < 10) {
                System.out.println("The number has 1 digit. \n");
            } else {
                if (numero < 100) {
                    System.out.println("The number has 2 digits. \n");
                } else {
                    if (numero < 1000) {
                        System.out.println("The number has 3 digits. \n");
                    } else {
                        if (numero < 10000) {
                            System.out.println("The number has 4 digits. \n");
                        }
                    }
                }
            }
        }
    }
}