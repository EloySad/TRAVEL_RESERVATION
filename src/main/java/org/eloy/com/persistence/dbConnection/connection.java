package org.eloy.com.persistence.dbConnection;

import java.sql.DriverManager;

public class connection {

    public static java.sql.Connection connection = null;

    //Open connection

    public static  java.sql.Connection conect(){
        //Create variables for connection "jdbc:mysql://host:port/nombre";

        String URL = "mysql://benvgy4t6ftxpyevx9x6-mysql.services.clever-cloud.com:3306/benvgy4t6ftxpyevx9x6";
        String user = "uuimssgubtamwc65";
        String password = "JqcUtSNVFM6tI8qdr3Cx";

        //Conect using the driver manager and save the null variable

        try {
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connexion exitosa");
        } catch (Exception e){
            System.out.println("No fue posible establecer conexion con la base de datos" +e.getMessage());
        }
        return connection;
    }

    //Close connection

    public static void close(){
        if (connection != null){

            //Try close connection

            try {
                System.out.println("Conexión finalizada");
                connection.close();
            }catch (Exception e){
                System.out.println("No se pudo finalizar la conexión" +e.getMessage());
            }

        }
    }

}
