package boletin_2_condicionales_y_bucles07;

import util.*;

public class Main {
    public static void main() {
        System.out.println("\n7. Pedir números hasta que se introduzca uno negativo, y calcular la media.\n");

        int number, sum = 0, count = 0;

        float arithmetic_mean;

        System.out.println("Please, type a number: \n");
        number = Entrada.entero();

        while (number >= 0) {
            sum += number;
            count++;

            System.out.println("\nPlease, type another number: \n");
            number = Entrada.entero();

        }

        if (count != 0) {
            arithmetic_mean = (float) sum / count;

            System.out.println("\nThis is the arithmetic mean: \n");
            System.out.println(arithmetic_mean + "\n");
        } else {
            System.out.println("\nImpossible to divide by zero (no positive numbers entered)!\n");
        }

    }
}