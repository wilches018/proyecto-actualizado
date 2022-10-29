/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SENA
 */
public class MOlogin {
    protected String LOusuario;
    protected int LOcontraseña;

    public MOlogin(String LOusuario, int LOcontraseña) {
        this.LOusuario = LOusuario;
        this.LOcontraseña = LOcontraseña;
    }

    public String getLOusuario() {
        return LOusuario;
    }

    public void setLOusuario(String LOusuario) {
        this.LOusuario = LOusuario;
    }

    public int getLOcontraseña() {
        return LOcontraseña;
    }

    public void setLOcontraseña(int LOcontraseña) {
        this.LOcontraseña = LOcontraseña;
    }
    
}
