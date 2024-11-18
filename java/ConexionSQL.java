import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    public static Connection conectar() {
        Connection conexion = null;
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String usuario = "root";
            String contrasena = "123456";
            
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa!");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
    
    public static void main(String[] args) {   
        conectar(); 
    }
}
