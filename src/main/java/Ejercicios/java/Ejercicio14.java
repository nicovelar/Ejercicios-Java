package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        Integer numero;

        //Procesado y mostrado de datos
        System.out.println("Por favor ingrese un número");
        numero = scan.nextInt();
       while (numero <1001) {
           System.out.println(numero);
           numero = numero +2;
       }
    }
}
