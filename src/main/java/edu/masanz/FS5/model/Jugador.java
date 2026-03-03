package edu.masanz.FS5.model;

public class Jugador {

    int idJugador;
    int idEquipo;
    String jugadorName;
    String posicion;

    public Jugador(){

    }

    public Jugador(String jugadorName, String posicion) {
        this.jugadorName = jugadorName;
        this.posicion = posicion;
    }

    public Jugador(int idJugador, int idEquipo, String jugadorName, String posicion) {
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
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

    @Override
    public String       toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", idEquipo=" + idEquipo +
                ", jugadorName='" + jugadorName + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
