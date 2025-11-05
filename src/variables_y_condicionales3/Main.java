package variables_y_condicionales3;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 3 - Pedir el radio de una circunferencia y calcular su longitud. \n");

        // Declaración de variables - longitud y radio
        double l, r;

        // Formula(s)
        System.out.println("Formula: L(ongitude) = 2 * π * r \n");

        // Entrada de datos (radio)
        System.out.println("Type the value for the radius of the circle: \n");
        r = Entrada.real();

        // Confirmación de los datos introducidos
        System.out.println("\nThe radius of the circle is: R(adius) = " + r + "\n");

        // Cálculo de la longitud
        l = 2 * Math.PI * r;

        // Mostrar el cálculo de la longitud
        System.out.println("The values aplied in the formula are: L(ongitude) = 2 * " + Math.PI + " * " + r);

        // Mostrar el valor de la longitud
        System.out.println("\nThe longitude of the circle is: L(ongitude) = " + l);
    }

}
