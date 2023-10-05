package IF_ELSE_POR_NIVELES;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;
        double num2;

        System.out.print("Escriba un número: ");
        num = sc.nextDouble();
        System.out.print("Escriba otro número: ");
        num2 = sc.nextDouble();

        if (num > num2)
            System.out.println("Menor: " + num2 + " y Mayor: " + num);
        else if (num2 > num)
            System.out.println("Menor: " + num + " y Mayor: " + num2);
        else
            System.out.print("Son iguales");


    }
}
