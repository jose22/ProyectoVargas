/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.vargas.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial7
 */
public class Conexion {
    private static Connection conex = null;
    private static final String url = "jdbc:mysql://localhost/bd_visitas";
    private static final String usuario = "root";
    private static final String clave ="root";
    
    public static Connection getConex(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
        }
        
            return conex;
    }
 }


    
    

