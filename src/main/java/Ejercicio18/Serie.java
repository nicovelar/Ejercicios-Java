package Ejercicio18;

public class Serie implements Entregable{

    //Constantes
    private final Integer NUMERO_TEMPORADAS = 3;
    private final boolean ENTREGADO = false;


    //Declaración de variables
    private String titulo;
    private Integer numeroTemporadas = NUMERO_TEMPORADAS;
    private boolean entregado = ENTREGADO;
    private String genero;
    private String creador;

    //Un constructor por defecto.
    public Serie() {

    }

    //Un constructor con el titulo y creador. El resto por defecto.
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    //Un constructor con todos los atributos, excepto de entregado.
    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //Métodos get de todos los atributos, excepto de entregado.

    public String getTitulo() {

        return titulo;
    }

    public Integer getNumeroTemporadas() {

        return numeroTemporadas;
    }

    public String getGenero() {

        return genero;
    }

    public String getCreador() {

        return creador;
    }

    //Métodos set de todos los atributos, excepto de entregado.

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {

        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public void setCreador(String creador) {

        this.creador = creador;
    }

    //Sobrescribe los métodos toString.
    @Override
    public String toString() {
        return "Título="+titulo+", NúmeroTemporadas="+numeroTemporadas+", Entregado="+entregado+", Género="+genero+", Creador="+creador;
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
        Serie serie = (Serie) a;
        if (serie.getNumeroTemporadas() > this.numeroTemporadas) {
            return 1;
        } else if (serie.getNumeroTemporadas() < this.numeroTemporadas) {
            return -1;
        } else return 0;

    }

}
