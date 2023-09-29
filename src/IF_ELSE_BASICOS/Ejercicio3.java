package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Hay que hacer un cambio de variable, de tipo numero a tipo texto

        double a;
        String b;

        System.out.println("Indica tu nota académica: ");
        a = sc.nextDouble();
        b = Double.toString(a);

        System.out.println(b);
    }
}
