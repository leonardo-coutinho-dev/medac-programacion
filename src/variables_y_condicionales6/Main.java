package variables_y_condicionales6;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 6 - Pedir dos números y decir se uno es múltiplo del otro. \n");

        // Declaración de variables - numero_1 y numero_2
        double numero_1, numero_2;

        System.out.println("Type the first number: \n");
        numero_1 = Entrada.real();

        System.out.println("\nType the second number: \n");
        numero_2 = Entrada.real();

        if (numero_1 % numero_2 == 0) {
            System.out.println("\nThe number " + numero_1 + " is multiple of " + numero_2 + "\n");
        } else if (numero_1 % numero_2 != 0) {
            System.out.println("The number " + numero_1 + " is not multiple of " + numero_2);
        };
    };
};