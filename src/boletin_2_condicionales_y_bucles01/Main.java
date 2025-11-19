package boletin_2_condicionales_y_bucles01;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\nLeer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo. \n");

        int number;

        System.out.println("Type a integer number: \n");
        number = Entrada.entero();

        while (number >= 0) {
            System.out.println("\nThe square of the number is: " + (number * number) + "\n");
            System.out.println("Type another integer number: \n");
            number = Entrada.entero();
        }

        System.out.println("\nYou typed a negative number, the program is over!");

    }
}
