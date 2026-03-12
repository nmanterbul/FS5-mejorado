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
        app.get("/tablaJornadas/{idTorneo}/{idJornada}",FS5controller::servirTablaJornadas);
        app.get("/tablaClasificacion/{id}",FS5controller::servirTablaClasificacion);
        app.get("/equipo/{id}",FS5controller::servirEquipo);

        app.before("/admin/*", FS5controller::admin);

        //ZONA DE ADMINISTRADOR
        app.post("/gestion", UsersController::login);
        app.get("/gestionTorneos", FS5controller::servirGestionTorneos);
        app.get("/gestionEquipos", FS5controller::servirGestionEquipos);
        app.get("/gestionJugadores", FS5controller::servirGestionJugadores);
        // TORNEOS
        app.get("/listaTorneos", FS5controller::servirTorneos);
        app.get("/crearTorneo", FS5controller::servirCrearTorneo);
        app.post("/crearTorneo", FS5controller::CrearTorneo);

        app.get("/anadirEquipo/{id}",FS5controller::servirAnadirEquipo);
        app.post("/anadirEquipo/{id}",FS5controller::anadirEquipo);

        app.get("/eliminarEquipo/{id}",FS5controller::servirEliminarEquipo);
        app.post("/eliminarEquipo/{id}",FS5controller::eliminarEquipo);

        app.get("/editarTorneo/{id}", FS5controller::servirEditarTorneo);
        app.post("/editarTorneo/{id}", FS5controller::editarTorneo);

        app.get("/borrarTorneo", FS5controller::servirBorrarTorneo);
        // EQUIPOS
        app.get("/crearEquipo", FS5controller::servirCrearEquipo);

        // EDITAR EQUIPOS
        app.get("/listaEditaEquipos/{id}", FS5controller::elegirEditarEquipo);
        app.get("/editarEquipo/{id}", FS5controller::servirEditarEquipo);
        app.post("/editarEquipo/{id}", FS5controller::editarEquipo);

        app.get("/borrarEquipo", FS5controller::servirBorrarEquipo);
        // JUGADORES
        app.get("/listarJugadores/{id}",FS5controller::servirJugadores);
        // CREAR JUGADORES
        app.get("/crearJugador", FS5controller::servirCrearJugador);
        app.post("/crearJugador", FS5controller::crearJugador);
        // EDITAR JUGADORES
        app.get("/listaEditaJugadores/{id}",FS5controller::elegirEditarJugador);
        app.get("/editarJugador/{id}", FS5controller::servirEditarJugador);
        app.post("/editarJugador/{id}", FS5controller::editarJugador);
        // BORRAR JUGADORES
        app.get("/listaBorrarJugadores/{id}",FS5controller::elegirBorrarJugador);
        app.get("/borrarJugador/{id}", FS5controller::servirBorrarJugador);
        app.post("/borrarJugador/{id}", FS5controller::borrarJugador);


    }

}