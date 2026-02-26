package edu.masanz.FS5;


import edu.masanz.FS5.controller.FS5controller;
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
        ConnectionManager.conectar("FS5_DB", "root", "root");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public_css");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);



        // PRINCIPAL
        app.get("/", FS5controller::index);
        app.get("/login", FS5controller::login);
        app.get("/gestion", FS5controller::gestion);
        app.get("/opcionesgestion", FS5controller::opcionesGestion);
        app.get("/opcionesequipo", FS5controller::opcionesEquipo);





    }




}