package boletin_2_condicionales_y_bucles03;

import util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\n3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. \n");

        int number;

        System.out.println("Please, type a integer number: \n");
        number = Entrada.entero();

        while (number != 0) {

            if (number % 2 == 0) {
                System.out.println(ConsoleColors.success("\nThe number is even! \n"));
            } else {
                System.out.println(ConsoleColors.error("\nThe number is odd! \n"));
            }

            System.out.println("---------------------------------- \n");

            System.out.println("Please, type another integer number: \n");
            number = Entrada.entero();
        }
    }
}