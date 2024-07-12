package ar.com.codoacodo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
    

    //Conectar a la Base de Datos
    /**
     * @return
     */
    public static Connection conectar(){
        String url = "jdbc:mysql://localhost:3306/ivyland-24101-grupo3?serverTimeZone=UTC&userSSL=false";
        String user = "root";
        String pass = "root";
        String driver = "com.mysql.cj.jdbc.Driver";

        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion OK");
        } catch (Exception e) {
            
            System.err.println(e);
        }
        return con;
    }
    
    /*
    public static void main(String[] args) {
        //junit!: tph
        AdministradorDeConexiones.conectar();
    }
     */

    //Desconectar a la Base de Datos
    public static void desconectar(Connection con){
        try {
            con.close();
        } catch (Exception e) {
            
            System.err.println(e);
        }
    }






}
