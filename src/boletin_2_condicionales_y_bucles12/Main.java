package boletin_2_condicionales_y_bucles12;

import java.util.ArrayList;

import java.math.BigInteger;

import util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n12. Pedir un número y calcular su factorial.\n");

        int number = 1;

        BigInteger factorial_bigInteger = BigInteger.ONE;

        String operation = "";

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Type a number: \n");
        number = Entrada.entero();

        System.out.println("\nThis is the number you entered: " + number + "\n");

        operation += number + "! = ";

        for (int i = number; i > 0; i--) {
            factorial_bigInteger = factorial_bigInteger.multiply(BigInteger.valueOf(i));

            // if (i == 1) {
            // operation += i;
            // } else {
            // operation += i + " x ";
            // }

            numbers.add(i);
        }

        // System.out.println(operation + " = " + factorial_bigInteger + "\n");

        System.out.println(operation + factorial_bigInteger);

    }
}