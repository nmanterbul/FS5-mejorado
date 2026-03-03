package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Jugador;

public class JugadoresDao {

    public static Jugador crearJugador(String jugadorName, String posicion) {

        return null;

    }





    public static Jugador obtenerJugador(String jugadorName, String posicion) {
        String select = "SELECT * FROM jugadores WHERE jugadorName like ? AND posicion like ?";
        Object[] params = {jugadorName,posicion};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        if (result.length > 0) {
            Jugador jugador = new Jugador();
            int idJugador = (int) result[0][0];
            int idEquipo = (int) result[0][1];
            String resultJugadorName = (String) result[0][2];
            String resultJugadorPosicion = (String) result[0][3];
            jugador.setIdJugador(idJugador);
            jugador.setIdEquipo(idEquipo);
            jugador.setJugadorName(resultJugadorName);
            jugador.setPosicion(resultJugadorPosicion);
            return jugador;
        }
        return null;
    }
}

