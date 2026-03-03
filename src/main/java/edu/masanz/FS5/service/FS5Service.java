package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.FS5DaoMap;
import edu.masanz.FS5.dao.IFS5Dao;
import edu.masanz.FS5.dto.Usuario;

public class FS5Service {

    public IFS5Dao FS5Dao;

    public FS5Service(){
        FS5Dao = new FS5DaoMap();
    }




    public Usuario buscarNombre(String nombre){
        return null;
    }

    public Usuario buscarPassword(String password){
        return null;
    }

    public int buscarRol(String nombre, String password){

        Usuario usuario = new Usuario(nombre, password);

        return usuario.getRol();
    }


}
