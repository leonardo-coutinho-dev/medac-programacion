package boletin_2_condicionales_y_bucles11;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n11. Diseñar un programa que muestre el producto de los 10 primeros números impares.\n");

        int product = 1;

        // Tenho que somar de 2 em 2
        // 1 3 5 7 9 11 13 15 17 19
        // i = 1 - soma 0 - 1
        // i = 2 - soma 1 - 3
        // i = 3 - soma 2 - 5
        // i = 4 - soma 3 - 7
        // i = 5 - soma 4 - 9
        // i = 6 - soma 5 - 11
        // i = 7 - soma 6 - 13
        // i = 8 - soma 7 - 15
        // i = 9 - soma 8 - 17
        // i = 10 - soma 9 - 19

        for (int i = 1; i <= 10; i++) {
            product = product * (i + (i - 1));
        }

        // Write code for humans first, computers second (got it, chatGPT!)

        /**
         * for (int i = 1; i <= 10; i++) {
         * int odd = 2 * i - 1;
         * product *= odd;
         * }
         */

        System.out.println("El producto de los 10 primeros números ímpares: \n");

        System.out.println(product + "\n");
    }
}