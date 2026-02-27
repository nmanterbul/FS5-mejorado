package edu.masanz.FS5.controller;

import edu.masanz.FS5.service.FS5Service;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class FS5controller {

    private static final FS5Service FS5Service = new FS5Service();

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
        context.render("/templates/error.ftl");
    }

    public static void servirGestion(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/login");
        context.render("/templates/gestion.ftl", model);
    }

    public static void servirGestionTorneos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestionTorneos.ftl", model);
    }

    public static void servirGestionEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestionEquipos.ftl", model);
    }

    public static void servirGestionJugadores(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestion");
        context.render("/templates/gestionJugadores.ftl", model);
    }

    public static void servirCrearTorneo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/gestionTorneos");
        context.render("/templates/crearTorneo.ftl", model);
    }
}
