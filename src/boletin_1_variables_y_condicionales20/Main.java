package boletin_1_variables_y_condicionales20;

import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(
                "\nEjercicio 20 - Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora el segundo seguiente.\n");

        int hour = 0, minute = 0, second = 0;

        int[] newTime = new int[3];

        boolean isValid;

        System.out.println("Type the hour: \n");
        hour = Entrada.entero();

        System.out.println("\nType the minutes: \n");
        minute = Entrada.entero();

        System.out.println("\nType the seconds: \n");
        second = Entrada.entero();

        System.out
                .println("\nThis is the time you typed: " + hour + " : " + minute + " : " + second);

        System.out.println("-----------");

        isValid = validateTime(hour, minute, second);

        if (isValid) {

            newTime = calculateTime(hour, minute, second);

            System.out.println(ConsoleColors.success("The next second is: "));
            System.out.println("-----------");
            System.out.printf("%02d:%02d:%02d%n", newTime[0], newTime[1], newTime[2]);

        } else {
            System.out.println(ConsoleColors.error("Invalid time values!"));
        }

        System.out.println(ConsoleColors.success("----------"));

        System.out.println(ConsoleColors.success("Let's start the clock!"));

        System.out.println(ConsoleColors.success("----------"));

        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            newTime = calculateTime(hour, minute, second);

            hour = newTime[0];
            minute = newTime[1];
            second = newTime[2];

            System.out.printf("%02d:%02d:%02d%n", newTime[0], newTime[1], newTime[2]);

        }

    };

    public static boolean validateTime(int hour, int minutes, int seconds) {
        boolean isValid = true;

        if (hour < 0 || hour > 23) {
            isValid = false;
        }

        if (minutes < 0 || minutes > 59) {
            isValid = false;
        }

        if (seconds < 0 || seconds > 59) {
            isValid = false;
        }

        return isValid;
    };

    public static int[] calculateTime(int hour, int minute, int second) {

        int[] time = new int[3];

        if (second < 59) {
            second++;
        } else {
            second = 0;
            if (minute < 59) {
                minute++;
            } else {
                minute = 0;
                if (hour < 23) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }

        time[0] = hour;
        time[1] = minute;
        time[2] = second;

        return time;
    }
}