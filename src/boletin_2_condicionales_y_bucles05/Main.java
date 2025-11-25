package boletin_2_condicionales_y_bucles05;

import util.*;

public class Main {
    public static void main() {
        System.out.println(
                "\n5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.\n");

        int N, number;

        System.out.println("Please, enter the number to be guessed:\n");
        N = Entrada.entero();

        System.out.println("\nTry to guess the number:\n");
        number = Entrada.entero();

        while (number != N) {

            if (number < N) {
                System.out.println(ConsoleColors.error("\nThe number you typed is lower, try higher! (+) \n"));
            } else {
                System.out.println(ConsoleColors.error("\nThe number you typed is higher, try lower! (-) \n"));
            }

            number = Entrada.entero();

        }

        System.out.println(ConsoleColors.success("\nCongratulations, you guessed!\n"));

    }
}