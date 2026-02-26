package edu.masanz.FS5.dao;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Usuarios;

public class UsersDao {

    public static Usuarios login(String username, String password){
        String select = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ? ";
        Object[] params = {username, password};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select, params);

        if (result.length > 0){
            Usuarios user = new Usuarios();
            int id = (int) result[0][0];
            String resultUsername = (String) result[0][1];
            String resultpassword = (String) result[0][2];
            int rol = (int) result[0][3];
            user.setId(id);
            user.setNombre(resultUsername);
            user.setPassword(resultpassword);
            user.setRol(rol);
            return user;
        }
        return null;
    }
}
