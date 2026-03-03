package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Division;
import edu.masanz.FS5.model.Jugador;

public class JugadorDao {

  public static Jugador crearJugador(String nombre, String poscion){

      Jugador jugador = new Jugador(nombre,poscion);

      return null;
  }

    public static Jugador obtenerJugador(String nombre, String posicion) {
        String select = "SELECT id FROM jugador WHERE id = ?";
        Object[] params = {nombre, posicion};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select,params);

        if (result.length > 0){
            Jugador jugador = new Jugador();
             nombre= (String) result[0][0];
            posicion = (String) result[0][1];
            jugador.setJugadorName(nombre);
            jugador.setPosicion(posicion);
            return jugador;
        }
        return null;
    }

    public static void eliminarPorNombre(String jugadorName) {

      Jugador jugador = new Jugador();
      if (jugador.getJugadorName().equals(jugadorName)){



      }

    }
}
