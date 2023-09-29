package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double horasTotales = 256;
        double horasPosiblesFaltar = ((horasTotales*15)/100);
        double horasFaltadas;

        System.out.println("Indica las horas que has faltado: ");
        horasFaltadas = sc.nextDouble();
        System.out.println("Has faltado: " +horasFaltadas);
        System.out.println("Puedes faltar un total de : "+horasPosiblesFaltar);
        System.out.println("Todavia puedes faltar: "+(horasPosiblesFaltar - horasFaltadas));

    }
}
