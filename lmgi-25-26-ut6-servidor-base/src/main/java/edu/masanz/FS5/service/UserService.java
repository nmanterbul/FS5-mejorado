package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.UsersDao;
import edu.masanz.FS5.model.User;

public class UserService {

    private static final UsersDao user = new UsersDao();

    public static User login(String username, String password) {

        return user.login(username,password);
    }


}
