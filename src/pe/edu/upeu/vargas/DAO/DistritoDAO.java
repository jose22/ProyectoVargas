/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.vargas.DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upeu.vargas.config.Conexion;
import pe.edu.upeu.vargas.modelo.Distrito;

/**
 *
 * @author alum.fial7
 */
public class DistritoDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Distrito> lista = null;
    public ArrayList<Distrito> listarDistrito(){
    lista = new ArrayList();
    sql = "SELCECT *FROM distrito";
    try{
       cx = Conexion.getConex();
       st = cx.createStatement();
       rs = st.executeQuery(sql);
       while(rs.next()){
           Distrito d = new Distrito();
           d.setIdd(rs.getInt("iddistrito"));
           d.setIdr(rs.getInt("idregon"));
           d.setDisc(rs.getString("distrito"));
           d.setEstado(rs.getString("iddistrito"));
           lista.add(d);

       }
    }catch (Exception e){
    }
    
    
        
    return lista;  
    }
}
