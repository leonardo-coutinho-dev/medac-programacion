package util;

import java.io.*;

public class Entrada {

    public static String inicializar() {
        String buzon="";

        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        try {
            buzon = teclado.readLine();
        } catch(Exception e) {
            System.out.append("Entrada incorrecta!");
        }

        return buzon;
    }

    public static int entero() {
        while (true) {
            try {
                int valor = Integer.parseInt(inicializar());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("\nERROR: You must enter an integer. Try again: \n");
            }
        }
    }

    public static double real() {
        while (true) {
            try {
                double valor = Double.parseDouble(inicializar());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("\nERROR: You must enter a real number. Try again: \n");
            }
        }
    }

    public static String cadena() {
        while (true) {
            try {
                String valor = inicializar();
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("\nERROR: You must enter a String. Try again: \n");
            }
        }
    }

    public static char caracter() {
        while (true) {
            try {
                String valor = inicializar();
                return valor.charAt(0);
            } catch (NumberFormatException e) {
                System.out.println("\nERROR: You must enter a String. Try again: \n");
            }
        }
    }

}