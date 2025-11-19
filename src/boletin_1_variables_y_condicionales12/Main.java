package boletin_1_variables_y_condicionales12;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 12 - Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés. \n");

        int numero, unidades, decenas, centenas, miles;

        System.out.println("Type a number between 0 and 9.999: \n");

        numero = Entrada.entero();

        System.out.println("\nYou have typed: " + numero);

        if (numero < 0 | numero > 9999) {
            while (numero < 0 | numero > 9999) {
                System.out.println("\nPlease, type a number between 0 and 9.999: \n");
                numero = Entrada.entero();
            }
        }

        if (numero >= 0 & numero <= 9999) {
            System.out.println("\nThe number " + numero + " has been accepted. \n");
            if (numero > 999) {
                unidades = numero % 10;
                decenas = ((numero % 100) - unidades) / 10;
                centenas = ((numero % 1000) - (numero % 100)) / 100;
                miles = ((numero - (numero % 1000)) / 1000);

                System.out.println(unidades + " " + decenas + " " + centenas + " " + miles + "\n");
            }

            if (numero > 99 & numero < 1000) {
                unidades = numero % 10;
                decenas = ((numero % 100) - unidades) / 10;
                centenas = ((numero % 1000) - (numero % 100)) / 100;

                System.out.println(unidades + " " + decenas + " " + centenas);
            }

            if (numero > 9 & numero < 100) {
                unidades = numero % 10;
                decenas = ((numero % 100) - unidades) / 10;

                System.out.println(unidades + " " + decenas);
            }

            if (numero < 10) {
                System.out.println(numero);
            }
        }
    };
};