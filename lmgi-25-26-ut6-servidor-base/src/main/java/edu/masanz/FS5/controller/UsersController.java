package edu.masanz.FS5.controller;

import edu.masanz.FS5.model.User;
import edu.masanz.FS5.service.UserService;
import io.javalin.http.Context;

import java.util.HashMap;
import java.util.Map;

public class UsersController {


    public static void login(Context context){
        Map<String, Object> model = new HashMap<>();
        model.put("username", "username");
        model.put("pass", "pass");
        String username = context.formParam("username");
        String password = context.formParam("pass");

        User user = UserService.login(username,password);
        if (user != null){
            context.render("templates/inventario/gestion.ftl", model);
        }else{
            context.render("templates/inventario/error.ftl", model);
        }

    }
}
