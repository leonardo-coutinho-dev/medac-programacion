package variables_y_condicionales19;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\nEjercicio 19 - Pedir dos fechas y mostrar el número de dias que hay de diferencia. Meses 28, 30 o 31 dias.\n");

        int dia_1, mes_1, ano_1, dia_2, mes_2, ano_2;

        String error = "e";

        int fecha_distante;

        String validateDate_1, validateDate_2;

        int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int year_amount = 0;
        int sum_dias = 0;

        for (int i = 0; i < meses.length; i++) {
            year_amount += meses[i];
        }
        ;

        System.out
                .println(ConsoleColors.success("This is the amount of days one year contains: " + year_amount + "\n"));

        System.out.println("Type the day of the first date: \n");
        dia_1 = Entrada.entero();

        System.out.println("\nType the month of the first date: \n");
        mes_1 = Entrada.entero();

        System.out.println("\nType the year of the first date: \n");
        ano_1 = Entrada.entero();

        System.out.println("\nThis is the first date: \n");

        System.out.println(ConsoleColors.success(dia_1 + "/" + mes_1 + "/" + ano_1 + "\n"));

        System.out.println("Type the day of the second date: \n");
        dia_2 = Entrada.entero();

        System.out.println("\nType the month of the second date: \n");
        mes_2 = Entrada.entero();

        System.out.println("\nType the year of the second date: \n");
        ano_2 = Entrada.entero();

        System.out.println("\nThis is the second date: \n");

        System.out.println(ConsoleColors.success(dia_2 + "/" + mes_2 + "/" + ano_2 + "\n"));

        validateDate_1 = validateDate(dia_1, mes_1, ano_1, error); // MODULAR_FUNCTION_1

        validateDate_2 = validateDate(dia_2, mes_2, ano_2, error); // MODULAR_FUNCTION_1

        System.out.println("This is the result of processing the data: \n");

        System.out.println("1. " + validateDate_1 + "\n");
        System.out.println("2. " + validateDate_2 + "\n");

        if (validateDate_1 == "e" & validateDate_2 == "e") {
            System.out.println(ConsoleColors.success("Correct values! \n"));

            fecha_distante = whichIsMoreDistant(dia_1, mes_1, ano_1, dia_2, mes_2, ano_2); // MODULAR_FUNCTION_2

            if (fecha_distante == 1) {
                System.out.println(ConsoleColors.success("La fecha 1 es la mas distante! \n"));

                if (ano_1 - ano_2 == 0) {
                    if (mes_1 - mes_2 == 0) {
                        System.out.println("Ano y mes igual!\n");
                        sum_dias += (dia_1 - dia_2);
                        System.out.println("La distancia entre las fechas es: " + sum_dias + " dias.\n");
                    }
                    if (dia_1 - dia_2 == 0) {
                        System.out.println("Ano y dia igual!\n");
                        sum_dias += meses[mes_1];
                        System.out.println("La distancia entre las fechas es: " + sum_dias + " dias.\n");
                    }
                } else if (ano_1 - ano_2 == 1) {

                } else if (ano_1 - ano_2 > 1) {
                    System.out.println(
                            ConsoleColors.success("How many days should I sum? " + (((ano_1 - ano_2) - 1) * 365))
                                    + "\n");

                    sum_dias += (((ano_1 - ano_2) - 1) * 365);
                }

            } else if (fecha_distante == 2) {
                System.out.println(ConsoleColors.success("La fecha 2 es la mas distante! \n"));
                if (ano_2 - ano_1 == 0) {
                    if (mes_2 - mes_1 == 0) {
                    }
                    if (dia_2 - dia_1 == 0) {
                    }
                } else if (ano_2 - ano_1 == 1) {

                } else if (ano_2 - ano_1 > 1) {
                }
            } else if (fecha_distante == 3) {
                System.out.println(ConsoleColors.success("Las fechas son iguales! \n"));
            } else if (fecha_distante == 0) {
                System.out.println(ConsoleColors.error("Something wrong with the code! \n"));
            }

        } else {
            System.out.println(ConsoleColors.error("Incorrect values, please, try again! \n"));
        }
    };

    public static String validateDate(int dia, int mes, int ano, String error) {

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

        return error;
    };

    public static int whichIsMoreDistant(int dia_1, int mes_1, int ano_1, int dia_2, int mes_2, int ano_2) {
        int fecha_distante = 0;

        if (ano_1 > ano_2) {
            fecha_distante = 1;
        } else if (ano_1 == ano_2) {
            if (mes_1 > mes_2) {
                fecha_distante = 1;
            } else if (mes_1 == mes_2) {
                if (dia_1 > dia_2) {
                    fecha_distante = 1;
                } else if (dia_1 == dia_2) {
                    fecha_distante = 3;
                } else if (dia_1 < dia_2) {
                    fecha_distante = 2;
                }
            } else if (mes_1 < mes_2) {
                fecha_distante = 2;
            }
        } else if (ano_1 < ano_2) {
            fecha_distante = 2;
        }

        return fecha_distante;
    };
};
