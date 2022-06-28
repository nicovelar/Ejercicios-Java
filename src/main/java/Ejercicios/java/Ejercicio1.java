package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Integer numero1;
        Integer numero2;
        String logMessage;

        //ejercicio 2
        System.out.println("Por favor a continuación ingrese dos números");
        System.out.println("Ingrese el primer número");
        numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2 = scan.nextInt();


        if (numero1 > numero2) {
            logMessage = numero1 + " es mayor que " + numero2;
            System.out.println( logMessage );
        } else if (numero1 < numero2) {
            logMessage = numero1 + " es menor que " + numero2;
            System.out.println( logMessage );
        } else {
            logMessage = numero1 + " es igual que " + numero2;
            System.out.println( logMessage );
        }

    }

}
