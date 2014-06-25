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
import pe.edu.upeu.vargas.modelo.Tipoiglesia;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Tipoiglesia> lista = null;
    public ArrayList<Tipoiglesia> listarTipoIglesia(){
    lista = new ArrayList();
    sql = "SELCECT *FROM tipo_iglesia";
    try{
       cx = Conexion.getConex();
       st = cx.createStatement();
       rs = st.executeQuery(sql);
       while(rs.next()){
           Tipoiglesia ti = new Tipoiglesia();
           ti.setIdti(rs.getInt("idtipo_iglesia"));
           ti.setNomtipo(rs.getString("tipo_iglesia"));
           lista.add(ti);

       }
    }catch (Exception e){
    }
    
    
        
    return lista;  
    }
    
}
