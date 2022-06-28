package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        String frase;
        Integer longitud;
        String consonantes;
        Integer cantidadConsonantes;

        //Procesado y mostrado de datos
        System.out.println("Ingrese una frase");
        frase = scan.nextLine();
        longitud = frase.length();
        consonantes = frase.replaceAll("[AEIOUaeiou]", "");
        cantidadConsonantes = consonantes.length();
        System.out.println("La frase contiene " + longitud + " caracteres de la cual " + (longitud - cantidadConsonantes) + " son vocales");
    }

}
