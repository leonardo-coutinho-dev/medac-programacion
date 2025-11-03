import java.io.*;

public class Entrada {

    static String inicializar() {
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

    static int entero() {
        int valor = Integer.parseInt(inicializar());
        return valor;
    }

}