package edu.masanz.FS5;

import edu.masanz.FS5.controller.UsersController;
import edu.masanz.FS5.database.ConnectionManager;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.rendering.template.JavalinFreemarker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import edu.masanz.FS5.controller.FS5controller;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.info("ARRANCANDO APLICACION");
        ConnectionManager.conectar("FS5_DB","root","roo7");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);

        //PRINCIPAL
        app.get("/", Main::ejemplo);
        //INDEX
        app.get("/login", FS5controller::servirLogin);
        app.get("/competicionesIndex",FS5controller::servirCompeticionesIndex);
        app.get("/equiposIndex",FS5controller::servirEquiposIndex);
        //ZONA DE ADMINISTRADOR
        app.post("/gestion", UsersController::login);



    }

    private static void ejemplo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/index.ftl",model);


    }

}