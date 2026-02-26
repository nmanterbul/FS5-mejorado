package edu.masanz.FS5.Service;

import edu.masanz.FS5.dao.UsersDao;
import edu.masanz.FS5.model.Usuarios;

public class UserService {


    private static final UsersDao user = new UsersDao();

    public static Usuarios login(String username, String password) {

        return user.login(username,password);
    }
}
