package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.User;

public class UsersDao {

    public static User login(String username, String password){
        String select = "Select * from usuarios where username like ? and pass like ? ";
        Object[] params = {username, password};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);
        if (result.length == 1){
            User user = new User();
            int id = (int) result[0][0];
            String resultUsername = (String) result[0][1];
            String resultPassword = (String) result[0][2];
            int rol = (int) result[0][3];
            user.setId(id);
            user.setUsername(resultUsername);
            user.setPassword(resultPassword);
            user.setRol(rol);
            return user;
        }
        return null;
    }

    public static void main(String[] args) {


    }

}