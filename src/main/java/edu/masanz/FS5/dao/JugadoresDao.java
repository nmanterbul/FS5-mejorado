package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Jugador;

import java.util.ArrayList;
import java.util.List;

public class JugadoresDao {

    public static Jugador crearJugador(String jugadorName, String posicion) {

        return null;

    }





    public static Jugador obtenerJugador(int idJugador) {
        String select = "SELECT * FROM jugadores WHERE idTorneo = ?";
        Object[] params = {idJugador};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        if (result.length > 0) {
            Jugador jugador = new Jugador();
            int idJugador1 = (int) result[0][0];
            int idEquipo = (int) result[0][1];
            int idTorneo = (int) result[0][2];
            String resultJugadorName = (String) result[0][3];
            String resultJugadorPosicion = (String) result[0][4];
            jugador.setIdJugador(idJugador1);
            jugador.setIdEquipo(idEquipo);
            jugador.setIdTorneo(idTorneo);
            jugador.setJugadorName(resultJugadorName);
            jugador.setPosicion(resultJugadorPosicion);
            return jugador;
        }
        return null;
    }

    public static boolean actualizarJugador(int idJugador, String nombre) {

        String update = "UPDATE jugadores set idJugador = ?, set nombre = ? where idJugador = ?";
        Object[] params = {idJugador, nombre};
        int result = ConnectionManager.ejecutarUpdateSQL(update, params);

        if (result > 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean borrarJugador(int idJugador, String nombre) {
        String update = "DELETE FROM jugadores WHERE idJugador = ?";
        Object[] params = {idJugador,nombre};
        int result = ConnectionManager.ejecutarUpdateSQL(update, params);

        if (result > 0){
            return true;
        }else {
            return false;
        }
    }

    public static List<Jugador> obtenerJugadores(int idTorneo) {
    String select = "SELECT * FROM jugadores WHERE idTorneo = ?";
    Object[] params = {idTorneo};
    Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

    List<Jugador> listaJugadores = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {

        Jugador jugador = new Jugador();
        int idJugador = (int) result[i][0];
        int idEquipo = (int) result[i][1];
        int idTorneillo = (int) result[i][2];
        String resultJugadorName = (String) result[i][3];
        String resultJugadorPosicion = (String) result[i][4];

        jugador.setIdJugador(idJugador);
        jugador.setIdEquipo(idEquipo);
        jugador.setIdTorneo(idTorneillo);
        jugador.setJugadorName(resultJugadorName);
        jugador.setPosicion(resultJugadorPosicion);
        listaJugadores.add(jugador);
    }
        return listaJugadores;
}

    public static List<Jugador> obtenerJugadoresDeEquipo(int idEquipo) {
        String select = "SELECT * FROM jugadores WHERE idEquipo = ?";
        Object[] params = {idEquipo};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        List<Jugador> listaJugadores = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {

            Jugador jugador = new Jugador();
            int idJugador = (int) result[i][0];
            int idEquipo1 = (int) result[i][1];
            int idTorneillo = (int) result[i][2];
            String resultJugadorName = (String) result[i][3];
            String resultJugadorPosicion = (String) result[i][4];

            jugador.setIdJugador(idJugador);
            jugador.setIdEquipo(idEquipo1);
            jugador.setIdTorneo(idTorneillo);
            jugador.setJugadorName(resultJugadorName);
            jugador.setPosicion(resultJugadorPosicion);
            listaJugadores.add(jugador);
        }
        return listaJugadores;
    }
}

