package Ejercicio17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

    //Constantes
    private final Integer PRECIO_BASE = 100;
    private final String COLOR_DEFAULT = "Blanco";
    private final char CONSUMO_ELECTRICO_DEFAULT = 'F';
    private final double PESO_BASE = 5;


    //Declaración de variables
    private Integer precioBase = PRECIO_BASE;
    private String color = COLOR_DEFAULT;
    private char consumoElectrico = CONSUMO_ELECTRICO_DEFAULT;
    private double peso = PESO_BASE;


    //Colores disponibles
    private String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};


    //Consumos eléctricos
    private char consumos[] = {'A','B','C','D','E','F'};

    //Un constructor por defecto.
    public Electrodomestico (){

    }

    //Un constructor con el precio y peso. El resto por defecto.
    public Electrodomestico (Integer precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    //Un constructor con todos los atributos.
    public Electrodomestico (Integer precioBase, String color, char consumoElectrico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color) ;
        this.consumoElectrico = comprobarConsumoElectrico(consumoElectrico);
        this.peso = peso;
    }

    //Métodos get de todos los atributos.


    public Integer getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    //Comprueba que la letra es correcta.
    private char comprobarConsumoElectrico(char letra) {
        if (Character.toString(letra).matches("[A-F?]")) {
            return letra;
        } else return CONSUMO_ELECTRICO_DEFAULT;
    }

    //Comprueba que el color es correcto
    private String comprobarColor(String color) {
        List<String> listaColores = Arrays.asList(colores);
        if (listaColores.contains(color)) {
            return color;
        } else return COLOR_DEFAULT;
    }

    //Según el consumo energético, aumentara su precio, y según su peso, también.
    public Integer precioFinal() {
        Integer precioConsumoElectrico = 0;
        Integer precioSegunPeso = 0;

         switch (consumoElectrico) {
             case 'A':
                 precioConsumoElectrico = 100;
                 break;
             case 'B':
                 precioConsumoElectrico = 80;
                 break;
             case 'C':
                 precioConsumoElectrico = 60;
                 break;
             case 'D':
                 precioConsumoElectrico = 50;
                 break;
             case 'E':
                 precioConsumoElectrico = 30;
                 break;
             case 'F':
                 precioConsumoElectrico = 10;
                 break;
         }

        if (peso <=19) {
            precioSegunPeso = 10;
        } else if (peso <=49) {
            precioSegunPeso = 50;
        } else if (peso <=79) {
            precioSegunPeso = 80;
        } else if (peso >80) {
            precioSegunPeso = 100;
        }

        return (precioBase + precioSegunPeso + precioConsumoElectrico);
    }

}
