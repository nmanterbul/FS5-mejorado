package edu.masanz.FS5;

import edu.masanz.FS5.controller.FS5controller;
import edu.masanz.FS5.controller.UsersController;
import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.User;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.rendering.template.JavalinFreemarker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("ARRANCANDO APLICACION");
        ConnectionManager.conectar("FS5_DB","proy","password");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);

        app.before("/admin*",FS5controller::admin);

        // PRINCIPAL
        app.get("/", FS5controller::servirIndex);
        // INDEX
        app.get("/login", FS5controller::servirLogin);
        app.get("/competicionesIndex", FS5controller::servirCompeticionesIndex);
        app.get("/equiposIndex", FS5controller::servirEquiposIndex);
        app.get("/tablaEquipos/{id}", FS5controller::servirTablaEquipos);
        app.get("/equipo", FS5controller::servirEquipo);




        // ZONA ADMINISTRADOR
        app.post("/admin/gestion", FS5controller::login);
        app.get("/admin/gestion", FS5controller::servirGestion);
        app.get("/admin/gestionTorneos", FS5controller::servirGestionTorneos);
        app.get("/admin/gestionEquipos", FS5controller::servirGestionEquipos);
        app.get("/admin/gestionJugadores", FS5controller::servirGestionJugadores);
        // TORNEOS
        app.get("/admin/crearTorneo", FS5controller::servirCrearTorneo);
        app.get("/admin/editarTorneo", FS5controller::servirEditarTorneo);
        app.get("/admin/borrarTorneo", FS5controller::servirBorrarTorneo);
        // EQUIPOS
        app.get("/admin/crearEquipo", FS5controller::servirCrearEquipo);
        app.get("/admin/editarEquipo", FS5controller::servirEditarEquipo);
        app.get("/admin/borrarEquipo", FS5controller::servirBorrarEquipo);
        // JUGADORES
        app.get("/admin/crearJugador", FS5controller::servirCrearJugador);
        app.get("/admin/editarJugador", FS5controller::servirEditarJugador);
        app.get("/admin/borrarJugador", FS5controller::servirBorrarJugador);
    }



}