package edu.masanz.FS5.service;

import edu.masanz.FS5.database.ConnectionManager;
import edu.masanz.FS5.model.Division;

public class DivisionService {


    public static Division obtenerDivision(int idDivision) {
        String select = "SELECT id FROM divisiones WHERE id = ?";
        Object[] params = {idDivision};
        Object[][] result = ConnectionManager.ejecutarSelectSQL(select,params);

        if (result.length > 0){
            Division division = new Division();
            int id = (int) result[0][0];
            String resultDivisionName = (String) result[0][1];
            division.setDivision(id);
            division.setNombre(resultDivisionName);
            return division;
        }
        return null;
    }

}
