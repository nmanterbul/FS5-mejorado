package edu.masanz.FS5.controller;

import edu.masanz.FS5.dto.Usuario;
import edu.masanz.FS5.service.FS5Service;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class FS5controller {

    private static final FS5Service FS5Service = new FS5Service();

    public static void servirLogin(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/inventario/login.ftl", model);
    }

    public static void servirCompeticionesIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/inventario/competiciones.ftl", model);
    }

    public static void servirEquiposIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("templates/inventario/equipos.ftl", model);
    }


    public static void servirGestionIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        model.put("nombre","password");
        String nombre = context.formParam("nombre");
        String password = context.formParam("password");
        Usuario usuario = FS5Service.buscarNombre(nombre);
        Usuario contra = FS5Service.buscarPassword(password);
        int rol = FS5Service.buscarRol(nombre,password);
        if (usuario != null && contra != null && rol == 1){
            context.render("templates/inventario/gestion.ftl");
        }else if (usuario != null && contra != null){
            context.redirect("templates/index.ftl");
        }else{
            context.redirect("templates/inventario/login.ftl");
        }

    }
}
