package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.TorneosDao;
import edu.masanz.FS5.model.Torneo;

import java.util.List;

public class TorneoService {

    public static boolean crearTorneo(String torneoName){

       return TorneosDao.crearTorneo(torneoName);
    }

    public static List<Torneo> obtenerTorneos() {
        return TorneosDao.obtenerTorneos();
    }

    public static Torneo obtenerTorneo(int idTorneo) {
        return TorneosDao.obtenerTorneo(idTorneo);
    }

    public static boolean actualizarTorneo(int idTorneo, String nombreTorneo) {
        return TorneosDao.actualizarTorneo(idTorneo,nombreTorneo);
    }

    public static boolean anadirEquipoTorneo(int idTorneo, int idEquipo) {
        return TorneosDao.anadirEquipoTorneo(idTorneo,idEquipo);
    }

    public static boolean eliminarEquipoTorneo(int idTorneo, int idEquipo) {
        return TorneosDao.eliminarEquipoTorneo(idTorneo, idEquipo);
    }
}
