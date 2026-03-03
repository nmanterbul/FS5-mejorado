package edu.masanz.FS5;

import edu.masanz.FS5.controller.FS5controller;
import edu.masanz.FS5.controller.UsersController;
import edu.masanz.FS5.database.ConnectionManager;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinFreemarker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.info("ARRANCANDO APLICACION");
        ConnectionManager.conectar("FS5_DB","proy","password");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);

        //PRINCIPAL
        app.get("/", FS5controller::ejemplo);
        //INDEX
        app.get("/login", FS5controller::servirLogin);
        app.get("/competicionesIndex",FS5controller::servirCompeticionesIndex);
        app.get("/equiposIndex",FS5controller::servirEquiposIndex);
        app.get("/tablaEquipos/{id}", FS5controller::servirTablaEquipos);

        app.before("/admin/*", FS5controller::admin);

        //ZONA DE ADMINISTRADOR
        app.post("/gestion", UsersController::login);
        app.get("/gestionTorneos", FS5controller::servirGestionTorneos);
        app.get("/gestionEquipos", FS5controller::servirGestionEquipos);
        app.get("/gestionJugadores", FS5controller::servirGestionJugadores);
        // TORNEOS
        app.get("/crearTorneo", FS5controller::servirCrearTorneo);
        app.post("/crearTorneo", FS5controller::CrearTorneo);
        app.get("/editarTorneo", FS5controller::servirEditarTorneo);
        app.get("/borrarTorneo", FS5controller::servirBorrarTorneo);
        // EQUIPOS
        app.get("/crearEquipo", FS5controller::servirCrearEquipo);
        app.get("/editarEquipo", FS5controller::servirEditarEquipo);
        app.get("/borrarEquipo", FS5controller::servirBorrarEquipo);
        // JUGADORES
        app.get("/crearJugador", FS5controller::servirCrearJugador);
        app.post("/crearJugador", FS5controller::CrearJugador);
        app.get("/editarJugador", FS5controller::servirEditarJugador);
        app.post("/editarJugador", FS5controller::EditarJugador);
        app.get("/borrarJugador", FS5controller::servirBorrarJugador);
        app.post("/borrarJugador", FS5controller::BorrarJugador);
    }

}