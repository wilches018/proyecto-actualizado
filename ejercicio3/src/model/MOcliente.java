/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SENA
 */
public class MOcliente {
 protected int ADid;
 protected String ADnombre ;
 protected String ADapellido;
 protected String ADdireccion;

    public MOcliente(int ADid, String ADnombre, String ADapellido, String ADdireccion) {
        this.ADid = ADid;
        this.ADnombre = ADnombre;
        this.ADapellido = ADapellido;
        this.ADdireccion = ADdireccion;
    }

    public int getADid() {
        return ADid;
    }

    public void setADid(int ADid) {
        this.ADid = ADid;
    }

    public String getADnombre() {
        return ADnombre;
    }

    public void setADnombre(String ADnombre) {
        this.ADnombre = ADnombre;
    }

    public String getADapellido() {
        return ADapellido;
    }

    public void setADapellido(String ADapellido) {
        this.ADapellido = ADapellido;
    }

    public String getADdireccion() {
        return ADdireccion;
    }

    public void setADdireccion(String ADdireccion) {
        this.ADdireccion = ADdireccion;
    }

}
