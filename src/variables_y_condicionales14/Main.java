package variables_y_condicionales14;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBoletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 14 - Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable o Sobresaliente. \n");

        int nota;

        System.out.println("USING IF / ELSE: \n");

        System.out.println("Type a grade between 0 and 10: \n");
        
        nota = Entrada.entero();

        while (nota < 0 | nota > 10) {
            System.out.println("\n Not allowed: Please, type a grade between 0 and 10: \n");
            nota = Entrada.entero();
        };

        if (nota >= 0 & nota < 5) {
            System.out.println(ConsoleColors.error("\n INSUFICIENTE \n"));
        };
        if (nota == 5) {
            System.out.println(ConsoleColors.success("\n SUFICIENTE \n"));
        };
        if (nota == 6 | nota == 7) {
            System.out.println(ConsoleColors.success("\n BIEN \n"));
        };
        if (nota == 8 | nota == 9) {
            System.out.println(ConsoleColors.success("\n NOTABLE \n"));
        };
        if (nota == 10) {
            System.out.println(ConsoleColors.success("\n SOBRESALIENTE \n"));
        };

        // OR

        System.out.println("USING SWITCH / CASE: \n");

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println(ConsoleColors.error("\n INSUFICIENTE \n"));
                break;
            case 5:
                System.out.println(ConsoleColors.success("\n SUFICIENTE \n"));
                break;
            case 6, 7:
                System.out.println(ConsoleColors.success("\n BIEN \n"));
                break;
            case 8, 9:
                System.out.println(ConsoleColors.success("\n NOTABLE \n"));
                break;
            case 10:
                System.out.println(ConsoleColors.success("\n SOBRESALIENTE \n"));
                break;  
        };
    };
};
