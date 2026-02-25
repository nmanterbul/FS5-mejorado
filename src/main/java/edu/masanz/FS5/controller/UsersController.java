package edu.masanz.FS5.controller;

import edu.masanz.FS5.model.User;
import edu.masanz.FS5.service.UsersService;
import io.javalin.http.Context;

public class UsersController {

    public static void login(Context context){

        String username = context.pathParam("username");
        String password = context.pathParam("password");

        User user = UsersService.login(username,password);

        if (user!=null){

        }

    }

}
