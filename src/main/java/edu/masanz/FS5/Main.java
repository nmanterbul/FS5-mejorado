package edu.masanz.FS5;

import edu.masanz.FS5.controller.FS5controller;
import edu.masanz.FS5.controller.UsersController;
import edu.masanz.FS5.database.ConnectionManager;
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

        // PRINCIPAL
        app.get("/", FS5controller::servirIndex);
        // INDEX
        app.get("/login", FS5controller::servirLogin);
        app.get("/competiciones", FS5controller::servirCompeticiones);
        app.get("/competicionesIndex", FS5controller::servirCompeticionesIndex);
        app.get("/equipos", FS5controller::servirEquipos);
        app.get("/equiposIndex", FS5controller::servirEquiposIndex);
        app.get("/tablaEquipos", FS5controller::servirTablaEquipos);
        // ZONA ADMINISTRADOR
        app.post("/gestion", UsersController::login);
        app.get("/gestionTorneos", FS5controller::servirGestionTorneos);
        app.get("/gestionEquipos", FS5controller::servirGestionEquipos);
        app.get("/gestionJugadores", FS5controller::servirGestionJugadores);
        app.get("/crearTorneo", FS5controller::servirCrearTorneo);





    }



}