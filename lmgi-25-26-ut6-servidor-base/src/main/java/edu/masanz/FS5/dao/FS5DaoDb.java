package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;

public class FS5DaoDb implements IFS5Dao {

    public FS5DaoDb(){
        ConnectionManager.conectar("FS5_DB", "proy", "password");
    }



}
