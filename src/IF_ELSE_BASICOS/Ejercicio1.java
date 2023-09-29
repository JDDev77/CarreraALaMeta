package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a;

        System.out.println("Indica un número: ");
        a = sc.nextInt();

        if (a % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
