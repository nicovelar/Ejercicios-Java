package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        String frase1;
        String frase2;
        String diff1;
        String diff2;


        //Procesado y mostrado de datos
        System.out.println("Ingrese una frase");
        frase1 = scan.nextLine();
        System.out.println("Ingrese otra frase");
        frase2 = scan.nextLine();
        diff1 = frase1.replaceAll(frase2,"");
        diff2 = frase2.replaceAll(frase1,"");


        //Probar holaso y hola
        //Probar hola y holaso
        //Probar que y so
        if (diff1.length() == 0) {
            System.out.println("Son iguales");
        } else if (diff1 == frase1) {
            if (diff2 == frase2) {
                System.out.println(diff1 + diff2);
            } else System.out.println(diff2);
        } else {
            System.out.println(diff1);
        }
    }

}
