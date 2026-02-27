package edu.masanz.FS5.controller;

import edu.masanz.FS5.model.User;
import edu.masanz.FS5.service.UsersService;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;


public class FS5controller {

    public static void servirIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/index.ftl", model);
    }

    public static void servirLogin(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/login.ftl", model);
    }

    public static void servirCompeticionesIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/competiciones/competicionesIndex.ftl", model);
    }

    public static void servirEquiposIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/equipos/equiposIndex.ftl", model);
    }

    public static void servirTablaEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/equiposIndex");
        context.render("/templates/equipos/tablaEquipos.ftl", model);
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

    public static void servirCrearJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionJugadores");
        context.render("/templates/gestion/jugadores/crearJugador.ftl", model);
    }

    public static void servirEditarJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionJugadores");
        context.render("/templates/gestion/jugadores/editarJugador.ftl", model);
    }

    public static void servirBorrarJugador(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionJugadores");
        context.render("/templates/gestion/jugadores/borrarJugador.ftl", model);
    }

    public static void login(Context context){
        Map<String, Object> model = new HashMap<>();
        model.put("username", "username");
        model.put("pass", "pass");

        String username = context.formParam("username");
        String password = context.formParam("pass");

        User user = UsersService.login(username,password);

        if (user!=null){
            context.render("templates/gestion/gestion.ftl", model);
        }else {
            context.render("templates/error.ftl", model);
        }

    }
}
