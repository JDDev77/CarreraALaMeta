package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num;

       System.out.println("Indica un número");
       num = sc.nextInt();

       if (num < 5 || num > 20)
           System.out.println("Está fuera del rango");
       else
           System.out.println("Está dentro del rango");



    }
}
