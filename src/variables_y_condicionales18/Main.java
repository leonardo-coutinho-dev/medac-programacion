package variables_y_condicionales18;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\nEjercício 17 - Pedir el dia, mes y año de una fecha correcta y mostrar la fecha del dia siguiente. suponer que todos los meses tienen 30 dias. \n");

        System.out.println(
                "Ejercício 18 - Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 dias). \n");

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

        int[] result;

        String error = "e";

        System.out.println("Type a day: \n");
        dia = Entrada.entero();

        System.out.println("\nType a month: \n");
        mes = Entrada.entero();

        System.out.println("\nType a year: \n");
        ano = Entrada.entero();

        System.out.println("\nLa fecha es la siguiente: \n");

        System.out.println(ConsoleColors.success(dia + "/" + mes + "/" + ano + "\n"));

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

        if (mes < 1 | mes > 12) {
            error += "m";
        }

        if (ano < 1) {
            error += "y";
        }

        if (error == "e") {
            System.out.println(ConsoleColors.success("La fecha es válida! \n"));

            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    result = nextDayCalculator(dia, mes, ano, 31);
                    break;
                case 2:
                    result = nextDayCalculator(dia, mes, ano, 28);
                    break;
                default:
                    result = nextDayCalculator(dia, mes, ano, 30);
                    break;
            }

            System.out.println("The next day is: \n");

            System.out.println(result[0] + "/" + result[1] + "/" + result[2]);

            if (dia == 1 & mes == 1)
                System.out.println("\nHappy new year!\n");

        } else {
            System.out.println(ConsoleColors.error("La fecha no es válida! \n"));
        }
    };

    public static int[] nextDayCalculator(int dia, int mes, int ano, int qtde_dias) {
        if (dia == qtde_dias & mes != 12) {
            dia = 1;
            mes += 1;
        } else if (dia == qtde_dias & mes == 12) {
            dia = 1;
            mes = 1;
            ano += 1;
        } else {
            dia += 1;
        }

        return new int[] { dia, mes, ano };
    };
};
