package boletin_2_condicionales_y_bucles04;

import util.*;

public class Main {
    public static void main() {

        System.out.println(
                "\n4. Pedir números hasta que se tecle uno negativo, y mostrar cuántos números se han introducido.\n");

        int number, quantity = 0;

        System.out.println("Please, type a integer number (> 0): \n");
        number = Entrada.entero();

        while (number >= 0) {
            quantity++;

            System.out.println("\nPlease, type another integer number (> 0): \n");
            number = Entrada.entero();
        }

        System.out.println(ConsoleColors.success("\nThe amount of numbers typed are: " + quantity + "\n"));

    }
}