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
            int idTorneillo = (int) result[i][1];
            String resultEquipoName = (String) result[i][2];
            int cantidadJug = (int) result[i][3];

            equipo.setIdEquipo(idEquipo);
            equipo.setIdTorneo(idTorneillo);
            equipo.setEquipoName(resultEquipoName);
            equipo.setCantidadJug(cantidadJug);
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
            int idTorneo = (int) result[0][1];
            String resultEquipoName = (String) result[0][2];
            int cantidadJug  = (int) result[0][3];
            equipo.setIdEquipo(idEquipo1);
            equipo.setIdTorneo(idTorneo);
            equipo.setEquipoName(resultEquipoName);
            equipo.setCantidadJug(cantidadJug);
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
            equipo.setIdEquipo(idEquipo);
            equipo.setIdTorneo(idTorneo1);
            equipo.setEquipoName(resultEquipoName);
            equipo.setCantidadJug(cantidadJug);
            listaEquipo.add(equipo);
        }
        return listaEquipo;
    }
}
