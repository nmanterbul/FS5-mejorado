package edu.masanz.FS5.model;

public class Jugador {

    int idJugador;
    int idEquipo;
    int idTorneo;
    String jugadorName;
    String posicion;

    public Jugador(){

    }

    public Jugador(int idJugador, String jugadorName){
        this.idJugador = idJugador;
        this.jugadorName = jugadorName;
    }

    public Jugador(String jugadorName, String posicion) {
        this.jugadorName = jugadorName;
        this.posicion = posicion;
    }

    public Jugador(int idJugador, int idEquipo, int idTorneo ,String jugadorName, String posicion) {
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
        this.idTorneo = idTorneo;
        this.jugadorName = jugadorName;
        this.posicion = posicion;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getJugadorName() {
        return jugadorName;
    }

    public void setJugadorName(String jugadorName) {
        this.jugadorName = jugadorName;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public int getIdTorneo(int idTorneo) {
        return idTorneo;
    }

    @Override
    public String       toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", idEquipo=" + idEquipo +
                ", jugadorName='" + jugadorName + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }
}
