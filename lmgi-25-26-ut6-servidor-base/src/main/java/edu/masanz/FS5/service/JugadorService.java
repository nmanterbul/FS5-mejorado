package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.JugadoresDao;
import edu.masanz.FS5.model.Jugador;

import java.util.List;

public class JugadorService {


    public static boolean crearJugador( int idTorneo, String jugadorName, String posicion) {

        return JugadoresDao.crearJugador( idTorneo, jugadorName, posicion);
    }

    public static Jugador obtenerJugador(int idJugador) {
        return JugadoresDao.obtenerJugador(idJugador);
    }

    public static boolean actualizarJugador(int idJugador, String jugadorName, String posicion) {
        return JugadoresDao.actualizarJugador(idJugador, jugadorName, posicion);
    }

    public static boolean borrarJugador(int idJugador) {
        return JugadoresDao.borrarJugador(idJugador);
    }

    public static List<Jugador> obtenerJugadores(int idTorneo) {
        return JugadoresDao.obtenerJugadores(idTorneo);
    }

    public static List<Jugador> obtenerJugadoresDeEquipo(int idEquipo) {
        return JugadoresDao.obtenerJugadoresDeEquipo(idEquipo);
    }
}
