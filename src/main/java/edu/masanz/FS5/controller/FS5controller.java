package edu.masanz.FS5.controller;

import edu.masanz.FS5.dao.JugadorDao;
import edu.masanz.FS5.model.Jugador;
import edu.masanz.FS5.service.JugadorService;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FS5controller {

    //region index
    public static void servirIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/index.ftl", model);
    }


    //endregion

    //region login
    public static void servirLogin(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/login.ftl", model);
    }

    //endregion

    //region competicionesIndex
    public static void servirCompeticionesIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/competiciones/competicionesindex.ftl", model);
    }

    //endregion

    //region equiposIndex
    public static void servirEquiposIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/equipos/equiposindex.ftl", model);

    }
    public static void servirEquipos(@NotNull Context context) {


        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/tablaEquipos");
        context.render("/templates/equipos/equipos.ftl", model);
    }

    //endregion

    //region tablaEquipos
    public static void servirTablaEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/equiposIndex");
        context.render("/templates/equipos/tablaEquipos.ftl", model);
    }

    //endregion

    //region gestion
    public static void servirGestion(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/login");
        context.render("/templates/gestion/gestion.ftl", model);
    }

    //endregion

    //region torneos
    public static void servirGestionTorneos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/torneos/gestionTorneos.ftl", model);
    }
    public static void servirCrearTorneo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionTorneos");
        context.render("/templates/gestion/torneos/crearTorneo.ftl", model);
    }

    public static void servirEditarTorneo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionTorneos");
        context.render("/templates/gestion/torneos/editarTorneo.ftl", model);
    }

    public static void servirBorrarTorneo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionTorneos");
        context.render("/templates/gestion/torneos/borrarTorneo.ftl", model);
    }

    //endregion

    //region Equipos
    public static void servirGestionEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/equipos/gestionEquipos.ftl", model);
    }
    public static void servirCrearEquipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/equipos/crearEquipo.ftl", model);
    }

    public static void servirEditarEquipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/equipos/editarEquipo.ftl", model);
    }

    public static void servirBorrarEquipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/equipos/borrarEquipo.ftl", model);
    }

    //endregion

    //region Jugadores
    public static void servirGestionJugadores(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/jugadores/gestionJugadores.ftl", model);
    }
    public static void servirCrearJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/jugadores/crearJugador.ftl", model);
    }

    public static void servirEditarJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/jugadores/editarJugador.ftl", model);
    }

    public static void servirBorrarJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionEquipos");
        context.render("/templates/gestion/jugadores/borrarJugador.ftl", model);
    }

    //endregion


    public static void servirCompeticiones(@NotNull Context context) {

        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/index");
        context.render("/templates/competiciones/competiciones.ftl", model);
    }


    public static void crearJugador(@NotNull Context context) {

        String jugadorName = context.formParam("jugadorName");
        String posicion = context.formParam("posicion");

        Jugador jugador = new Jugador(jugadorName,posicion);

        jugador = JugadorService.crearJugador(jugadorName,posicion);
    }

    public static void editarJugador(@NotNull Context context) {
    }

    public static void borrarJugador1(@NotNull Context context) {

        String jugadorName = context.formParam("jugadorName");
        String posicion = context.formParam("posicion");

        Jugador jugador = new Jugador(jugadorName,posicion);




    }

    public static void borrarJugador(@NotNull Context ctx) {
//        String nombre = ctx.sessionAttribute("alias");
//        int numpagina = ctx.sessionAttribute("numpagina");
//        Map<String, List<String>> id = ctx.formParamMap();
//        for (Map.Entry<String, List<String>> entry : id.entrySet()) {
//            String key = entry.getKey();
//            if (key.startsWith("id_")) {
//                int numpregunta = Integer.parseInt(key.substring("id_".length()));
//                int valor = Integer.parseInt(entry.getValue().get(0));
//                System.out.println(key + " = " + valor);
//                encuestaService.upsertResultado(nombre, numpregunta, valor);
//            }


    }



    public static void servirListaJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/crearEquipo");
        context.render("/templates/gestion/jugadores/ListarJugador.ftl", model);

    }

    public static void servirTablaJornadas(@NotNull Context context) {

        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/competiciones");
        context.render("/templates/jornadas/tablaJornadas1.ftl", model);

    }
}