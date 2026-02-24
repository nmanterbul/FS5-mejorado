package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.FS5DaoMap;
import edu.masanz.FS5.dao.IFS5Dao;

public class FS5Service {

    public IFS5Dao FS5Dao;

    public FS5Service(){
        FS5Dao = new FS5DaoMap();
    }




}
