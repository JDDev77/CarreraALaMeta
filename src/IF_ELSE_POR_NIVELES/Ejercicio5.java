package IF_ELSE_POR_NIVELES;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int num2;
        int num3;

        System.out.print("Escriba el 1º número: ");
        num = sc.nextInt();
        System.out.print("Escriba el 2º número: ");
        num2 = sc.nextInt();
        System.out.print("Escriba el 3º número: ");
        num3 = sc.nextInt();

        if (num > num2 && num > num3 && num2 > num3)
            System.out.println("El orden de los numeros de " +
                    "menos a mayor es" + num3 + " "+ num2 +
            " " + num);
        else if (num2 > num && num2 > num3 && num > num3) {

            ç

        }

    }
}
