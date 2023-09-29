package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;

        System.out.println("Indica un número: ");
        a = sc.nextDouble();

        if (a > 0)
            System.out.println("Es positivo");
        else if (a < 0) {
            System.out.println("Es negativo");
        }
        else
            System.out.println("El cero es neutro");
    }
}
