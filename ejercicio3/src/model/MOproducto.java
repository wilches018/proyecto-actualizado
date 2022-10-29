/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SENA
 */
public class MOproducto {

    protected int PRid;
    protected String PRnombre;
    protected String PRprecio;
    protected int PRcategoria;

    public MOproducto(int PRid, String PRnombre, String PRprecio, int PRcategoria) {
        this.PRid = PRid;
        this.PRnombre = PRnombre;
        this.PRprecio = PRprecio;
        this.PRcategoria = PRcategoria;
    }

    public int getPRid() {
        return PRid;
    }

    public void setPRid(int PRid) {
        this.PRid = PRid;
    }

    public String getPRnombre() {
        return PRnombre;
    }

    public void setPRnombre(String PRnombre) {
        this.PRnombre = PRnombre;
    }

    public String getPRprecio() {
        return PRprecio;
    }

    public void setPRprecio(String PRprecio) {
        this.PRprecio = PRprecio;
    }

    public int getPRcategoria() {
        return PRcategoria;
    }

    public void setPRcategoria(int PRcategoria) {
        this.PRcategoria = PRcategoria;
    }

}
