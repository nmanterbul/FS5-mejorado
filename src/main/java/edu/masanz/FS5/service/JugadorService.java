package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.JugadoresDao;
import edu.masanz.FS5.model.Jugador;

public class JugadorService {


    public static Jugador crearJugador(String jugadorName, String posicion) {

        return JugadoresDao.crearJugador(jugadorName, posicion);
    }

    public static Jugador obtenerJugador(String jugadorName, String posicion) {
        return JugadoresDao.obtenerJugador(jugadorName,posicion);
    }
}
