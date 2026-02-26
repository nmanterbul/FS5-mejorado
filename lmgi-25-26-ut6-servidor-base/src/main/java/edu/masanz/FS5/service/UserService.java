package edu.masanz.FS5.service;

import edu.masanz.FS5.dao.UsersDao;
import edu.masanz.FS5.model.User;

public class UserService {

    public static User login(String username, String password) {

        return UsersDao.login(username,password);
    }


}
