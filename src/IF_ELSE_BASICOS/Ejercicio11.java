package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int infracciones;
        int puntosRestados;
        int puntosTotales;

        System.out.println("Indica el número de infracciones: ");
        infracciones = sc.nextInt();

        if (infracciones < 5)
            System.out.println("No le vamos a restar ningún punto");
        else
        {
            System.out.println("Indica los puntis que tienes");
            puntosRestados = sc.nextInt();
            puntosTotales = puntosRestados - 10;
            if (puntosTotales > 0)
                System.out.println("Te quedan (puntos):" +puntosTotales);
            else
                System.out.println("No te quedan puntos");
        }
    }
}
