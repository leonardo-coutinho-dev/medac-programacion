package variables_y_condicionales13;

import util.Entrada;

import util.ConsoleColors;

/**
 * This program has a issue with numbers that ends with 0, for example: 10, 20, 30, 40, ..., 500, 600, 700, ..., 8000, 9000.
 * In this case, the inverse number will lose the 0 at the beginning, so the inverse number will have less digits than the original number.
 * For example:
 * If the user types 10, the inverse number will be 1.
 * If the user types 100, the inverse number will be 1.
 * If the user types 1000, the inverse number will be 1.
 * This issue can be solved by treating the number as a string, but for now, we will keep it as an integer to keep the code simple.
 */

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\nBoletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 13 - Pedir un número entre 0 y 9.999, y decir se es capicús \n");
        
        int numero, inverse_numero, unidades, decenas, centenas, miles;

        System.out.println("Type a number between 0 and 9.999: \n");

        numero = Entrada.entero();

        System.out.println("\nYou have typed: " + numero);

        if (numero < 0 | numero > 9999) {
            while (numero < 0 | numero > 9999) {
                System.out.println("\nPlease, type a number between 0 and 9.999: \n");
                numero = Entrada.entero();
            };
        };

        if (numero >= 0 & numero <= 9999) {
            System.out.println("\nThe number " + numero + " has been accepted. \n");
            if (numero > 999) {
                unidades = numero % 10;
                decenas = ((numero % 100) - unidades) / 10;
                centenas = ((numero % 1000) - (numero % 100)) / 100;
                miles = ((numero - (numero % 1000)) / 1000);

                inverse_numero = 1000 * unidades + 100 * decenas + 10 * centenas + miles;

                System.out.println(unidades + " " + decenas + " " + centenas + " " + miles);

                System.out.println("\nThe inverse number is: " + inverse_numero + " " + ((Object)inverse_numero).getClass().getName());

                if (numero == inverse_numero) {
                    System.out.println(ConsoleColors.success("\nThe number " + numero + " is a palindrome." + " " + numero + " = " + inverse_numero  + "\n"));
                } else {
                    System.out.println(ConsoleColors.error("\nThe number " + numero + " is not a palindrome." + " " + numero + " != " + inverse_numero  + "\n"));
                };
            };

            if (numero > 99 & numero < 1000) {
                unidades = numero % 10;
                decenas = ((numero % 100) - unidades) / 10;
                centenas = (numero - (numero % 100)) / 100;

                inverse_numero = 100 * unidades + 10 * decenas + centenas;

                System.out.println(unidades + " " + decenas + " " + centenas);

                System.out.println("\nThe inverse number is: " + inverse_numero + " " + ((Object)inverse_numero).getClass().getName());

                if (numero == inverse_numero) {
                    System.out.println(ConsoleColors.success("\nThe number " + numero + " is a palindrome." + " " + numero + " = " + inverse_numero  + "\n"));
                } else {
                    System.out.println(ConsoleColors.error("\nThe number " + numero + " is not a palindrome." + " " + numero + " != " + inverse_numero  + "\n"));
                };
            };

            if (numero > 9 & numero < 100) {
                unidades = numero % 10;
                decenas = (numero - (numero % 10)) / 10;

                inverse_numero = 10 * unidades + decenas;

                System.out.println(unidades + " " + decenas);

                System.out.println("\nThe inverse number is: " + inverse_numero + " " + ((Object)inverse_numero).getClass().getName());

                if (numero == inverse_numero) {
                    System.out.println(ConsoleColors.success("\nThe number " + numero + " is a palindrome." + " " + numero + " = " + inverse_numero  + "\n"));
                } else {
                    System.out.println(ConsoleColors.error("\nThe number " + numero + " is not a palindrome." + " " + numero + " != " + inverse_numero  + "\n"));
                };
            };

            if (numero < 10) {
                System.out.println(numero);
            };
        };
    };
};