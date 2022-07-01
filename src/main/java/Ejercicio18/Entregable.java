package Ejercicio18;

public interface Entregable {

    //Cambia el atributo prestado a true.
   public void entregar();

    //Cambia el atributo prestado a false.
   public void devolver();

    //Devuelve el estado del atributo prestado.
   public boolean isEntregado();

    //Compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto.
    Integer compareTo(Object a);

}
