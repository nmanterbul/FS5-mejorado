package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.TorneosDao;

public class TorneoService {

    public static boolean crearTorneo(String torneoName){

       return TorneosDao.crearTorneo(torneoName);
    }
}
