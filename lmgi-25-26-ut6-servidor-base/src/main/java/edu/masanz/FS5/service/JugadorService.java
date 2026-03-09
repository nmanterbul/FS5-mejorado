package edu.masanz.FS5.service;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Division;
import edu.masanz.FS5.model.Jugador;

public class JugadorService {


    public static Jugador crearJugador(String jugadorName, String posicion) {

        Jugador jugador = new Jugador(jugadorName,posicion);
        return null;
    }
}
