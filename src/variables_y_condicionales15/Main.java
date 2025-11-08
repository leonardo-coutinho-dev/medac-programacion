package variables_y_condicionales15;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBoletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 15 - Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 dias. \n");

        System.out.println("1. (dia - condition: 1 to 30) \n");
        System.out.println("2. (mes - condition: 1 to 12) \n");
        System.out.println("3. (ano - condition: ano > 0) \n");

        int dia, mes, ano;
        String error = "e"; // y = year (año); m = month (mes); d = day (dia)

        System.out.println("Type a day (1 to 30): \n");
        dia = Entrada.entero();

        System.out.println("\nType a month (1 to 12): \n");
        mes = Entrada.entero();

        System.out.println("\nType a year (> 0): \n");
        ano = Entrada.entero();

        System.out.println("\nLa fecha es la seguinte: " + dia + "/" + mes + "/" + ano + "\n");

        if (dia < 1 | dia > 30) {
            error += "d";
        };
        
        if (mes < 1 | mes > 12) {
            error += "m";
        };
        
        if (ano < 1) {
            error += "y";
        };

        if (error == "e") {
            System.out.println(ConsoleColors.success("La fecha es correcta! \n"));
        } else {
            System.out.println(ConsoleColors.error("La fecha es incorrecta! \n"));
        };

        // end program here, bellow is extra code for error handling display

        switch(error) {
            case "ed":
                System.out.println(ConsoleColors.error("INVALID VALUE - DIA: " + dia + "\n"));
                break;
            case "em":
                System.out.println(ConsoleColors.error("INVALID VALUE - MES - (condition: 1 to 12): " + mes + "\n"));
                break;
            case "ey":
                System.out.println(ConsoleColors.error("INVALID VALUE - ANO: " + ano + "\n"));
                break;
            case "edm":
                System.out.println(ConsoleColors.error("INVALID VALUES - DIA: " + dia + " MES: " + mes + "\n"));
                break;
            case "edy":
                System.out.println(ConsoleColors.error("INVALID VALUES - DIA: " + dia + " ANO: " + ano + "\n"));
                break;
            case "emy":
                System.out.println(ConsoleColors.error("INVALID VALUES - MES: " + mes + " ANO: " + ano + "\n"));
                break;
            case "edmy":
                System.out.println(ConsoleColors.error("INVALID VALUES - DIA: " + dia + " MES: " + mes + " ANO: " + ano + "\n"));
                break;
            default:
                System.out.println(ConsoleColors.success(dia + "/" + mes + "/" + ano + "\n"));
                break;
        };
    };
};