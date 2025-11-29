package boletin_2_condicionales_y_bucles06;

import util.*;

public class Main {
    public static void main() {
        System.out.println(
                "\n6. Pedir números hasta que se tecle un 0, mostrar la suma de todos los números introducidos.\n");

        int number, sum = 0;

        System.out.println("Please, type a number:\n");
        number = Entrada.entero();

        while (number != 0) {
            sum += number;

            System.out.println("\nPlease, type another number:\n");
            number = Entrada.entero();
        }

        System.out.println("\n" + sum);

    }
}