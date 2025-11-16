package variables_y_condicionales22;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\nEjercicio 22 - Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.\n");

        int number;

        // String numString;

        System.out.println("Please, type a number between 0 and 99: \n");
        number = Entrada.entero();

        if (number >= 0 && number < 100) {
            System.out.println(ConsoleColors.success("The number is in range."));

            System.out.println((number - (number % 10)) / 10);

            System.out.println(number % 10);

        } else {
            System.out.println(ConsoleColors.error("The number is out of range."));
        }

    };
}