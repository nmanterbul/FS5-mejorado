package edu.masanz.FS5.Service;

import edu.masanz.FS5.dao.IFS5Dao;
import edu.masanz.FS5.model.Usuarios;

public class FS5Service {

    public IFS5Dao FS5Dao;

    public FS5Service(){
//        FS5Dao = new FS5DaoMap();
    }




    public Usuarios buscarNombre(String nombre){
        return null;
    }

    public Usuarios buscarPassword(String password){
        return null;
    }

    public int buscarRol(String nombre, String password){

        Usuarios usuario = new Usuarios();

        return usuario.getRol();
    }
}
