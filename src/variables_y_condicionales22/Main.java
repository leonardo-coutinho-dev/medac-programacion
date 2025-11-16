package variables_y_condicionales22;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "\nEjercicio 22 - Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.\n");

        int numero;

        int decimal;

        int unidade;

        String[] string_decimal = { "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta",
                "Noventa" };

        String[] string_unidade = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };

        String numero_string = "";

        System.out.println("Please, type a numero between 0 and 99: \n");
        numero = Entrada.entero();

        if (numero >= 0 && numero < 100) {
            System.out.println(ConsoleColors.success("The numero is in range."));

            decimal = (numero - (numero % 10)) / 10;

            unidade = numero % 10;

            if (numero > 19) {
                switch (decimal) {
                    case 2:
                        numero_string += string_decimal[0];
                        break;
                    case 3:
                        numero_string += string_decimal[1];
                        break;
                    case 4:
                        numero_string += string_decimal[2];
                        break;
                    case 5:
                        numero_string += string_decimal[3];
                        break;
                    case 6:
                        numero_string += string_decimal[4];
                        break;
                    case 7:
                        numero_string += string_decimal[5];
                        break;
                    case 8:
                        numero_string += string_decimal[6];
                        break;
                    case 9:
                        numero_string += string_decimal[7];
                        break;
                }
                ;

                switch (unidade) {
                    case 0:
                        break;
                    case 1:
                        numero_string += (" y " + string_unidade[1]);
                        break;
                    case 2:
                        numero_string += (" y " + string_unidade[2]);
                        break;
                    case 3:
                        numero_string += (" y " + string_unidade[3]);
                        break;
                    case 4:
                        numero_string += (" y " + string_unidade[4]);
                        break;
                    case 5:
                        numero_string += (" y " + string_unidade[5]);
                        break;
                    case 6:
                        numero_string += (" y " + string_unidade[6]);
                        break;
                    case 7:
                        numero_string += (" y " + string_unidade[7]);
                        break;
                    case 8:
                        numero_string += (" y " + string_unidade[8]);
                        break;
                    case 9:
                        numero_string += (" y " + string_unidade[9]);
                        break;
                }
                ;
            } else {
                System.out.println("Numero < 20");
            }

            System.out.println(numero_string);

        } else {
            System.out.println(ConsoleColors.error("The numero is out of range."));
        }

    };
}