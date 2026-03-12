package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Partido;

import java.util.ArrayList;
import java.util.List;

public class PartidosDao {
    public static List<Partido> obtenerPartidos(int idTorneo, int idJornada) {
        String select = "SELECT * FROM partidos WHERE idTorneo = ? and idJornada = ?";
        Object[] params = {idTorneo,idJornada};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select,params);

        List<Partido> listaPartidos = new ArrayList<>();

        for (int i = 0; i < result.length; i++) {
            Partido partido = new Partido();

            int idPartido = (int) result[i][1];
            String equipoLocal = (String) result[i][2];
            String equipoVisitante = (String) result[i][3];
            int golesLocal = (int) result[i][4];
            int golesVisitante = (int) result[i][5];
            int idJornada1 = (int) result[i][6];
            int idTorneo1 = (int) result[i][7];

            partido.setIdPartido(idPartido);
            partido.setEquipoLocal(equipoLocal);
            partido.setEquipoVisitante(equipoVisitante);
            partido.setGolesLocal(golesLocal);
            partido.setGolesVisitante(golesVisitante);
            partido.setIdJornada(idJornada1);
            partido.setIdTorneo(idTorneo1);

            listaPartidos.add(partido);
        }
        return listaPartidos;
    }
}
