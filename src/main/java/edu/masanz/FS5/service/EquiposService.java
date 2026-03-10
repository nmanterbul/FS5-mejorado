package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.TorneosDao;
import edu.masanz.FS5.model.Equipo;
import edu.masanz.FS5.dao.EquiposDao;
import edu.masanz.FS5.model.Torneo;

import java.util.List;

public class EquiposService {
    public static List<Equipo> obtenerEquipos(int idTorneo) {
        return EquiposDao.obtenerEquipos(idTorneo);
    }

    public static Equipo obtenerEquipo(int idEquipo) {
        return EquiposDao.obtenerEquipo(idEquipo);
    }

    public static boolean actualizarEquipo(int idEquipo, String equipoName) {
        return EquiposDao.actualizarEquipo(idEquipo, equipoName);
    }

    public static List<Torneo> obtenerTorneos() {
        return TorneosDao.obtenerTorneos();
    }
}
