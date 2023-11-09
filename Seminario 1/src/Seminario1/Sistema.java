package Seminario1;

import ConexionSQL.ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import GUI.Interfaz;

public class Sistema {

    public static void main(String[] args) {
        String sSQL = "";
        ConexionBD conexion = new ConexionSQL.ConexionBD();

        try{
            sSQL = "SELECT * FROM PEDIDO";
            Connection con = conexion.conectar();
            Statement cn = con.createStatement();
            ResultSet res = cn.executeQuery(sSQL);

            while(res.next()){
                System.out.println(res.getInt("CPEDIDO"));
                System.out.println(res.getInt("CCLIENTE"));
                System.out.println(res.getString("FECHA_PEDIDO"));
            }

        } catch (SQLException e){
            System.out.println(e);
        }
        
        Interfaz interfaz = new Interfaz();

    
    }
    
}
