package edu.masanz.FS5.model;

public class Jugador {


   private String jugadorName;
  private  String posicion;



    public Jugador(){

    }

    public Jugador(  String jugadorName, String posicion) {

        this.jugadorName = jugadorName;
        this.posicion = posicion;
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
    public String toString() {
        return "Jugador{" +
                ", jugadorName='" + jugadorName + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
