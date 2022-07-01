package Ejercicio18;

import Ejercicio17.Electrodomestico;

public class Ejecutable {

    public static void main(String[] args){

        //Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
        Serie[] series = new Serie[5];
        Videojuego[] videoJuegos = new Videojuego[5];

        //Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
        series[0] = new Serie();
        series[1] = new Serie("Rick and Morty", "Justin Roiland y Dan Harmon");
        series[2] = new Serie("Vikings", "Michael Hirst");
        series[3] = new Serie("Vikings: Valhalla", 1, "Accion", "Jeb Stuart");
        series[4] = new Serie("You", 4, "Thriller psicológico", "Greg Berlanti, Sera Gamble");
        videoJuegos[0] = new Videojuego();
        videoJuegos[1] = new Videojuego("League of Legends", 30000000);
        videoJuegos[2] = new Videojuego("Skyrim", 300);
        videoJuegos[3] = new Videojuego("Minecraft", 30000000, "Survival", "Mojang");
        videoJuegos[4] = new Videojuego("Dark Souls III", 32, "Rol de acción", "From Software");

        //Entrega algunos Videojuegos y Series con el método entregar().

        series[0].entregar();
        series[2].entregar();
        series[4].entregar();
        videoJuegos[2].entregar();
        videoJuegos[3].entregar();
        videoJuegos[4].entregar();

        //Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        Integer cantidadVideoJuegos = 0;
        Integer cantidadSeries = 0;

        for (Videojuego instanciaVideoJuego: videoJuegos){
            if (instanciaVideoJuego.isEntregado()){
                cantidadVideoJuegos += 1;
                instanciaVideoJuego.devolver();
            }
        }
        for (Serie instanciaSerie : series){
            if (instanciaSerie.isEntregado()){
                cantidadSeries += 1;
                instanciaSerie.devolver();
            }
        }
        System.out.println("Juegos entregados: " + cantidadVideoJuegos);
        System.out.println("Series entregadas: " + cantidadSeries);


        //Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.

        //Entrego los juegos
        videoJuegos[0].entregar();
        videoJuegos[0].entregar();
        videoJuegos[2].entregar();
        videoJuegos[3].entregar();
        videoJuegos[4].entregar();

        Integer numeroVideoJuegoConMasHoras = 0;
        Videojuego videoJuegoConMasHoras = null;


        //Busco el juego que tenga mas horas
        for (Videojuego instanciaVideoJuego: videoJuegos){
            Integer horasDelVideoJuego = instanciaVideoJuego.getHorasEstimadas();

            if (instanciaVideoJuego.isEntregado()){
                if (horasDelVideoJuego > numeroVideoJuegoConMasHoras) {
                    numeroVideoJuegoConMasHoras = horasDelVideoJuego;
                    videoJuegoConMasHoras = instanciaVideoJuego;
                }
            }
            instanciaVideoJuego.devolver();
        }

        //Entrego las series
        series[0].entregar();
        series[1].entregar();
        series[2].entregar();
        series[3].entregar();
        series[4].entregar();

        Integer numeroSerieConMasTemporadas = 0;
        Serie serieConMasTemporadas = null;

        //Busco la serie que tenga mas temporadas
        for (Serie instanciaSerie: series){
            Integer numeroTemporadas = instanciaSerie.getNumeroTemporadas();

            if (instanciaSerie.isEntregado()){
                if (numeroTemporadas > numeroSerieConMasTemporadas) {
                    numeroSerieConMasTemporadas = numeroTemporadas;
                    serieConMasTemporadas = instanciaSerie;
                }
            }
            instanciaSerie.devolver();
        }

        //Muéstralos en pantalla con toda su información (usa el método toString()).

        System.out.println(serieConMasTemporadas);
        System.out.println(videoJuegoConMasHoras.toString());
    }

}
