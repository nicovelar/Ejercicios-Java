package Ejercicios.java;

public class Ejercicio1 {

    public static void main(String[] args) {

        Integer numero1 = 3;
        Integer numero2 = 3;
        String logMessage;

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
