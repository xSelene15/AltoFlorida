/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Orion
 */
public class Jugador extends Persona {
    private int codJugador; 
    private String posicion;
    private Date fechNac;
    private int numGol;

    public Jugador() {
    }

    public Jugador(int codJugador, String posicion, Date fechNac, int numGol, int rutPersona, String dv, String pNombre, String apPaterno, String apMaterno, int telefono) {
        super(rutPersona, dv, pNombre, apPaterno, apMaterno, telefono);
        this.codJugador = codJugador;
        this.posicion = posicion;
        this.fechNac = fechNac;
        this.numGol = numGol;
    }

    public int getCodJugador() {
        return codJugador;
    }

    public void setCodJugador(int codJugador) {
        this.codJugador = codJugador;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public int getNumGol() {
        return numGol;
    }

    public void setNumGol(int numGol) {
        this.numGol = numGol;
    }

  
}
