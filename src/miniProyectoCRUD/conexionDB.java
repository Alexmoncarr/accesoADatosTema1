package miniProyectoCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
    private static final String url="jdbc:mysql://localhost:3306/alumnos";
    private static final String user="root";
    private static final String password="";
    public static Connection conecction(){
        Connection connection= null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex){
            System.out.println("Ha ocurrido un error: "+ex);
        }
        return connection;

    }
}
