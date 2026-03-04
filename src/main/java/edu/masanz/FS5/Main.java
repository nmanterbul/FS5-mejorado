package edu.masanz.FS5;

import edu.masanz.FS5.controller.FS5controller;
import edu.masanz.FS5.controller.FiltroController;
import edu.masanz.FS5.controller.UsersController;
import edu.masanz.FS5.database.ConnectionManager;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinFreemarker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("ARRANCANDO APLICACION");
        ConnectionManager.conectar("FS5_DB","proy","password");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);

        app.before("/admin/*", FiltroController::FiltroBefore);


        // PRINCIPAL
        app.get("/", FS5controller::servirIndex);
        // INDEX
        app.get("/login", FS5controller::servirLogin);
        app.get("/competiciones", FS5controller::servirCompeticiones);
        app.get("/competicionesIndex", FS5controller::servirCompeticionesIndex);
        app.get("/equipos", FS5controller::servirEquipos);
        app.get("/equiposIndex", FS5controller::servirEquiposIndex);
        app.get("/tablaEquipos", FS5controller::servirTablaEquipos);

        // Jornadas
        app.get("/tablaJornadas", FS5controller::servirTablaJornadas);

        // ZONA ADMINISTRADOR
        app.post("/gestion", UsersController::login);
        app.get("/gestion", FS5controller::servirGestion);
        app.get("/gestionTorneos", FS5controller::servirGestionTorneos);
        app.get("/gestionEquipos", FS5controller::servirGestionEquipos);
        app.get("/gestionJugadores", FS5controller::servirGestionJugadores);
        // TORNEOS

        app.get("/crearTorneo", FS5controller::servirCrearTorneo);
        app.get("/editarTorneo", FS5controller::servirEditarTorneo);
        app.get("/borrarTorneo", FS5controller::servirBorrarTorneo);
        // EQUIPOS
        app.get("/crearEquipo", FS5controller::servirCrearEquipo);
        app.get("/editarEquipo", FS5controller::servirEditarEquipo);
        app.get("/borrarEquipo", FS5controller::servirBorrarEquipo);
        // JUGADORES
        app.get("/crearJugador", FS5controller::servirCrearJugador);
        app.post("/crearJugador", FS5controller::crearJugador);

        app.get("/editarJugador", FS5controller::servirEditarJugador);

        app.get("/borrarJugador", FS5controller::servirBorrarJugador);


        app.get("/listarJugador", FS5controller::servirListaJugador);







    }



}