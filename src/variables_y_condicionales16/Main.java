package variables_y_condicionales16;

import util.ConsoleColors;
import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBoletin 1 - Variables y condicionales \n");

        System.out.println(
                "Ejercício 16 - Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 dias. \n");

        System.out.println("1. (dia - condition: 28, 30 or 31) \n");
        System.out.println("2. (mes - condition: 1 to 12) \n");
        System.out.println("3. (ano - condition: ano > 0) \n");

        /**
         * MES 01: 31 DIAS //x
         * MES 02: 28 DIAS
         * MES 03: 31 DIAS //x
         * MES 04: 30 DIAS
         * MES 05: 31 DIAS //x
         * MES 06: 30 DIAS
         * MES 07: 31 DIAS //x
         * MES 08: 31 DIAS //x
         * MES 09: 30 DIAS
         * MES 10: 31 DIAS //x
         * MES 11: 30 DIAS
         * MES 12: 31 DIAS //x
         */

        int dia, mes, ano;
        String error = "e"; // y = year (año); m = month (mes); d = day (dia)

        System.out.println("Type a day: \n");
        dia = Entrada.entero();

        System.out.println("\nType a month: \n");
        mes = Entrada.entero();

        System.out.println("\nType a year: \n");
        ano = Entrada.entero();

        System.out.println("\nLa fecha es la seguinte: " + dia + "/" + mes + "/" + ano + "\n");

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia < 1 | dia > 31)
                    error += "d";
                break;
            case 2:
                if (dia < 1 | dia > 28)
                    error += "d";
                break;
            default:
                if (dia < 1 | dia > 30)
                    error += "d";
                break;
        }
        ;

        if (mes < 1 | mes > 12) {
            error += "m";
        }
        ;

        if (ano < 1) {
            error += "y";
        }
        ;

        if (error == "e") {
            System.out.println(ConsoleColors.success("La fecha es correcta! \n"));
        } else {
            System.out.println(ConsoleColors.error("La fecha es incorrecta! \n"));
        }
        ;

        // include d28, d30 or d31 to identify which month and provide a hint to the
        // user
    };
};