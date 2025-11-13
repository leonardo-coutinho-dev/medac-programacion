package variables_y_condicionales20;

// import util.Entrada;

import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(
                "\nEjercicio 20 - Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora el segundo seguiente.\n");

        int hour = 0, minutes = 0, seconds = 0;

        // System.out.println("Type the hour: \n");
        // hour = Entrada.entero();

        // System.out.println("Type the minutes: \n");
        // minutes = Entrada.entero();

        // System.out.println("Type the seconds: \n");
        // seconds = Entrada.entero();

        System.out.println(ConsoleColors.success("This is the time you typed: " + hour + minutes + seconds));

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (seconds < 59) {
                seconds++;
            } else {
                seconds = 0;

                if (minutes < 59) {
                    minutes++;
                } else {
                    minutes = 0;

                    if (hour < 23) {
                        hour++;
                    } else {
                        hour = 0;
                    }
                }
            }

            System.out.printf("%02d:%02d:%02d%n", hour, minutes, seconds);
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
}