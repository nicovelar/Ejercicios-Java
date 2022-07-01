package Ejercicio18;

public class Videojuego implements Entregable {

    //Declaración de variables

    private String titulo;
    private Integer horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compania;

    //Un constructor por defecto.
    public Videojuego() {

    }

    //Un constructor con el titulo y horas estimadas. El resto por defecto.
    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    //Un constructor con todos los atributos, excepto de entregado.
    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    //Métodos get de todos los atributos, excepto de entregado.

    public String getTitulo() {

        return titulo;
    }

    public Integer getHorasEstimadas() {

        return horasEstimadas;
    }

    public String getGenero() {

        return genero;
    }

    public String getCompania() {

        return compania;
    }

    //Métodos set de todos los atributos, excepto de entregado.

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {

        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public void setCompania(String compania) {

        this.compania = compania;
    }

    //Sobrescribe los métodos toString.
    @Override
    public String toString() {
        return "Título="+titulo+", HorasEstimadas="+horasEstimadas+", Entregado="+entregado+", Género="+genero+", Compañía="+compania;
    }

    //Implementa los anteriores métodos en las clases Videojuego y Serie
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    //compareTo devuelve:
    //si a1> a2, devuelve un número positivo
    //si a1 <a2, devuelve un número negativo
    //si a1 == a2, devuelve 0

    @Override
    public Integer compareTo(Object a) {
        Videojuego videoJuego = (Videojuego) a;
        if (videoJuego.getHorasEstimadas() > this.horasEstimadas) {
            return 1;
        } else if (videoJuego.getHorasEstimadas() < this.horasEstimadas) {
            return -1;
        } else return 0;

    }
}
