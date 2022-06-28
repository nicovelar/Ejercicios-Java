package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        String frase;
        String fraseJunta;

        //Procesado y mostrado de datos
        System.out.println("Ingrese una frase");
        frase = scan.nextLine();
        fraseJunta = frase.replace(" ","");
        System.out.println(fraseJunta);
    }

}
