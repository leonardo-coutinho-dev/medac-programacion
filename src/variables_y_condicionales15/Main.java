package variables_y_condicionales15;

import util.Entrada;

// import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBoletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 15 - Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 dias. \n");

        int dia, mes, ano;

        System.out.println("Type a day (1 to 30): \n");
        dia = Entrada.entero();

        while(dia < 1 | dia > 30) {
            System.out.println("\nNot allowed: Please, type a number between 1 and 30: \n");
            dia = Entrada.entero();
        };

        System.out.println("\nType a month (1 to 12): \n");
        mes = Entrada.entero();

        while(mes < 1 | mes > 12) {
            System.out.println("\nNot allowed: Please, type a number between 1 and 12: \n");
            mes = Entrada.entero();
        };

        System.out.println("\nType a year (between 1900 & 2100): \n");
        ano = Entrada.entero();

        while(ano < 1900 | ano > 2100) {
            System.out.println("\nNot allowed: Please, type a number between 1900 and 2100: \n");
            ano = Entrada.entero();
        };

        System.out.println("\nLa fecha es la seguinte: " + dia + "/" + mes + "/" + ano + "\n");
    };
};