package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double radio;
        final double PI = 3.14;
        double area;

        System.out.println("Indique el radio: ");
        radio = sc.nextDouble();

        area = (radio*radio)*PI;

        System.out.println(area);

    }
}
