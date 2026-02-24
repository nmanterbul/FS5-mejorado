package edu.masanz.FS5.dto;

public class Usuario {

    private int rol;

    private String nombre;

    private String contrasena;


    public Usuario (){

    }

    public Usuario(int rol, String nombre, String contrasena) {
        this.rol = rol;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


}
