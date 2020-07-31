import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd_ejemplo";
    private static final String USUARIO = "root";
    private static final String CLAVE = "1234";

    public conexion conectar() {
        conexion conexion = null;
        
        try {
            Class.forName(CONTROLADOR);
            conexion = (conexion) DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexión OK");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
        
        return conexion;
    }

    public static void main(String[] args) {

    }
}

