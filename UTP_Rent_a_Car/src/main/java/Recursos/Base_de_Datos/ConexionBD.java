package Recursos.Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/dbrent_a_car";
    private static final String USER = "root";
    private static final String PASSWORD = "administrador";

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa a la base de datos.");
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Error al conectar con la base de datos.");
            }
        }
        return connection;
    }
}
