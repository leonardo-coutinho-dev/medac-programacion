package boletin_1_variables_y_condicionales04;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 4 - Pedir dos números y decir se son iguales o no. \n");

        // Declaración de variables - numero_1 y numero_2
        double numero_1, numero_2;

        System.out.println("Type the first number: \n");
        numero_1 = Entrada.real();

        System.out.println("Type the second number: \n");
        numero_2 = Entrada.real();

        if (numero_1 == numero_2) {
            System.out.println("\nThe numbers " + numero_1 + " and " + numero_2 + " are equal. \n");
        } else {
            System.out.println("The numbers " + numero_1 + " and " + numero_2 + " are not equal.");
        }
    }
}
