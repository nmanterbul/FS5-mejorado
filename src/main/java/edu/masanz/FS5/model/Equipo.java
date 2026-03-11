package edu.masanz.FS5.model;

public class Equipo {

    private int idEquipo;
    private int idTorneo;
    private String equipoName;
    private int cantidadJug;
    private int cantidadPuntos;
    private int posicion;

    public Equipo(){

    }

    public Equipo(int idEquipo, int idTorneo, String equipoName, int cantidadJug) {
        this.idEquipo = idEquipo;
        this.idTorneo = idTorneo;
        this.equipoName = equipoName;
        this.cantidadJug = cantidadJug;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getEquipoName() {
        return equipoName;
    }

    public void setEquipoName(String equipoName) {
        this.equipoName = equipoName;
    }

    public int getCantidadJug() {
        return cantidadJug;
    }

    public void setCantidadJug(int cantidadJug) {
        this.cantidadJug = cantidadJug;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo=" + idEquipo +
                ", idTorneo=" + idTorneo +
                ", equipoName='" + equipoName + '\'' +
                ", cantidadJug=" + cantidadJug +
                '}';
    }
}
