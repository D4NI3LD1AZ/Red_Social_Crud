package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //atributos
    private static final String  bbdd="jdbc:mysql://localhost:3306/RedesSociales";
    private static final String  user="root";
    private static final String  password="";
    private static Connection  con;

    public static Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(bbdd, user, password);
            System.out.println("Conexion exitosa");

        } catch (Exception e){
            System.out.println("Error en la base de datos");
        }
        return con;
    }
    //prueba
    public static void main(String[] args) {
        Conexion.conectar();
    }
}
