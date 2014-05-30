package util;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Pokemon;

public class DBRequest extends DBConnection{

    public static List<Pokemon> getAll(){

        List<Pokemon> p = new ArrayList<Pokemon>();
        String q = "SELECT * FROM Pokemon ORDER BY numero";

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

    public static List<Pokemon> find(String criterio){

        List<Pokemon> p = new ArrayList<Pokemon>();
        String q = "SELECT * FROM Pokemon where nombre = 'criterio' OR numero = 'criterio' OR descripcion = 'criterio' ORDER BY number";

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
