package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Jugador;

import java.util.ArrayList;
import java.util.List;

public class JugadoresDao {

    public static boolean crearJugador( int idTorneo, String jugadorName, String posicion) {

        String sql = "INSERT INTO jugadores " +
                "( idTorneo, jugadorName, posicion, posicionGoleadores, numGoles) " +
                "VALUES (?,?,?,?,?)";

        Object[] params = { idTorneo, jugadorName, posicion, 0, 0};
        long result = ConnectionManager.ejecutarInsertSQL(sql,params);


        if (result > 0){
            System.out.println("Jugador insertado correctamente");
            return true;
        }else {
            System.out.println("Algo ha ido mal");
            return false;
        }

    }





    public static Jugador obtenerJugador(int idJugador) {

        String select = "SELECT * FROM jugadores WHERE idJugador = ?";
        Object[] params = {idJugador};

        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        if (result.length > 0) {

            Jugador jugador = new Jugador();

            int idJugador1 = (int) result[0][0];
            int idEquipo = (int) result[0][1];
            int idTorneillo = (int) result[0][2];
            String resultJugadorName = (String) result[0][3];
            String resultJugadorPosicion = (String) result[0][4];
            int posicionGoleador = (int) result[0][5];
            int numGoles = (int) result[0][6];

            jugador.setIdJugador(idJugador1);
            jugador.setIdEquipo(idEquipo);
            jugador.setIdTorneo(idTorneillo);
            jugador.setJugadorName(resultJugadorName);
            jugador.setPosicion(resultJugadorPosicion);
            jugador.setPosicionGoleadores(posicionGoleador);
            jugador.setNumGoles(numGoles);

            return jugador;
        }

        return null;
    }

    public static boolean actualizarJugador(int idJugador, String nombre, String posicion) {

        String update = "UPDATE jugadores set nombre = ?, set posicion = ? where idJugador = ?";
        Object[] params = {nombre, posicion, idJugador};
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
        int posicionGoleadores = (int) result[i][5];
        int numGoles = (int) result[i][6];

        jugador.setIdJugador(idJugador);
        jugador.setIdEquipo(idEquipo);
        jugador.setIdTorneo(idTorneillo);
        jugador.setJugadorName(resultJugadorName);
        jugador.setPosicion(resultJugadorPosicion);
        jugador.setPosicionGoleadores(posicionGoleadores);
        jugador.setNumGoles(numGoles);
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
            int posicionGoleador = (int) result[i][5];
            int numGoles = (int) result[i][6];

            jugador.setIdJugador(idJugador);
            jugador.setIdEquipo(idEquipo1);
            jugador.setIdTorneo(idTorneillo);
            jugador.setJugadorName(resultJugadorName);
            jugador.setPosicion(resultJugadorPosicion);
            jugador.setPosicionGoleadores(posicionGoleador);
            jugador.setNumGoles(numGoles);
            listaJugadores.add(jugador);
        }
        return listaJugadores;
    }
}

