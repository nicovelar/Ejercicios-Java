package Ejercicios.java;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        //Declaración de variables
        Scanner scan=new Scanner(System.in);
        String diaSemana;

        //Procesado y mostrado de datos
        System.out.println("Seleccione entre: Lunes, Martes, Miércoles, Jueves, Viernes, Sábado o Domingo");
        diaSemana = scan.nextLine();
        switch (diaSemana) {
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Día laborable");
                break;
            case "Sábado":
            case "Domingo":
                System.out.println("Día no laborable");
                break;
        }


    }
}
