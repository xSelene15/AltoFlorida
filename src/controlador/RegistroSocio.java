/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Socio;

/**
 *
 * @author Orion
 */
public class RegistroSocio {
        public boolean agregar(Socio socio) throws Exception
    {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "insert into Socio(nombre en tablas) values(?,?,?,?,?,?,?,)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,socio.getRutPersona());
            stmt.setString(2, socio.getDv());
            stmt.setString(3, socio.getpNombre());
            stmt.setString(4, socio.getApMaterno());
            stmt.setString(5, socio.getApPaterno());
            stmt.setInt(6, socio.getTelefono());
            stmt.setString(5, socio.getDireccion());

            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error de SQL al insertar Socio" + e.getMessage());
            return false;
        }
        
    }
    
    
    public boolean eliminar(int codSocio) throws Exception
    {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();

            String query = "delete from socio where codsocio = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,codSocio);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error de SQL al eliminar Socio" + e.getMessage());
            return false;
        }
        
    }
    
    public boolean actualizar(Socio socio) throws Exception
    {
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "update socio set =?,=? ,=?,=?,=?,=?,=? where =?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,socio.getRutPersona());
            stmt.setString(2, socio.getDv());
            stmt.setString(3, socio.getpNombre());
            stmt.setString(4, socio.getApMaterno());
            stmt.setString(5, socio.getApPaterno());
            stmt.setInt(6, socio.getTelefono());
            stmt.setString(7, socio.getDireccion());
         
            stmt.setInt(8,socio.getCodSocio());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error de SQL al actualizar Socio" + e.getMessage());
            return false;
        }
        
    }
    
    public Socio buscarPorId(int codSocio) throws Exception
    {
        Socio socio = new Socio();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "Select * from socio where codjugador = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setInt(1,codSocio);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                socio.setCodSocio(rs.getInt("codsocio"));
                socio.setRutPersona(rs.getInt("rutsocio"));
                socio.setDv(rs.getString("dv"));
                socio.setpNombre(rs.getString("pnombre"));
                socio.setApPaterno(rs.getString("appaterno"));
                socio.setApMaterno(rs.getString("apmaterno"));
                socio.setDireccion(rs.getString("direccion"));
               
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error de SQL al listar por Codigo Socio" + e.getMessage());
            
        }
         return socio;
    }
    
    public ArrayList<Socio> buscarTodos() throws Exception
    {
        ArrayList<Socio> lista = new ArrayList<>();
        
         try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "Select * from socio order by pnombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
                        
            ResultSet rs = stmt.executeQuery();
            
             while (rs.next()) {
                Socio socio = new Socio();
                socio.setCodSocio(rs.getInt("codsocio"));
                socio.setRutPersona(rs.getInt("rutsocio"));
                socio.setDv(rs.getString("dv"));
                socio.setpNombre(rs.getString("pnombre"));
                socio.setApPaterno(rs.getString("appaterno"));
                socio.setApMaterno(rs.getString("apmaterno"));
                socio.setDireccion(rs.getString("direccion"));
                 
                lista.add(socio);
                }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error de SQL al listar todos los Socios" + e.getMessage());
            
        }
         return lista;
    }
}

