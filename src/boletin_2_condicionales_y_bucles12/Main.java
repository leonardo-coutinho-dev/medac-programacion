package boletin_2_condicionales_y_bucles12;

import java.util.ArrayList;

import util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n12. Pedir un número y calcular su factorial.\n");

        int number, factorial = 1;

        String operation = "";

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Type a number: \n");
        number = Entrada.entero();

        System.out.println("\nThis is the number you entered: " + number + "\n");

        for (int i = number; i > 0; i--) {
            factorial *= i;

            if (i == 1) {
                operation += i;
            } else {
                operation += i + "x";
            }

            numbers.add(i);
        }

        // System.out.println(factorial);

        // System.out.println("\n" + operation + "\n");

        // System.out.println(numbers + "\n");

        System.out.println(operation + " = " + factorial + "\n");

    }
}