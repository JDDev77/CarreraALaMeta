package IF_ELSE_POR_NIVELES;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividendo;
        int divisor;
        int cociente;
        int resto;

        System.out.print("Escriba el dividendo: ");
        dividendo = sc.nextInt();
        System.out.print("Escriba el divisor: ");
        divisor = sc.nextInt();

        if (divisor == 0)
            System.out.print("No se puede dividir por cero");

        cociente = dividendo/divisor;
        resto = dividendo%divisor;

        System.out.println(resto != 0 ? ("La división no es exacta " + "Cociente: " + cociente
                + " Resto: " + resto) : ("La division es exacta: " + cociente));


    }
}
