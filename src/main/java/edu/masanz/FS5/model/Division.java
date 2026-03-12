package edu.masanz.FS5.model;

public class Division {

    private int division;
    private String nombre;


    public Division(){

    }

    public Division(int division, String nombre) {
        this.division = division;
        this.nombre = nombre;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
