package com.utp.rent_car.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String URL="jdbc:mysql://localhost:3306/dbrent_a_car";
    private static String USER="root";
    private static String PASSWORD="root";

    public static Connection connection;

    public static Connection getConnection(){
        if(connection==null){
            try {
                connection = DriverManager.getConnection(URL,USER,PASSWORD);
                System.out.println("Conexión exitosa a la base de datos.");
            }catch (SQLException e){
                e.printStackTrace();
                throw new RuntimeException("Error al conectar con la base de datos");
            }
        }

        return connection;
    }

    public static void main(String[] args) {
        DBConnection.getConnection();
    }


}
