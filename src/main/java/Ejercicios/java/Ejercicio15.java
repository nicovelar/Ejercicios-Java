package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        Integer numero;
        String logMessage;

        //Procesado y mostrado de datos
        logMessage = "****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR";

        System.out.println(logMessage);
        numero = scan.nextInt();

        while (numero != 8) {
            if(numero >8 || numero <1) {
                System.out.println("Numero Incorrecto");
                numero = scan.nextInt();
            } else {
                System.out.println(logMessage);
                numero = scan.nextInt();
            }
        }

    }

}
