package boletin_1_variables_y_condicionales17;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBoletin 1 - Variables y condicionales \n");

        System.out.println(
                "Ejercício 17 - Pedir el dia, mes y año de una fecha correcta y mostrar la fecha del dia siguiente. suponer que todos los meses tienen 30 dias. \n");

        int dia, mes, ano;

        String error = "e"; // d m y

        System.out.println("Type a day: \n");
        dia = Entrada.entero();

        System.out.println("\nType the month: \n");
        mes = Entrada.entero();

        System.out.println("\nType the year: \n");
        ano = Entrada.entero();

        System.out.println("\nLa fecha es la siguiente: \n");

        System.out.println(dia + "/" + mes + "/" + ano + "\n");

        if (dia < 1 | dia > 30)
            error += "d";

        if (mes < 1 | mes > 12)
            error += "m";

        if (ano < 1)
            error += "y";

        if (error.contains("d") | error.contains("m") | error.contains("y")) {
            System.out.println(ConsoleColors.error("Wrong value(s), please, try again!\n"));
        } else {
            System.out.println(ConsoleColors.success("Correct values!" + "\n"));

            if (dia == 30 & mes != 12) {
                dia = 1;
                mes += 1;
            } else if (dia == 30 & mes == 12) {
                dia = 1;
                mes = 1;
                ano += 1;
            } else if (dia < 30) {
                dia += 1;
            }
            ;

            System.out.println("The next day is: \n");

            System.out.println(dia + "/" + mes + "/" + ano);

            if (dia == 1 & mes == 1)
                System.out.println("\nHappy new year!\n");
        }
    };
};