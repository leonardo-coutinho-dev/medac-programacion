package variables_y_condicionales5;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 5 - Pedir un número y indicar si es positivo o negativo. \n");

        double numero;

        System.out.println("Type the number: \n");
        numero = Entrada.real();

        if (numero < 0) {
            System.out.println("\nThe number is negative. " + "(" + numero + ")" + "\n");
        } else if (numero == 0) {
            System.out.println("\nThe number is zero. " + "(" + numero + ")" + "\n");
        } else {
            System.out.println("The number is positive. " + "(" + numero + ")");
        }
    }
}