package Ejercicio17;

public class Television extends Electrodomestico{
    //Constantes
    private final Integer RESOLUCION = 20;
    private final boolean SINTONIZADOR_TDT = false;

    //Declaracion de variables
    private Integer resolucion = RESOLUCION;
    private boolean sintonizadorTDT = SINTONIZADOR_TDT;

    //Un constructor por defecto.
    public Television () {

    }

    //Un constructor con el precio y peso. El resto por defecto.
    public Television (Integer precioBase, double peso) {
        super(precioBase, peso);
    }

    //Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
    public Television (Integer resolucion, boolean sintonizadorTDT, Integer precioBase, String color, char consumoElectrico, double peso) {
        super(precioBase, color, consumoElectrico,peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Método get de resolución y sintonizador TDT.
    public Integer getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //Si resolución mayor de 40 pulgadas, precio += un 30% / sintonizador TDT incorporado, aumentara 50 €.
    @Override
    public Integer precioFinal() {
        Integer precioFinal = super.precioFinal();
        if (resolucion >40) {
            precioFinal += ((precioFinal *30) /100);
        }
        if (sintonizadorTDT) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
