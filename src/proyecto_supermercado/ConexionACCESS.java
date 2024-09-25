package proyecto_supermercado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionACCESS {
    
    private static final String DATABASE_URL = "jdbc:ucanaccess://C:\\Users\\Javie\\Supermercado_PrograI/Supermercado_Proyecto_ProgramacionI.accdb";
 
    static {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
 
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL);
    }

  }
