/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import controller.controladorpersona;
import view.login;
     
/**
 *
 * @author SENA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login view = new login();
        controladorpersona cp = new controladorpersona(view);
        cp.iniciar();

    }
}


             