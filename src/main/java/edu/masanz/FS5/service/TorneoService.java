package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.TorneosDao;
import edu.masanz.FS5.model.Torneo;

public class TorneoService {

    public static Torneo crearTorneo(String id, String torneoName){

        return TorneosDao.crearTorneo(id,torneoName);
    }
}
