package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.JugadoresDao;
import edu.masanz.FS5.model.Jugador;

import java.util.List;

public class JugadorService {


    public static Jugador crearJugador(String jugadorName, String posicion) {

        return JugadoresDao.crearJugador(jugadorName, posicion);
    }

    public static Jugador obtenerJugador(int idJugador) {
        return JugadoresDao.obtenerJugador(idJugador);
    }

    public static boolean actualizarJugador(int idJugador, String jugadorName) {
        return JugadoresDao.actualizarJugador(idJugador, jugadorName);
    }

    public static boolean borrarJugador(int idJugador, String jugadorName) {
        return JugadoresDao.borrarJugador(idJugador, jugadorName);
    }

    public static List<Jugador> obtenerJugadores(int idTorneo) {
        return JugadoresDao.obtenerJugadores(idTorneo);
    }
}
