package boletin_2_condicionales_y_bucles12;

import util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n12. Pedir un número y calcular su factorial.\n");

        int number, factorial = 1;

        System.out.println("Type a number: ");
        number = Entrada.entero();

        System.out.println("This is the number you entered: " + number);

        for (int i = number; i > 0; i--) {
            factorial *= i;
        }

        System.out.println(factorial);

    }
}