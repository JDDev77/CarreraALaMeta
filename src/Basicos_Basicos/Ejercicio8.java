package Basicos_Basicos;

import java.util.Scanner;

public class Ejercicio8 {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        System.out.println("Teclee un número");
        a = sc.nextInt();
        System.out.println("Teclee otro número");
        b = sc.nextInt();

        c = a;
        a = b;


        System.out.println(a);
        System.out.println(c);


    }
}
