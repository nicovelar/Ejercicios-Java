package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        Double numeroPedido;

        //Procesado y mostrado de datos
       do {
           System.out.println("Ingrese un número");
           numeroPedido = scan.nextDouble();
       } while (numeroPedido < 0);
        System.out.println(numeroPedido);
    }
}
