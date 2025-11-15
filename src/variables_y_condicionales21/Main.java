package variables_y_condicionales21;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(
                "\nEjercicio 21 - Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres, ...\n");

        int grade;

        System.out.println("Please, enter a grade between 0 and 10: \n");
        grade = Entrada.entero();

        System.out.println("----------");

        switch (grade) {
            case 0:
                System.out.println(ConsoleColors.success("cero"));
                break;
            case 1:
                System.out.println(ConsoleColors.success("uno"));
                break;
            case 2:
                System.out.println(ConsoleColors.success("dos"));
                break;
            case 3:
                System.out.println(ConsoleColors.success("tres"));
                break;
            case 4:
                System.out.println(ConsoleColors.success("cuatro"));
                break;
            case 5:
                System.out.println(ConsoleColors.success("cinco"));
                break;
            case 6:
                System.out.println(ConsoleColors.success("seis"));
                break;
            case 7:
                System.out.println(ConsoleColors.success("siete"));
                break;
            case 8:
                System.out.println(ConsoleColors.success("ocho"));
                break;
            case 9:
                System.out.println(ConsoleColors.success("nueve"));
                break;
            case 10:
                System.out.println(ConsoleColors.success("diez"));
                break;
            default:
                System.out.println(ConsoleColors.error("Inválido!"));
        }
    };
}