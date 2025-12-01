package boletin_2_condicionales_y_bucles10;

import util.*;

public class Main {
    public static void main() {
        System.out.println("\n10. Pedir 15 números y escribir la suma total.");

        int number, suma = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("\nType the " + i + "º number:\n");
            number = Entrada.entero();

            suma += number;
        }

        System.out.println("\nThe total value of the sum is: " + suma + "\n");
    }
}