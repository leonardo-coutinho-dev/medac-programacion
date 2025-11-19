package boletin_1_variables_y_condicionales13_1;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nBoletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 13 - Pedir un número entre 0 y 9.999, y decir se es capicús \n");

        int numero, unidades, decenas, centenas, miles;

        System.out.println("Type a number between 0 and 9.999: \n");

        numero = Entrada.entero();

        System.out.println("\nYou have typed: " + numero);

        if (numero < 0 | numero > 9999) {
            while (numero < 0 | numero > 9999) {
                System.out.println("\nNot allowed: Please, type a number between 0 and 9.999: \n");
                numero = Entrada.entero();
            }
            ;
        }
        ;

        if (numero >= 0 & numero <= 9999) {
            System.out.println("\nThe number " + numero + " has been accepted. \n");
            if (numero > 999) {
                unidades = numero % 10;
                decenas = ((numero % 100) - unidades) / 10;
                centenas = ((numero % 1000) - (numero % 100)) / 100;
                miles = ((numero - (numero % 1000)) / 1000);

                System.out.println(unidades + " " + decenas + " " + centenas + " " + miles);

                if (unidades == miles & decenas == centenas) {
                    System.out.println(ConsoleColors.success("\n The number " + numero + " is a palindrome. " + numero
                            + " = " + unidades + decenas + centenas + miles + " \n"));
                } else {
                    System.out.println(ConsoleColors.error("\n The number " + numero + " is not a palindrome. " + numero
                            + " != " + unidades + decenas + centenas + miles + " \n"));
                }
                ;
            }
            ;

            if (numero > 99 & numero < 1000) {
                unidades = numero % 10;
                decenas = ((numero % 100) - unidades) / 10;
                centenas = (numero - (numero % 100)) / 100;

                System.out.println(unidades + " " + decenas + " " + centenas);

                if (unidades == centenas) {
                    System.out.println(ConsoleColors.success("\n The number " + numero + " is a palindrome. " + numero
                            + " = " + unidades + decenas + centenas + " \n"));
                } else {
                    System.out.println(ConsoleColors.error("\n The number " + numero + " is not a palindrome. " + numero
                            + " != " + unidades + decenas + centenas + " \n"));
                }
                ;
            }
            ;

            if (numero > 9 & numero < 100) {
                unidades = numero % 10;
                decenas = (numero - (numero % 10)) / 10;

                System.out.println(unidades + " " + decenas);

                if (unidades == decenas) {
                    System.out.println(ConsoleColors.success("\n The number " + numero + " is a palindrome. " + numero
                            + " = " + unidades + decenas + " \n"));
                } else {
                    System.out.println(ConsoleColors.error("\n The number " + numero + " is not a palindrome. " + numero
                            + " != " + unidades + decenas + " \n"));
                }
                ;
            }
            ;

            if (numero < 10) {
                System.out.println(numero);
            }
            ;
        }
        ;
    };
};