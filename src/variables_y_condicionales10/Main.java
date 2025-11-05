package variables_y_condicionales10;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 10 - Pedir tres números y mostrarlos ordenados de mayor a menor. \n");

        double numero_1, numero_2, numero_3;

        System.out.println("Type the first number: \n");
        numero_1 = Entrada.real();

        System.out.println("Type the second number: \n");
        numero_2 = Entrada.real();

        System.out.println("Type the third number: \n");
        numero_3 = Entrada.real();

        if (numero_1 > numero_2 & numero_2 > numero_3) {
            System.out.println("\nI. " + numero_1 + "\nII. " + numero_2 + "\nIII." + numero_3 + "\n");
        } else if (numero_1 < numero_2 & numero_2 < numero_3) {
            System.out.println("\nI. " + numero_3 + "\nII. " + numero_2 + "\nIII." + numero_1 + "\n");
        } else if (numero_1 > numero_2 & numero_2 < numero_3 & numero_1 > numero_3) {
            System.out.println("\nI. " + numero_1 + "\nII. " + numero_3 + "\nIII." + numero_2 + "\n");
        } else if (numero_1 > numero_2 & numero_2 < numero_3 & numero_1 < numero_3) {
            System.out.println("\nI. " + numero_3 + "\nII. " + numero_1 + "\nIII." + numero_2 + "\n");
        } else if (numero_1 < numero_2 & numero_2 > numero_3  & numero_1 > numero_3) {
            System.out.println("\nI. " + numero_2 + "\nII. " + numero_1 + "\nIII." + numero_3 + "\n");
        } else if (numero_1 < numero_2 & numero_2 > numero_3 & numero_1 < numero_3) {
            System.out.println("\nI. " + numero_2 + "\nII. " + numero_3 + "\nIII." + numero_1 + "\n");
        } else if (numero_1 == numero_2) {
            System.out.println("The numbers are equal. " + "(" + numero_1 + " = " + numero_2 + ")");
        };
    }
}