package edu.masanz.FS5.controller;

import edu.masanz.FS5.model.Jugador;
import edu.masanz.FS5.model.Torneo;
import edu.masanz.FS5.model.User;
import edu.masanz.FS5.service.FS5Service;
import edu.masanz.FS5.service.JugadorService;
import edu.masanz.FS5.service.TorneoService;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class FS5controller {

    private static final FS5Service FS5Service = new FS5Service();
    private static final User user = new User();

    public static void ejemplo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/index.ftl",model);
    }

    public static void servirLogin(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/login.ftl", model);
    }

    public static void servirCompeticionesIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/competiciones/competiciones.ftl", model);
    }

    public static void servirEquiposIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/equipos/equipo.ftl", model);
    }

    public static void servirTablaEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/equiposIndex");
        context.render("/templates/equipos/tablaEquipos.ftl");
    }

    public static void servirGestion(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/login");
        context.render("/templates/gestion/gestion.ftl", model);
    }

    public static void servirGestionTorneos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/torneos/gestionTorneos.ftl", model);
    }

    public static void servirGestionEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/equipos/gestionEquipos.ftl", model);
    }

    public static void servirGestionJugadores(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestion/jugadores/gestionJugadores.ftl", model);
    }

    public static void servirCrearTorneo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        Torneo torneo = new Torneo();
        model.put("backURL", "/gestionTorneos");
        model.put("agregar", true);
        model.put("torneo", torneo);
        context.render("/templates/gestion/torneos/crearTorneo.ftl", model);
    }
    public static void CrearTorneo(@NotNull Context context) {
        String id = context.formParam("id");
        String torneoName = context.formParam("torneoName");

        Torneo torneo = new Torneo(id,torneoName);
        torneo = TorneoService.crearTorneo(id,torneoName);

        if (torneo.getId() != "0"){
            context.redirect("/templates/gestion/competiciones/competiciones.ftl");
        }else{
            context.redirect("/templates/error.ftl");
        }
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

    //region gestion

        //region gestion equipos
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

        //region gestion jugadores
    public static void servirCrearJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();

        model.put("backURL", "/gestionJugadores");

        context.render("/templates/gestion/jugadores/crearJugador.ftl", model);
    }

    public static void CrearJugador(@NotNull Context context) {

        String jugadorName = context.formParam("jugadorName");
        String posicion = context.formParam("posicion");

        Jugador jugador = JugadorService.crearJugador(jugadorName,posicion);
        if (!jugador.getJugadorName().equals(jugadorName) && !jugador.getPosicion().equals(posicion)){
            context.redirect("/gestionJugadores");
        }else{
            context.render("/templates/error.ftl");
        }
    }

    public static void servirEditarJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionJugadores");
        context.render("/templates/gestion/jugadores/editarJugador.ftl", model);
    }

    public static void EditarJugador(@NotNull Context context) {

    }

    public static void servirBorrarJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionJugadores");
        context.render("/templates/gestion/jugadores/borrarJugador.ftl", model);
    }

    public static void BorrarJugador(@NotNull Context context) {
    }

    //endregion

    //endregion


    public static void admin(@NotNull Context context) {

    }



}
