package Ejercicio17;

public class Lavadora extends Electrodomestico{
    //Constantes
    private final Integer CARGA = 5;

    //Declaración de variables
    private Integer carga = CARGA;

    //Un constructor por defecto.
    public Lavadora() {

    }

    //Un constructor con el precio y peso. El resto por defecto.
    public Lavadora(Integer precioBase,double peso) {
        super(precioBase,peso);
    }

    //Un constructor con la carga y el resto de atributos heredados
    public Lavadora (Integer carga, Integer precioBase, String color, char consumoElectrico, double peso) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    //Método get de carga.
    public Integer getCarga() {
        return carga;
    }

    //Si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
    @Override
    public Integer precioFinal() {
        Integer precioFinal = super.precioFinal();
        if (carga >30) {
            return precioFinal + 50;
        } else return precioFinal;
    }
}
