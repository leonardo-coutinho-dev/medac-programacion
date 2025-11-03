public class Main {
    public static void main(String[] args) {
        System.out.println("\n");

        System.out.println("Boletin 1 - Variables y condicionales \n");

        // Declaración de variables

        double a, b, c; // coeficientes de la ecuación cuadrática - ax^2 + bx + c = 0
        double discriminante, raiz1, raiz2; // variables para el cálculo de las raíces

        System.out.println("2nd grade equation: ax^2 + bx + c = 0 \n");
        
        System.out.println("Type de value for the coeficient (a):");
        a = Entrada.entero();

        System.out.println("\n Type de value for the coeficient (b):");
        b = Entrada.entero();

        System.out.println("\n Type de value for the coeficient (c):");
        c = Entrada.entero();

        System.out.println("\n Os coeficientes son: a=" + a + ", b=" + b + ", c=" + c + "\n");

        System.out.println("Su ecuación cuadrática es: " + a + "x^2 + " + b + "x + " + c + " = 0 \n");

        // Cálculo del discriminante

        discriminante = (b * b) - (4 * a * c);

        System.out.println("El discriminante es: " + discriminante + "\n");

        if (discriminante  < 0) {
            System.out.println("La ecuación no tiene soluciones reales.\n");
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una solución real.\n");
        } else if ( discriminante > 0) {
            System.out.println("La ecuación tiene dos soluciones reales.\n");

            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las soluciones son: \n");
            System.out.println("Raíz 1: " + raiz1 + "\n");
            System.out.println("Raíz 2: " + raiz2 + "\n");
        };
    }
}