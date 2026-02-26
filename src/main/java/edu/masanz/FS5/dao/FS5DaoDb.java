package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;

public class FS5DaoDb {


    public FS5DaoDb(){
        ConnectionManager.conectar("FS5_db", "FS5", "FS5");
    }
}
