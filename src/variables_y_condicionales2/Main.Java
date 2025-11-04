package variables_y_condicionales2;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 2 - Pedir el radio de un círculo y calcular su área. \n");

        // Declaración de variables

        // Radio de la circunferencia
        double radio;

        // Declaración de modelo de función

        System.out.println("Formula: Area = π * (r)^2 \n");

        // Entrada de datos (radio)
        System.out.println("Type the value for the radius of the circle: \n");
        radio = Entrada.real();

        // Confirmación de los datos introducidos
        System.out.println("\n The radius of the circle is: r = " + radio + "\n");

        // Cálculo del área
        double area = Math.PI * Math.pow(radio, 2); //declarative
        double area_2 = Math.PI * radio * radio; //imperative

        // Mostrar el cálculo del área
        System.out.println("The values aplied in the formula are: Area = " + Math.PI + " * " + radio + " * " + radio);

        // Mostrar el valor del área
        System.out.println("\n The area of the circle is: " + area + "\n");
    }

}