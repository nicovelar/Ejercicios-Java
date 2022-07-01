package Ejercicio17;

public class Ejecutable {
    public static void main(String[] args) {

        //Declaración de variables
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];


        //Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Television();
        electrodomesticos[2] = new Electrodomestico();
        electrodomesticos[3] = new Lavadora(5, 100, "Blanco",'F', 15);
        electrodomesticos[4] = new Television(20, false, 200, "Azul", 'C', 10);
        electrodomesticos[5] = new Electrodomestico(130, "Gris", 'B', 13);
        electrodomesticos[6] = new Lavadora(10, 150, "Gris",'E', 30);
        electrodomesticos[7] = new Television(40, true, 400, "Rojo", 'A', 25);
        electrodomesticos[8] = new Electrodomestico(170, "Blanco", 'A', 38);
        electrodomesticos[9] = new Lavadora(15, 200, "Negro",'A', 45);

        //Ahora, recorre este array y ejecuta el método precioFinal().

        Integer precioElectrodomesticos = 0;
        Integer precioLavadoras = 0;
        Integer precioTelevisiones = 0;

        for (Electrodomestico instancia : electrodomesticos) {
            if (instancia instanceof Lavadora) {
                precioLavadoras += instancia.precioFinal();
            } else if (instancia instanceof Television) {
                precioTelevisiones += instancia.precioFinal();
            } else precioElectrodomesticos += instancia.precioFinal() +precioLavadoras +precioTelevisiones;

        }

        //Deberás mostrar el precio de cada clase
        System.out.println("El precio final de los Electrodomesticos es de: " + precioElectrodomesticos);
        System.out.println("El precio final de las Lavadoras es de: " + precioLavadoras);
        System.out.println("El precio final de las Televisiones es de: " + precioTelevisiones);

    }
}
