package boletin_1_variables_y_condicionales02;

import util.Entrada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boletin 1 - Variables y condicionales \n");

        System.out.println("Ejercício 2 - Pedir el radio de un círculo y calcular su área. \n");

        // Declaración de variables - radio
        double radio;

        // Formula(s)
        System.out.println("Formula: A(rea) = π * (r)^2 \n");

        // Entrada de datos (radio)
        System.out.println("Type the value for the radius of the circle: \n");
        radio = Entrada.real();

        // Confirmación de los datos introducidos
        System.out.println("\nThe radius of the circle is: R(adius) = " + radio + "\n");

        // Cálculo del área
        double area = Math.PI * Math.pow(radio, 2); // declarative
        double area_2 = Math.PI * radio * radio; // imperative

        // Mostrar el cálculo del área
        System.out.println("The values aplied in the formula are: A(rea) = " + Math.PI + " * " + radio + " * " + radio);

        // Mostrar el valor del área
        System.out.println("\nThe area of the circle is: " + area + " " + area_2);
    }

}