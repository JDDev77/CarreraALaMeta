package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double producto;
        double descuento = 15;
        System.out.println("Indica el precio de un producto: ");
        producto = sc.nextDouble();

        if(producto >= 50)
            System.out.println("Te vamos a descontar: "+ ((producto*descuento)/100));
        else
            System.out.println("No te vamos a descontar nada");
    }
}
