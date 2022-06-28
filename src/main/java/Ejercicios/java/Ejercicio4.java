package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        Double precioPedido;
        Double precioFinal;
        Integer iva = 21;

        //Procesado y mostrado de datos
        System.out.println("Ingrese el precio de su producto");
        precioPedido = scan.nextDouble();
        precioFinal = precioPedido + precioPedido * iva /100;
        System.out.println("El final de su producto es de: " + precioFinal);

    }
}


