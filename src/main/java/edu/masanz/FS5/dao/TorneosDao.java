package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Torneo;

import java.util.ArrayList;
import java.util.List;

public class TorneosDao {


    public static Torneo crearTorneo(String torneoName) {
        String select = "INSERT INTO torneos (torneoName) VALUES (?)";
        Object[] params = {torneoName};
        long result = ConnectionManager.ejecutarInsertSQL(select,params);

        if (result > 0){
            System.out.println("Torneo insertado correctamente");
        }else {
            System.out.println("Algo ha ido mal");
        }
        return null;
    }

    public static List<Torneo> obtenerTorneos() {
        String select = "SELECT * FROM torneos";
        Object[] params = {};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select,params);

        List<Torneo> listaTorneos = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            Torneo torneo = new Torneo();
            int idTorneo = (int) result[0][0];
            String resultTorneoName = (String) result[0][1];

            torneo.setId(idTorneo);
            torneo.setTorneoName(resultTorneoName);

            listaTorneos.add(torneo);
        }
        return listaTorneos;
    }
}
