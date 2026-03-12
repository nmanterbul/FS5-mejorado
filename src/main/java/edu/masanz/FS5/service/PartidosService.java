package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.PartidosDao;
import edu.masanz.FS5.model.Partido;

import java.util.List;

public class PartidosService {
    public static List<Partido> obtenerPartidos(int idTorneo, int idJornada) {
        return PartidosDao.obtenerPartidos(idTorneo,idJornada);
    }
}
