/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Orion
 */
public class Socio extends Persona {
    private int CodSocio;
    private String direccion;

    public Socio() {
    }

    public Socio(int CodSocio, String direccion, int rutPersona, String dv, String pNombre, String apPaterno, String apMaterno, int telefono) {
        super(rutPersona, dv, pNombre, apPaterno, apMaterno, telefono);
        this.CodSocio = CodSocio;
        this.direccion = direccion;
    }

    public int getCodSocio() {
        return CodSocio;
    }

    public void setCodSocio(int CodSocio) {
        this.CodSocio = CodSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
