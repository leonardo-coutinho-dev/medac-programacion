package boletin_2_condicionales_y_bucles09;

public class Main {
    public static void main() {
        System.out.println("\n9. Escribir todos los números del 100 al 0 de 7 en 7.\n");

        int i = 100;

        System.out.println("Con while: \n");

        while (i >= 0) {
            System.out.println(i + "\n");
            i = i - 7;
        }

        System.out.println("Con for: \n");

        for (int c = 100; c >= 0; c -= 7) {
            System.out.println(c + "\n");
        }

        // cleaner code with for - do not have to declare a variable outside the loop
    }
}