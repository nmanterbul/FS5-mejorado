package edu.masanz.FS5.model;

public class Usuarios {

    private String nombre;
    private int edad;
    private int rol;
    private int id;
    private String password;

    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, int rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
