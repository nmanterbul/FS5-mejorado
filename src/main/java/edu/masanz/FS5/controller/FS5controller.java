package edu.masanz.FS5.controller;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class FS5controller {

    public static void index(@NotNull Context context) {
        Map<String,Object> model = new HashMap<>();
        context.render("/templates/index.ftl",model);

    }


    public static void login(@NotNull Context context) {
        Map<String,Object> model = new HashMap<>();
        context.render("/templates/login.ftl",model);

    }

    public static void gestion(@NotNull Context context) {

        Map<String,Object> model = new HashMap<>();
        context.render("/templates/gestion.ftl",model);
    }


    public static void opcionesGestion(@NotNull Context context) {
        Map<String,Object> model = new HashMap<>();
        context.render("/templates/opcionesDeGestion.ftl",model);


    }

    public static void opcionesEquipo(@NotNull Context context) {

        Map<String,Object> model = new HashMap<>();
        context.render("/templates/opcionesDeGestion.ftl",model);

    }


    public static void servirLogin(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/login.ftl", model);
    }

    public static void servirCompeticiones(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/competiciones.ftl", model);
    }

    public static void servirEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/equipos.ftl", model);
    }
}
