package boletin_1_variables_y_condicionales10_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i <= 100; i++) {

            int rand_1 = rand.nextInt(1000); // 0 to 999
            int rand_2 = rand.nextInt(1000); // 0 to 999
            int rand_3 = rand.nextInt(1000); // 0 to 999

            System.out.println("----------- " + i);

            if (rand_1 > rand_2 & rand_2 > rand_3) {
                System.out.println("\nI. " + rand_1 + "\nII. " + rand_2 + "\nIII. " + rand_3 + "\n");
            } else if (rand_1 < rand_2 & rand_2 < rand_3) {
                System.out.println("\nI. " + rand_3 + "\nII. " + rand_2 + "\nIII. " + rand_1 + "\n");
            } else if (rand_1 > rand_2 & rand_2 < rand_3 & rand_1 > rand_3) {
                System.out.println("\nI. " + rand_1 + "\nII. " + rand_3 + "\nIII. " + rand_2 + "\n");
            } else if (rand_1 > rand_2 & rand_2 < rand_3 & rand_1 < rand_3) {
                System.out.println("\nI. " + rand_3 + "\nII. " + rand_1 + "\nIII. " + rand_2 + "\n");
            } else if (rand_1 < rand_2 & rand_2 > rand_3 & rand_1 > rand_3) {
                System.out.println("\nI. " + rand_2 + "\nII. " + rand_1 + "\nIII. " + rand_3 + "\n");
            } else if (rand_1 < rand_2 & rand_2 > rand_3 & rand_1 < rand_3) {
                System.out.println("\nI. " + rand_2 + "\nII. " + rand_3 + "\nIII. " + rand_1 + "\n");
            } else if (rand_1 == rand_2) {
                System.out.println("The numbers are equal. " + "(" + rand_1 + " = " + rand_2 + ")");
            }
            ;
        }
        ;
    };
};