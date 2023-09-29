package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double sumaTotal;

        System.out.println("Indica un número: ");
        a = sc.nextDouble();
        System.out.println("Indica otro número: ");
        b = sc.nextDouble();

        System.out.println(a+b);
        sumaTotal = a+b;
        System.out.println(sumaTotal);
    }
}
