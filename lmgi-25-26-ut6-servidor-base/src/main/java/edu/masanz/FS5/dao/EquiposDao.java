package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Equipo;

import java.util.ArrayList;
import java.util.List;

public class EquiposDao {

    public static List<Equipo> obtenerEquipos(int idTorneo) {
        String select = "SELECT * FROM equipos WHERE idTorneo = ?";
        Object[] params = {idTorneo};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        List<Equipo> listaEquipos = new ArrayList<>();

        for (int i = 0; i < result.length; i++) {

            Equipo equipo = new Equipo();
            int idEquipo = (int) result[i][0];
            int idTorneo1 = (int) result[i][1];
            String resultEquipoName = (String) result[i][2];
            int cantidadJug  = (int) result[i][3];
            int cantidadPuntos  = (int) result[i][4];
            int posicion  = (int) result[i][5];



            equipo.setIdEquipo(idEquipo);
            equipo.setIdTorneo(idTorneo1);
            equipo.setEquipoName(resultEquipoName);
            equipo.setCantidadJug(cantidadJug);
            equipo.setCantidadPuntos(cantidadPuntos);
            equipo.setPosicion(posicion);

            listaEquipos.add(equipo);

        }
        return listaEquipos;
    }

    public static Equipo obtenerEquipo(int idEquipo) {
        String select = "SELECT * FROM equipos WHERE idEquipo = ?";
        Object[] params = {idEquipo};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        if (result.length > 0) {
            Equipo equipo = new Equipo();
            int idEquipo1 = (int) result[0][0];
            int idTorneo1 = (int) result[0][1];
            String resultEquipoName = (String) result[0][2];
            int cantidadJug  = (int) result[0][3];
            int cantidadPuntos  = (int) result[0][4];
            int posicion  = (int) result[0][5];



            equipo.setIdEquipo(idEquipo1);
            equipo.setIdTorneo(idTorneo1);
            equipo.setEquipoName(resultEquipoName);
            equipo.setCantidadJug(cantidadJug);
            equipo.setCantidadPuntos(cantidadPuntos);
            equipo.setPosicion(posicion);;
            return equipo;
        }
        return null;
    }

    public static boolean actualizarEquipo(int idEquipo, String equipoName) {
        String update = "UPDATE equipos set idEquipo = ?, set equipoName = ? where idEquipo = ?";
        Object[] params = {idEquipo, equipoName};
        int result = ConnectionManager.ejecutarUpdateSQL(update, params);

        if (result > 0){
            return true;
        }else {
            return false;
        }
    }

    public static List<Equipo> obtenerEquiposNoEnTorneo(int idTorneo) {
        String select = "SELECT * FROM equipos WHERE idTorneo != ?";
        Object[] params = {idTorneo};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        List<Equipo> listaEquipo = new ArrayList<>();

        if (result.length > 0) {
            Equipo equipo = new Equipo();
            int idEquipo = (int) result[0][0];
            int idTorneo1 = (int) result[0][1];
            String resultEquipoName = (String) result[0][2];
            int cantidadJug  = (int) result[0][3];
            int cantidadPuntos  = (int) result[0][4];
            int posicion  = (int) result[0][5];



            equipo.setIdEquipo(idEquipo);
            equipo.setIdTorneo(idTorneo1);
            equipo.setEquipoName(resultEquipoName);
            equipo.setCantidadJug(cantidadJug);
            equipo.setCantidadPuntos(cantidadPuntos);
            equipo.setPosicion(posicion);
            listaEquipo.add(equipo);
        }
        return listaEquipo;
    }

    public static boolean borrarEquipo(int idTorneo, String equipoName) {
        String delete = "DELETE FROM equipos WHERE idTorneo = ? AND equipoName = ?";
        Object[] params = {idTorneo, equipoName};
        long result = ConnectionManager.ejecutarUpdateSQL(delete, params);

        if (result > 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean crearEquipo(int idTorneo, String equipoName) {
        String sql = "INSERT INTO equipos (idTorneo, jugadorName, cantidadJug, cantidadPuntos, posicion) " +
                "VALUES (?,?,?,?,?)";

        Object[] params = {idTorneo,equipoName, 0, 0, 0};
        long result = ConnectionManager.ejecutarInsertSQL(sql,params);


        if (result > 0){
            System.out.println("Equipo creado correctamente");
            return true;
        }else {
            System.out.println("Algo ha ido mal");
            return false;
        }

    }
}
