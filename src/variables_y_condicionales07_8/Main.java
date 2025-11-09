package variables_y_condicionales07_8;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 7 - Pedir dos números y decir cual es el mayor. \n");
        System.out.println("Ejercício 8 - Pedir dos números y decir cual es el mayor o si son iguales. \n");

        double numero_1, numero_2;

        System.out.println("Type the first number: \n");
        numero_1 = Entrada.real();

        System.out.println("Type the second number: \n");
        numero_2 = Entrada.real();

        if (numero_1 > numero_2) {
            System.out.println("\nThe first number is biger than the second one. " + "(" + numero_1 + " > " + numero_2 + ")" + "\n");
        } else if (numero_1 < numero_2) {
            System.out.println("\nThe second number is biger than the first one. " + "(" + numero_2 + " > " + numero_1 + ")" + "\n");
        } else if (numero_1 == numero_2) {
            System.out.println("The numbers are equal. " + "(" + numero_1 + " = " + numero_2 + ")");
        };
    };
};