package Carpeta_Pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class jas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminar = false;
        String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E"};


        while (!terminar){

            int cociente;
            String respuesta;
            String letra = "";
            int dividendo;
            int divisor;

            try{

                System.out.println("Dime el dividendo");
                dividendo = sc.nextInt();
                System.out.println("Dime el divisor");
                divisor = sc.nextInt();sc.nextLine();

                cociente = dividendo%divisor;

                System.out.println("El cociente es " + cociente);

                for (int i = 0; i < letrasDNI.length; i++) {
                    if(cociente == i) {
                        letra = letrasDNI[i];
                        break;
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Por favor, ingresa números válidos y positivos.");
                sc.nextLine();
                continue;
            }


            System.out.println("Tu letra es: "+letra);
            System.out.println("Su DNI quedaría cómo: " + divisor + " " + letra);

            System.out.println("Desea continuar?");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si"))
                System.out.println("Empezamos de nuevo");
            else 
                terminar = true;
        }
       
    }
}
