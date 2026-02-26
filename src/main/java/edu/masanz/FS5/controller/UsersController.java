package edu.masanz.FS5.controller;

import edu.masanz.FS5.Service.UserService;
import edu.masanz.FS5.model.Usuarios;
import org.jetbrains.annotations.NotNull;

import javax.naming.Context;
import java.util.HashMap;
import java.util.Map;

public class UsersController {


    private static final UserService UserService = new UserService();




    public static void login(@NotNull io.javalin.http.Context context) {

        Map<String, Object> model = new HashMap<>();
        model.put("username", "username");
        model.put("password", "password");
        String username = context.formParam("username");
        String password = context.formParam("password");

        Usuarios user = UserService.login(username,password);

        if (user != null){
            context.render("templates/gestion.ftl", model);
        }else{
            context.render("templates/login.ftl", model);
        }

    }

}
