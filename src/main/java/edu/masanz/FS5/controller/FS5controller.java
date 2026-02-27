package edu.masanz.FS5.controller;

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
        context.render("/templates/competiciones/competicionesindex.ftl", model);
    }

    public static void servirEquiposIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/equipos/equiposindex.ftl", model);
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

    public static void servirCompeticiones(@NotNull Context context) {

        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/index");
        context.render("/templates/competiciones/competiciones.ftl", model);
    }

    public static void servirEquipos(@NotNull Context context) {


        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/tablaEquipos");
        context.render("/templates/equipos/equipos.ftl", model);
    }
}