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
        context.render("/templates/competicionesIndex.ftl", model);
    }

    public static void servirEquiposIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/");
        context.render("/templates/equiposIndex.ftl", model);
    }

    public static void servirTablaEquipos(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("backURL", "/equiposIndex");
        context.render("/templates/tablaEquipos.ftl", model);
    }
}
