/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

/*https://www.youtube.com/watch?v=LkxXfECkHwo&t=111s*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class ConexionBD {
    private final String URL = "jdbc:oracle:thin:@//oracle0.ugr.es:1521/practbd.oracle0.ugr.es";
    private final String USER = "x4495491";
    private final String PASWORD = "arturoddsi";
    
    public Connection conex;

    public ConexionBD() {
         this.conex = null;
    }

    public Connection conectar() {
        try {
            this.conex = DriverManager.getConnection(URL, USER, PASWORD);
            conex.setAutoCommit(false); //Se pone para que se eliminen los auto commit y se puedan ejecutar las sentencias cuando nosotros decidamos poner un commit
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.conex;

    }

    public void desconectar() {
        try {
            this.conex.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
