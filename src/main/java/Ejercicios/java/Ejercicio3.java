package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        String radioPedido;
        String logMessage;
        Double pi = 3.14;
        Double radioNumerico;
        Double dobleRadio;
        Double area;



        //Se pide el radio
        System.out.println( "Ingrese el radio del círulo" );
        radioPedido = scan.nextLine();
        radioNumerico = Double.parseDouble(radioPedido);

        //Se procesan los datos
        dobleRadio = Math.pow( radioNumerico , 2 );
        area = pi * dobleRadio;

        //Se muestran los resultados
        logMessage = "El área del círculo es de: " + area;
        System.out.println(logMessage);

    }
}
