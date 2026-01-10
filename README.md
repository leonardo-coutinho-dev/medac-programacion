# MEDAC Programación – Ejercicios resueltos en Java

Este repositorio contiene las soluciones desarrolladas en **Java** para los ejercicios del libro:

**Ejercicios de Programación en Java: Condicionales, Bucles, Tablas y Funciones**  
Autor: F. M. Pérez Montes  
PDF disponible en:  
https://elhacker.info/manuales/Lenguajes%20de%20Programacion/Java/Ejercicios-de-Programacion-en-Java.pdf

---

## 📘 Descripción

El objetivo de este repositorio es reunir y organizar los ejercicios resueltos del libro, utilizando Java para fortalecer la lógica y la práctica en programación.

Los ejercicios abarcan los temas:

- Boletín 1 (Variables y condicionales) ✅
- Boletín 2 (Condicionales y bucles)
- Boletín 3 (Bucles anidados)
- Boletín 4 (Tablas)
- Boletín 5 (Tablas n-dimensionales)
- Boletín 6 (Funciones)

---

## 📂 Estructura del proyecto

- src/

### Código fuente organizado en carpetas por tema

1. variables_y_condicionales(numero_ejercicio)/Main.java
2. condicionales_y_bucles(numero_ejercicio)/Main.java
3. bucles_anidados(numero_ejercicio)/Main.java
4. tablas(numero_ejercicio)/Main.java
5. tablas_n_dimensionales(numero_ejercicio)/Main.java
6. funciones(numero_ejercicio)/Main.java

Cada carpeta contiene varios archivos `.java`, y cada uno incluye un método `main` para ejecutarlo de manera independiente.

---

## Ejercícios

### **Boletín 1 – Variables y condicionales**

1. Pedir los coeficientes de una ecuación de 2º grado y mostrar sus soluciones reales. Si no existen, debe indicarlo.
2. Pedir el radio de un círculo y calcular su área.
3. Pedir el radio de una circunferencia y calcular su longitud.
4. Pedir dos números y decir si son iguales o no.
5. Pedir un número e indicar si es positivo o negativo.
6. Pedir dos números y decir si uno es múltiplo del otro.
7. Pedir dos números y decir cuál es el mayor.
8. Pedir dos números y decir cuál es el mayor o si son iguales.
9. Pedir dos números y mostrarlos ordenados de mayor a menor.
10. Pedir tres números y mostrarlos ordenados de mayor a menor.
11. Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
13. Pedir un número entre 0 y 9.999 y decir si es capicúa.
14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable o Sobresaliente.
15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta, suponiendo todos los meses de 30 días.
16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta, con meses de 28, 30 y 31 días (sin años bisiestos).
17. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente, suponiendo que todos los meses tienen 30 días.
18. Ídem que el ejercicio anterior, suponiendo que cada mes tiene un número distinto de días (febrero siempre con 28 días).
19. Pedir dos fechas y mostrar el número de días que hay de diferencia, suponiendo todos los meses de 30 días.
20. Pedir una hora (hora, minutos y segundos) y mostrar la hora en el segundo siguiente.
21. Pedir una nota numérica entera entre 0 y 10 y mostrarla escrita (cero, uno, dos, etc.).
22. Pedir un número de 0 a 99 y mostrarlo escrito con palabras (por ejemplo, 56 → “cincuenta y seis”).

### **Boletín 2 – Condicionales y bucles**

1. Leer un número y mostrar su cuadrado; repetir el proceso hasta que se introduzca un número negativo.
2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
4. Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han introducido.
5. Realizar un juego para adivinar un número. Pedir un número N y luego ir pidiendo números indicando “mayor” o “menor” según corresponda. El proceso termina cuando el usuario acierta.
6. Pedir números hasta que se teclee un 0 y mostrar la suma de todos los números introducidos.
7. Pedir números hasta que se introduzca uno negativo y calcular la media.
8. Pedir un número N y mostrar todos los números del 1 al N.
9. Escribir todos los números del 100 al 0 de 7 en 7.
10. Pedir 15 números y escribir la suma total.
11. Diseñar un programa que muestre el producto de los 10 primeros números impares.
12. Pedir un número y calcular su factorial.
13. Pedir 10 números y mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
14. Pedir 10 sueldos y mostrar su suma y cuántos hay mayores de 1000 €.
15. Dadas las edades y alturas de 5 alumnos, mostrar la edad media, la estatura media, la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden más de 1,75 m.
16. Pedir un número entre 0 y 10 y mostrar la tabla de multiplicar de dicho número.
17. Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar facturas. De 5 facturas introducidas se pide: facturación total, litros vendidos del artículo 1 y cuántas facturas superan los 600 €.
18. Igual que el ejercicio anterior, pero sin introducir el precio por litro. Solo existen tres productos con precios fijos.
19. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota = 4) y suspensos.
20. Pedir un número N, introducir N sueldos y mostrar el sueldo máximo.
21. Pedir 10 números y mostrar al final si se ha introducido alguno negativo.
22. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
23. Pedir 5 números e indicar si alguno es múltiplo de 3.

---

## 🖥️ Cómo usar este repositorio

### 1. Clonar el repositorio

```bash
git clone https://github.com/leonardo-coutinho-dev/medac-programacion.git

cd medac-programacion

cd src

ls

cd vari<TAB>
cd con<TAB>
...

java Main.java
```

## ☕ Requisitos e instalación de Java

Para compilar y ejecutar los programas de este repositorio, necesitas tener instalado:

- **JDK (Java Development Kit)** **Latest LTS version recommended**

Puedes comprobar si ya tienes Java instalado ejecutando:

```bash
java -version
```


