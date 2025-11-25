package boletin_2_condicionales_y_bucles05_1;

import java.util.Random;

import util.*;

public class Main {
    public static void main() {
        System.out.println(
                "\n5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.\n");

        Random N;

        for (int i = 0; i < 10; i++) {
            N = new Random();
            System.out.println(N.nextInt(101));
        }

        System.out.println(ConsoleColors.success("\nCongratulations, you guessed!\n"));
    }
}