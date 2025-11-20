package boletin_2_condicionales_y_bucles02;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\n2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0. \n");

        int number;

        System.out.println("Please, type a integer number: \n");
        number = Entrada.entero();

        while (number != 0) {
            if (number > 0) {
                System.out.println(ConsoleColors.success("\nThe number is positive: " + number));
            } else {
                System.out.println(ConsoleColors.error("\nThe number is negative: " + number));
            }

            System.out.println("\nPlease, type another integer number: \n");
            number = Entrada.entero();
        }

    }
}
