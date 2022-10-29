/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SENA
 */
public class MOvendedor {
    protected  int VEid ;
    protected String VEnombre;
    protected String VEapellido;

    public MOvendedor(int VEid, String VEnombre, String VEapellido) {
        this.VEid = VEid;
        this.VEnombre = VEnombre;
        this.VEapellido = VEapellido;
    }

    public int getVEid() {
        return VEid;
    }

    public void setVEid(int VEid) {
        this.VEid = VEid;
    }

    public String getVEnombre() {
        return VEnombre;
    }

    public void setVEnombre(String VEnombre) {
        this.VEnombre = VEnombre;
    }

    public String getVEapellido() {
        return VEapellido;
    }

    public void setVEapellido(String VEapellido) {
        this.VEapellido = VEapellido;
    }
}
