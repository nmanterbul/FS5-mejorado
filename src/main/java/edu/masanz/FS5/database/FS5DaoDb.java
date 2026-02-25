package edu.masanz.FS5.database;


import edu.masanz.FS5.model.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class FS5DaoDb  {

    public FS5DaoDb() {
        ConnectionManager.conectar("FS5_DB", "proy", "password");
    }

//    public int obtenerNumeroNotas() {
//        String sql = "SELECT COUNT(*) FROM notas";
//        Object[] params = {};
//        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
//        if (resultado != null && resultado.length == 1) {
//            int numeroNotas = Integer.parseInt(resultado[0][0].toString());
//            return numeroNotas;
//        }
//        return 0;
//    }

    public List<Usuarios> obtenerUsuarios(int pagina, int notasPorPagina) {
        String sql = "SELECT id,nombre, edad,password , rol,  " +
                     "FROM usuarios ORDER BY id DESC LIMIT ? OFFSET ?";
        Long limite = (long) notasPorPagina;
        Long offset = (long) ((pagina-1)*notasPorPagina);
        Object[] params = {limite, offset};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
        List<Usuarios> usuarios = new ArrayList<>();
        if (resultado != null) {
            for (Object[] fila : resultado) {
                Usuarios usuario = new Usuarios();

                usuario.setId((Integer) fila[0]);
                usuario.setNombre((String) fila[1]);
                usuario.setEdad((Integer) fila[2]);
                usuario.setRol((Integer) fila[3]);


                usuarios.add(usuario);
            }
        }
        return usuarios;
    }
//
    public Usuarios obtenerUsuario(long idUsuario) {
        String sql = "SELECT id, nombre, edad,password, rol " +
                "FROM usuarios WHERE id = ? ORDER BY id DESC LIMIT 1";
        Object[] params = {idUsuario};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
        if (resultado != null && resultado.length == 1) {
            Usuarios usuario = new Usuarios();

            usuario.setId((Integer) resultado[0][0]);
            usuario.setNombre((String) resultado[0][1]);
            usuario.setEdad((Integer) resultado[0][2]);
            usuario.setPassword((String) resultado[0][3]);
            usuario.setRol((Integer) resultado[0][4]);


            return usuario;
        }
        return null;
    }
//
    public Usuarios guardarUsuario(Usuarios usuario) {
        String sql = "INSERT INTO usuarios (id,nombre, edad,password, rol) VALUES (?, ?, ?,?)";
        Object[] params = {usuario.getNombre(), usuario.getEdad(),usuario.getPassword(), usuario.getRol()};
        long id = ConnectionManager.ejecutarInsertSQL(sql, params);
        if (id > 0){
            usuario.setId((int) id);
        }
        return usuario;
    }

    public boolean actualizarUsuario(Usuarios usuario) {
        String sql = "UPDATE usuarios SET nombre = ?, edad = ?, password= ?,rol = ? WHERE id = ?";
        Object[] params = {usuario.getNombre(), usuario.getEdad(),usuario.getPassword(), usuario.getRol(), usuario.getId()};
        ConnectionManager.ejecutarUpdateSQL(sql, params);
        return true;
    }

    public boolean eliminarUsuario(long idUsuario) {
        String sql = "DELETE FROM notas WHERE id = ?";
        Object[] params = {idUsuario};
        ConnectionManager.ejecutarUpdateSQL(sql, params);
        return true;
    }

}
