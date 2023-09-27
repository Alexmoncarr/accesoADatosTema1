package pruebasMinimas;

import java.sql.*;

public class conexionDB {
    public static void main (String[] args) throws SQLException {
        try {
            String url1 = "jdbc:mysql://localhost:3306/alumnos";

            String user = "root";

            String password = "";

            Connection conn1 = DriverManager.getConnection(url1, user, password);

            if (conn1 != null) {

                System.out.println("Conectado a alumnos");

                // Cambiar el método executeQuery() por executeUpdate()
                int filasAfectadas = conn1.createStatement().executeUpdate("update alumno set edad=20 where nombre='Fabian'");

                System.out.println("Número de filas afectadas: " + filasAfectadas);

            }

        } catch (SQLException ex) {

            System.out.println("ERROR:La dirección no es válida o el usuario y clave"+ ex);

        }
    }

}
