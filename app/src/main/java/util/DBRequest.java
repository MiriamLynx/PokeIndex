package util;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Pokemon;

/**
 * Created by Tarde on 8/05/14.
 */
public class DBRequest extends DBConnection{

    public static List<Pokemon> getAll(){

        List<Pokemon> p = new ArrayList<Pokemon>();
        String q = "SELECT * FROM Pokemon ORDER BY number";

        try {
            crearConexion();

            ResultSet rs = st.executeQuery( q );
            while (rs.next()) {
                p.add(new Pokemon( rs.getString("nombre"),
                        rs.getString("numero"),rs.getString("descripcion") ) );
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cerrarConexion();
        }
        return p;

    }
}
