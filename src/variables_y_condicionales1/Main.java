package variables_y_condicionales1;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 1 - Pedir los coeficientes de una ecuación de 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo. \n");

        // Declaración de variables

        // Coeficientes de la ecuación cuadrática - ax^2 + bx + c = 0
        double a, b, c;

        // Variables para el cálculo de las raíces
        double discriminante, raiz1, raiz2;

        // Formula(s)
        System.out.println("Formula 1: (a)(x)^2 + (b)x + c = 0 \n");
        System.out.println("Formula 2: D(elta) = (b)^2 - (4 * a * c) \n");
        System.out.println("Formula 3: Raiz 1 = -(b) + sqrt(delta) \n");
        System.out.println("Formula 4: Raiz 2 = -(b) - sqrt(delta) \n");

        // Entrada de datos (a, b, c)
        System.out.println("Type the value for the coeficient (a):");
        a = Entrada.real();

        System.out.println("\nType the value for the coeficient (b):");
        b = Entrada.real();

        System.out.println("\nType the value for the coeficient (c):");
        c = Entrada.real();

        // Confirmación de los datos introducidos
        System.out.println("\nOs coeficientes son: a=" + a + ", b=" + b + ", c=" + c + "\n");

        // Mostrar la ecuación cuadrática
        System.out.println("Su ecuación cuadrática es: " + a + "x^2 + " + b + "x + " + c + " = 0 \n");

        // Cálculo del discriminante
        discriminante = (b * b) - (4 * a * c);

        // Mostrar el cálculo del discriminante
        System.out.println("El cálculo es: D(iscriminante) = " + b + "^2" + " - 4 * " + a + " * " + c + "\n");

        // Mostrar el valor del discriminante
        System.out.println("Discriminante: " + discriminante + "\n");

        // Cálculo y muestra de las raíces en función del valor del discriminante
        if (discriminante  < 0) {
            System.out.println("La ecuación no tiene soluciones reales.\n");
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una solución real (y repetida).\n");

            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("------------------------------\n");

            System.out.println("Las soluciones son: \n");
            System.out.println("Raíz 1: " + raiz1 + "\n");
            System.out.println("Raíz 2: " + raiz2);
        } else if ( discriminante > 0) {
            System.out.println("La ecuación tiene dos soluciones reales (distintas).\n");

            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("------------------------------\n");

            System.out.println("Las soluciones son: \n");
            System.out.println("Raíz 1: " + raiz1 + "\n");
            System.out.println("Raíz 2: " + raiz2);
        };
    }

}