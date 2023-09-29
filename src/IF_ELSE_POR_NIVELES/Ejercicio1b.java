package IF_ELSE_POR_NIVELES;

import java.util.Scanner;

public class Ejercicio1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anno;

        System.out.println("Indica el día: ");
        dia = sc.nextInt();
        System.out.println("Indica el mes: ");
        mes = sc.nextInt();
        System.out.println("Indica el año: ");
        anno = sc.nextInt();
        System.out.println("La fecha es " + dia + "/" + mes + "/" + anno);
    }
}
