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
import modelo.Jugador;

/**
 *
 * @author Orion
 */
public class RegistroJugador {
    public boolean agregar(Jugador jugador) throws Exception
    {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "insert into jugador(nombre en tablas) values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,jugador.getRutPersona());
            stmt.setString(2, jugador.getDv());
            stmt.setString(3, jugador.getpNombre());
            stmt.setString(4, jugador.getApPaterno());
            stmt.setString(5, jugador.getApMaterno());
            stmt.setString(6, jugador.getPosicion());
            stmt.setInt(7, jugador.getTelefono());
            stmt.setDate(8, new java.sql.Date(jugador.getFechNac().getTime()));
            stmt.setInt(9, jugador.getNumGol());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error de SQL al insertar Jugador" + e.getMessage());
            return false;
        }
        
    }
    
    
    public boolean eliminar(int codJugador) throws Exception
    {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();

            String query = "delete from jugador where codJugador = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,codJugador);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error de SQL al eliminar Jugador" + e.getMessage());
            return false;
        }
        
    }
    
    public boolean actualizar(Jugador jugador) throws Exception
    {
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "update jugador set =?,=? ,=?,=?,=?,=?,=?,? where =?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,jugador.getRutPersona());
            stmt.setString(2, jugador.getDv());
            stmt.setString(3, jugador.getpNombre());
            stmt.setString(4, jugador.getApPaterno());
            stmt.setString(5, jugador.getApMaterno());
            stmt.setString(6, jugador.getPosicion());
            stmt.setInt(7, jugador.getTelefono());
            stmt.setDate(8, new java.sql.Date(jugador.getFechNac().getTime()));
            stmt.setInt(9, jugador.getNumGol());
         
            stmt.setInt(10,jugador.getCodJugador());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error de SQL al actualizar Jugador" + e.getMessage());
            return false;
        }
        
    }
    
    public Jugador buscarPorId(int codJugador) throws Exception
    {
        Jugador jugador = new Jugador();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "Select * from jugador where codjugador = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setInt(1,codJugador);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                jugador.setCodJugador(rs.getInt("codjugador"));
                jugador.setRutPersona(rs.getInt("rutjugador"));
                jugador.setDv(rs.getString("dv"));
                jugador.setpNombre(rs.getString("pnombre"));
                jugador.setApPaterno(rs.getString("appaterno"));
                jugador.setApMaterno(rs.getString("apmaterno"));
                jugador.setPosicion(rs.getString("posicion"));
                jugador.setTelefono(rs.getInt("telefono"));
                jugador.setFechNac(rs.getDate("fechanacimiento"));
                jugador.setNumGol(rs.getInt("numerogoles"));
               
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error de SQL al listar por Codigo Jugador" + e.getMessage());
            
        }
         return jugador;
    }
    
    public ArrayList<Jugador> buscarTodos() throws Exception
    {
        ArrayList<Jugador> lista = new ArrayList<>();
        
         try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "Select * from jugador order by pnombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
                        
            ResultSet rs = stmt.executeQuery();
            
             while (rs.next()) {
                Jugador jugador = new Jugador();
                jugador.setCodJugador(rs.getInt("codjugador"));
                jugador.setRutPersona(rs.getInt("rutjugador"));
                jugador.setDv(rs.getString("dv"));
                jugador.setpNombre(rs.getString("pnombre"));
                jugador.setApPaterno(rs.getString("appaterno"));
                jugador.setApMaterno(rs.getString("apmaterno"));
                jugador.setPosicion(rs.getString("posicion"));
                jugador.setTelefono(rs.getInt("telefono"));
                jugador.setFechNac(rs.getDate("fechanacimiento"));
                jugador.setNumGol(rs.getInt("numerogoles"));
                 
                lista.add(jugador);
                }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error de SQL al listar todos los Jugadores" + e.getMessage());
            
        }
         return lista;
    }
}
