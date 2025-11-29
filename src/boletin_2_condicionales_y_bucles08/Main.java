package boletin_2_condicionales_y_bucles08;

import util.*;

public class Main {
    public static void main() {
        System.out.println("\n8. Pedir un número N, y mostrar todos los números del 1 al N.\n");

        int number;

        System.out.println("Please, type a number: \n");
        number = Entrada.entero();

        System.out.println("\nFrom 1 to " + number + ":\n");

        for (int i = 1; i <= number; i++) {
            System.out.println(i + "\n");
        }

    }
}