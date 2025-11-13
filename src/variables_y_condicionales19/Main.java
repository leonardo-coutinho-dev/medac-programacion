package variables_y_condicionales19;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\nEjercicio 19 - Pedir dos fechas y mostrar el número de dias que hay de diferencia. Meses 28, 30 o 31 dias.\n");

        int dia_1, mes_1, ano_1, dia_2, mes_2, ano_2;

        int fecha_distante;

        boolean validateDate_1, validateDate_2;

        System.out.println("Type the day of the first date: \n");
        dia_1 = Entrada.entero();

        System.out.println("\nType the month of the first date: \n");
        mes_1 = Entrada.entero();

        System.out.println("\nType the year of the first date: \n");
        ano_1 = Entrada.entero();

        System.out.println("\nThis is the first date: \n");

        System.out.println(ConsoleColors.success(dia_1 + "/" + mes_1 + "/" + ano_1));

        System.out.println("\nType the day of the second date: \n");
        dia_2 = Entrada.entero();

        System.out.println("\nType the month of the second date: \n");
        mes_2 = Entrada.entero();

        System.out.println("\nType the year of the second date: \n");
        ano_2 = Entrada.entero();

        System.out.println("\nThis is the second date: \n");

        System.out.println(ConsoleColors.success(dia_2 + "/" + mes_2 + "/" + ano_2));

        validateDate_1 = validateDate(dia_1, mes_1, ano_1); // MODULAR_FUNCTION_1

        validateDate_2 = validateDate(dia_2, mes_2, ano_2); // MODULAR_FUNCTION_1

        System.out.println("-----------");

        if (validateDate_1 && validateDate_2) {
            System.out.println(ConsoleColors.success("Correct values!"));

            System.out.println("-----------");

            fecha_distante = whichIsMoreDistant(dia_1, mes_1, ano_1, dia_2, mes_2, ano_2); // MODULAR_FUNCTION_2

            if (fecha_distante == 1) {

                System.out.println(ConsoleColors.success("La fecha 1 es la mas distante!"));

                System.out.println("-----------");

                int result_distance = calculateDateDistance(dia_1, mes_1, ano_1, dia_2, mes_2, ano_2);

                System.out.println(ConsoleColors.success("La distancia es: " + result_distance + " dias."));

                System.out.println("-----------");

            } else if (fecha_distante == 2) {

                System.out.println(ConsoleColors.success("La fecha 2 es la mas distante!"));

                System.out.println("-----------");

                int result_distance = calculateDateDistance(dia_2, mes_2, ano_2, dia_1, mes_1, ano_1);

                System.out.println(ConsoleColors.success("La distancia es: " + result_distance + " dias."));

                System.out.println("-----------");

            } else if (fecha_distante == 3) {

                System.out.println(ConsoleColors.success("Las fechas son iguales!"));

                System.out.println("-----------");

            } else if (fecha_distante == 0) {

                System.out.println(ConsoleColors.error("Something wrong with the code!"));

                System.out.println("-----------");

            }

        } else {

            System.out.println(ConsoleColors.error("Incorrect values, please, try again!"));

            System.out.println("-----------");

        }
    };

    public static boolean validateDate(int dia, int mes, int ano) {

        boolean isValid = true;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia < 1 || dia > 31)
                    isValid = false;
                break;
            case 2:
                if (dia < 1 || dia > 28)
                    isValid = false;
                break;
            default:
                if (dia < 1 || dia > 30)
                    isValid = false;
                break;
        }

        if (mes < 1 || mes > 12) {
            isValid = false;
        }

        if (ano < 1) {
            isValid = false;
        }

        return isValid;
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

    public static int calculateDateDistance(int dia_1st, int mes_1st, int ano_1st, int dia_2nd, int mes_2nd,
            int ano_2nd) {

        int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // position: 0 1 2 3 4 5 6 7 8 9 10 11

        int year_amount = 0;

        int sum_dias = 0;

        for (int i = 0; i < meses.length; i++) {
            year_amount += meses[i];
        }
        ;

        if (ano_1st - ano_2nd == 0) { // PRIMERA OPCION: ANOS IGUALES

            if (dia_1st - dia_2nd != 0 && mes_1st - mes_2nd == 0) {
                sum_dias += (dia_1st - dia_2nd);
            } else {
                for (int i = mes_2nd; i < mes_1st - 1; i++) {
                    sum_dias += meses[i];
                }

                int result = ((meses[mes_2nd - 1] - dia_2nd) + dia_1st);

                sum_dias += result;
            }

        } else if (ano_1st - ano_2nd == 1) { // SEGUNDA OPCION: ANO DE DIFERENCIA ES 1

            if (dia_1st - dia_2nd == 0 && mes_1st - mes_2nd == 0) {

                sum_dias += year_amount;

            } else {
                if (mes_1st == 1 && mes_2nd == 12) {

                    sum_dias += ((meses[mes_2nd - 1] - dia_2nd) + dia_1st);

                } else {
                    sum_dias += (meses[mes_2nd - 1] - dia_2nd) + dia_1st;

                    for (int i = mes_2nd; i < meses.length; i++) {
                        sum_dias += meses[i];
                    }

                    for (int i = 0; i < mes_1st - 1; i++) {
                        sum_dias += meses[i];
                    }
                }

            }

        } else if (ano_1st - ano_2nd > 1) { // TERCERA OPCION: ANOS DE DIFERENCIA MAYOR A 1

            if (dia_1st - dia_2nd == 0 && mes_1st - mes_2nd == 0) {

                sum_dias += ((ano_1st - ano_2nd) * year_amount);

            } else {
                sum_dias += (((ano_1st - ano_2nd) - 1) * year_amount); // qtde de anos completos entre las fechas

                sum_dias += (meses[mes_2nd - 1] - dia_2nd) + dia_1st;

                for (int i = mes_2nd; i < meses.length; i++) {
                    sum_dias += meses[i];
                }

                for (int i = 0; i < mes_1st - 1; i++) {
                    sum_dias += meses[i];
                }
            }

        }

        return sum_dias;
    }
};
