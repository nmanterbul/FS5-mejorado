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
        app.get("/tablaGoleadores/{id}",FS5controller::servirTablaGoleadores);
        app.get("/equipo/{id}",FS5controller::servirEquipo);

        app.before("/admin/*", FS5controller::admin);

        //ZONA DE ADMINISTRADOR
        app.get("/admin/gestion", FS5controller::servirGestion);
        app.post("/admin/gestion", UsersController::login);
        app.get("/admin/gestionTorneos", FS5controller::servirGestionTorneos);
        app.get("/admin/gestionEquipos", FS5controller::servirGestionEquipos);
        app.get("/admin/gestionJugadores", FS5controller::servirGestionJugadores);
        // TORNEOS
            // CREAR TORNEO
            app.get("/admin/listaTorneos", FS5controller::servirTorneos);
            app.get("/admin/crearTorneo", FS5controller::servirCrearTorneo);
            app.post("/admin/crearTorneo", FS5controller::crearTorneo);
            // AÑADIR EQUIPO AL TORNEO
            app.get("/admin/anadirEquipo/{id}",FS5controller::servirAnadirEquipo);
            app.post("/admin/anadirEquipo/{id}",FS5controller::anadirEquipo);
            // ELIMINAR EQUIPO DE TORNEO
            app.get("/admin/eliminarEquipo/{id}",FS5controller::servirEliminarEquipo);
            app.post("/admin/eliminarEquipo/{id}",FS5controller::eliminarEquipo);
            // EDITAR TORNEO
            app.get("/admin/listaEditaTorneo",FS5controller::servirEditarTorneos);
            app.get("/admin/editarTorneo/{id}", FS5controller::servirEditarTorneo);
            app.post("/admin/editarTorneo/{id}", FS5controller::editarTorneo);
            // BORRA TORNEOS
            app.get("/admin/borrarTorneo", FS5controller::servirBorrarTorneo);
            app.post("/admin/borrarTorneo", FS5controller::borrarTorneo);
        // EQUIPOS
            // CREAR EQUIPO
            app.get("/admin/crearEquipo/{id}", FS5controller::servirCrearEquipo);
            app.post("admin/crearEquipo/{id}",FS5controller::crearEquipo);
            // EDITAR EQUIPOS
            app.get("/admin/listaEditaEquipos/{id}", FS5controller::elegirEditarEquipo);
            app.get("/admin/editarEquipo/{id}", FS5controller::servirEditarEquipo);
            app.post("/admin/editarEquipo/{id}", FS5controller::editarEquipo);
            // BORRAR
            app.get("/admin/borrarEquipo/{id}", FS5controller::servirBorrarEquipo);
            app.post("/admin/borrarEquipo/{id}", FS5controller::borrarEquipo);
        // JUGADORES
            app.get("/admin/listarJugadores/{id}",FS5controller::servirJugadores);
            // CREAR JUGADORES
            app.get("/admin/crearJugador/{idTorneo}", FS5controller::servirCrearJugador);
            app.post("/admin/crearJugador/{idTorneo}", FS5controller::crearJugador);
            // EDITAR JUGADORES
            app.get("/admin/listaEditaJugadores/{id}",FS5controller::elegirEditarJugador);
            app.get("/admin/editarJugador/{id}", FS5controller::servirEditarJugador);
            app.post("/admin/editarJugador/{id}", FS5controller::editarJugador);
            // BORRAR JUGADORES
            app.get("/admin/listaBorrarJugadores/{id}",FS5controller::elegirBorrarJugador);
            app.get("/admin/borrarJugador/{id}", FS5controller::servirBorrarJugador);
            app.post("/admin/borrarJugador/{id}", FS5controller::borrarJugador);


    }

}