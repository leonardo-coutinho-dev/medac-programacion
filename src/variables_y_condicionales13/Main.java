package variables_y_condicionales13;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 13 - Pedir un número entre 0 y 9.999, y decir se es capicús \n");

        System.out.println("Type a number between 0 and 9.999: \n");

        int numero;

        numero = Entrada.entero();

        System.out.println("\nYou have typed: " + numero);

        if (numero < 0 | numero > 9999) {
            while (numero < 0 | numero > 9999) {
                System.out.println("\nPlease, type a number between 0 and 9.999: \n");
                numero = Entrada.entero();
            }
        }

        if (numero >= 0 & numero <= 9999) {
            System.out.println("\nThe number " + numero + " has been accepted. \n");
        }
    }
}