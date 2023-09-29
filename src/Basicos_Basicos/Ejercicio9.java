package Basicos_Basicos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio;
        double precioDescuento;

        System.out.println("Dígame el precio de este producto: ");
        precio = sc.nextInt();

        System.out.println("Ahora le aplicaremos el descuento del 15%");
        precioDescuento = precio - ((precio*15)/100);

        System.out.println(precioDescuento);

    }
}
