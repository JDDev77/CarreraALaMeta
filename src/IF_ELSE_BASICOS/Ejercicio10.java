package IF_ELSE_BASICOS;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int edad;

      System.out.println("Indica la edad: ");
      edad = sc.nextInt();

      if (edad <= 20)
          System.out.println("Eres joven");
      else if (edad <= 50) {
          System.out.println("Eres adulto");
      }
      else
          System.out.println("Eres mayor");
    }
}
