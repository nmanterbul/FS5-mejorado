package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Torneo;

import java.util.ArrayList;
import java.util.List;

public class TorneosDao {


    public static boolean crearTorneo(String torneoName) {
        String select = "INSERT INTO torneos (torneoName) VALUES (?)";
        Object[] params = {torneoName};
        long result = ConnectionManager.ejecutarInsertSQL(select,params);

        if (result > 0){
            System.out.println("Torneo insertado correctamente");
            return true;
        }else {
            System.out.println("Algo ha ido mal");
            return false;
        }
    }

    public static List<Torneo> obtenerTorneos() {
        String select = "SELECT * FROM torneos";
        Object[] params = {};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select,params);

        List<Torneo> listaTorneos = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            Torneo torneo = new Torneo();
            int idTorneo = (int) result[i][0];
            int idEquipo = (int) result[i][1];
            String resultTorneoName = (String) result[i][2];

            torneo.setId(idTorneo);
            torneo.setIdEquipo(idEquipo);
            torneo.setTorneoName(resultTorneoName);

            listaTorneos.add(torneo);
        }
        return listaTorneos;
    }

    public static Torneo obtenerTorneo(int idTorneo) {
        String select = "SELECT * FROM torneos WHERE idTorneo = ?";
        Object[] params = {idTorneo};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select,params);

        if (result.length > 0){
            Torneo torneo = new Torneo();
            int idTorneo1 = (int) result[0][0];
            String resultTorneoName = (String) result[0][1];

            torneo.setId(idTorneo1);
            torneo.setTorneoName(resultTorneoName);

            return torneo;
        }
        return null ;
    }

    public static boolean actualizarTorneo(int idTorneo, String torneoName) {
        String update = "UPDATE torneos set torneoName = ? where idTorneo = ?";
        Object[] params = {torneoName, idTorneo};
        int result = ConnectionManager.ejecutarUpdateSQL(update, params);

        if (result > 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean anadirEquipoTorneo(int idTorneo, int idEquipo) {
        String update = "INSERT INTO torneos (idTorneo,idEquipo) VALUES (?,?)";
        Object[] params = {idTorneo, idEquipo};
        long result = ConnectionManager.ejecutarInsertSQL(update, params);

        if (result > 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean eliminarEquipoTorneo(int idTorneo, int idEquipo) {
        String delete = "DELETE FROM torneos WHERE idTorneo = ? and idEquipo = ?";
        Object[] params = {idTorneo, idEquipo};
        long result = ConnectionManager.ejecutarUpdateSQL(delete, params);

        if (result > 0){
            return true;
        }else {
            return false;
        }
    }
}
