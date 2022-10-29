/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.MOcliente;
import model.MOproducto;
import model.MOvendedor;
import view.admin;
import view.cliente;
import view.login;
import view.producto;
import view.vendedor;
import view.Cliente1;
import view.Producto1;
import view.Vendedor1;

/**
 *
 * @author SENA
 */
public class controladorpersona implements ActionListener {

//sobrenombres
    login log;
    admin admi = new admin();
    Cliente1 xxx = new Cliente1();
    cliente cl = new cliente();

    producto produc = new producto();
    Producto1 produsct1 = new Producto1();
    Vendedor1 vende1 = new Vendedor1();
    vendedor ven = new vendedor();

// listas
    ArrayList<MOcliente> listpersonas = new ArrayList<MOcliente>();
    ArrayList<MOvendedor> listvendedor = new ArrayList<MOvendedor>();
    ArrayList<MOproducto> listproducto = new ArrayList<MOproducto>();

// categorias 
    private String user = null;
    private String pass = null;

    private int ADid;
    private String ADnombre;
    private String ADapellido;
    private String ADdireccion;

    private int VEid;
    private String VEnombre;
    private String VEapellido;

    private int PRid;
    private String PRnombre;
    private String PRprecio;
    private int PRcategoria;

    // botones 
    public controladorpersona(login log) {

        this.log = log;
        this.log.Ingresar.addActionListener(this);
        this.admi.vercliente.addActionListener(this);
        this.admi.vervendedor.addActionListener(this);
        this.admi.verproducto.addActionListener(this);
        this.vende1.VEnuevo_guardar.addActionListener(this);
        this.vende1.VEinicio.addActionListener(this);
        this.produsct1.PRnuevo_guardar.addActionListener(this);
        this.produsct1.PRinicio.addActionListener(this);
        this.xxx.NUguardar.addActionListener(this);
        this.xxx.NUinicio.addActionListener(this);
        this.xxx.NUsalir.addActionListener(this);
        this.vende1.VEnuevobotondesalir.addActionListener(this);
        this.produsct1.PRnuevobotondesalir.addActionListener(this);
        this.ven.VEback.addActionListener(this);
        this.cl.CLback.addActionListener(this);
        this.cl.CLguardar.addActionListener(this);
        this.produc.PRguardar.addActionListener(this);
        this.ven.VEguardar.addActionListener(this);
        this.produsct1.PRborrarnuevo.addActionListener(this);
        this.xxx.CLnuevaborra.addActionListener(this);
        this.vende1.VEborrarnuevo.addActionListener(this);
        this.cl.borrar.addActionListener(this);
        this.ven.borrarVE.addActionListener(this);
        this.produc.borrarPR.addActionListener(this);
    }
// vistas

    public void iniciar() {

        this.log.setVisible(true);
        this.admi.vercliente.setVisible(true);
        this.log.setLocationRelativeTo(null);
        this.admi.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.log.Ingresar) {

            user = this.log.LOusuario.getText();
            pass = this.log.LOcontraseña.getText();

            boolean ff = false;

            if (user.equals("admin") && pass.equals("123")) {
                admi.setVisible(true);
                ff = true;
                this.log.LOusuario.setText("");
                this.log.LOcontraseña.setText("");

            }

            if (user.equals("cliente") && pass.equals("456")) {
                cl.setVisible(true);
                ff = true;
                this.log.LOusuario.setText("");
                this.log.LOcontraseña.setText("");

            }

            if (user.equals("vendedor") && pass.equals("789")) {
                ven.setVisible(true);
                ff = true;
                this.log.LOusuario.setText("");
                this.log.LOcontraseña.setText("");
            }

            if (ff == false) {
                JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO");
            }

        }
// para que el cuadrito salga dentro del panel
        if (admi.vercliente == e.getSource()) {
            this.admi.xdd.add(xxx);
            xxx.show();
        }
        if (admi.vervendedor == e.getSource()) {
            this.admi.xdd.add(vende1);
            vende1.show();
        }
        if (admi.verproducto == e.getSource()) {
            this.admi.xdd.add(produsct1);
            produsct1.show();
        }
        // botton de ir al inicio
        if (e.getSource() == this.vende1.VEinicio) {
            log.setVisible(true);
            vende1.show();
            admi.dispose();

        }

        if (e.getSource() == this.xxx.NUinicio) {
            log.setVisible(true);
            xxx.show();
            admi.dispose();

        }
        if (e.getSource() == this.produsct1.PRinicio) {
            log.setVisible(true);
            produsct1.show();
            admi.dispose();

        }
        // botton para ir atras
        if (e.getSource() == this.vende1.VEnuevobotondesalir) {
            admi.setVisible(true);
            vende1.dispose();

        }
        if (e.getSource() == this.ven.VEback) {
            log.setVisible(true);
            ven.dispose();

        }
        if (e.getSource() == this.xxx.NUsalir) {
            admi.setVisible(true);
            xxx.dispose();

        }
        if (e.getSource() == this.cl.CLback) {
            log.setVisible(true);
            cl.dispose();

        }
        if (e.getSource() == this.produsct1.PRnuevobotondesalir) {
            admi.setVisible(true);
            produsct1.dispose();

        }
        if (e.getSource() == this.produc.PRback) {
            admi.setVisible(true);
            produc.dispose();

        }
        if (e.getSource() == this.log.Ingresar) {
            log.setVisible(true);
            log.dispose();
        }
        // botonde borrar 
        if (e.getSource() == this.xxx.CLnuevaborra) {
            JOptionPane.showMessageDialog(null, "LOS DATOS AN SIDO BORRADO CORRECTAMENTE");
            limpiar_tabla_cliente(this.xxx.nueva_tabla_de_cliente, listpersonas);

        }
        if (e.getSource() == this.produsct1.PRborrarnuevo) {
            JOptionPane.showMessageDialog(null, "LOS DATOS AN SIDO BORRADO CORRECTAMENTE");
            limpiar_tabla_producto1(this.produsct1.nueva_tabla_de_producto, listproducto);

        }
        if (e.getSource() == this.vende1.VEborrarnuevo) {
            JOptionPane.showMessageDialog(null, "LOS DATOS AN SIDO BORRADO CORRECTAMENTE");
            limpiar_tabla_vendedor1(this.vende1.VEnueva_tabla_de_vendedor, listvendedor);

        }
        if (e.getSource() == this.cl.borrar) {
            JOptionPane.showMessageDialog(null, "LOS DATOS AN SIDO BORRADO CORRECTAMENTE");
            limpiar_tabla_cl(this.cl.CLtabla, listpersonas);

        }
        if (e.getSource() == this.produc.borrarPR) {
            JOptionPane.showMessageDialog(null, "LOS DATOS AN SIDO BORRADO CORRECTAMENTE");
            limpiar_tabla_product(this.produc.PRtabla, listproducto);

        }
        if (e.getSource() == this.ven.borrarVE) {
            JOptionPane.showMessageDialog(null, "LOS DATOS AN SIDO BORRADO CORRECTAMENTE");
            limpiar_tabla_vendedor(this.ven.VEtabla, listvendedor);
        }
        // botton de guardar en las tablas
        if (this.vende1.VEnuevo_guardar == e.getSource()) {
            VEid = Integer.parseInt(this.vende1.VEnuevo_id.getText());
            VEnombre = this.vende1.VEnuevo_nombre.getText();
            VEapellido = this.vende1.VEnuevo_apellido.getText();

            listvendedor.add(new MOvendedor(VEid, VEnombre, VEapellido));
            tablevendedor(this.vende1.VEnueva_tabla_de_vendedor, listvendedor);
            this.limpiar();
            JOptionPane.showMessageDialog(vende1, "LOS DATOS FUERON GUARDADOS CON EXITOS");

        }
        if (this.ven.VEguardar == e.getSource()) {
            VEid = Integer.parseInt(this.ven.VEid.getText());
            VEnombre = this.ven.VEnombre.getText();
            VEapellido = this.ven.VEapellido.getText();

            listvendedor.add(new MOvendedor(VEid, VEnombre, VEapellido));
            tablevendedor(this.ven.VEtabla, listvendedor);
            this.limpiar();
            JOptionPane.showMessageDialog(ven, "LOS DATOS FUERON GUARDADOS CON EXITOS");

        }
        if (this.xxx.NUguardar == e.getSource()) {
            ADid = Integer.parseInt(this.xxx.NUid.getText());
            ADnombre = this.xxx.NUnombre.getText();
            ADapellido = this.xxx.NUapellido.getText();
            ADdireccion = this.xxx.NUdireccion.getText();

            listpersonas.add(new MOcliente(ADid, ADnombre, ADapellido, ADdireccion));
            this.limpiar();
            tablecliente(this.xxx.nueva_tabla_de_cliente, listpersonas);
            JOptionPane.showMessageDialog(xxx, "LOS DATOS FUERON GUARDADOS CON EXITOS");

        }
        if (this.cl.CLguardar == e.getSource()) {
            ADid = Integer.parseInt(this.cl.CLid.getText());
            ADnombre = this.cl.CLnombre.getText();
            ADapellido = this.cl.CLapellido.getText();
            ADdireccion = this.cl.CLdireccion.getText();

            listpersonas.add(new MOcliente(ADid, ADnombre, ADapellido, ADdireccion));
            this.limpiar();
            tablecliente(this.cl.CLtabla, listpersonas);
            JOptionPane.showMessageDialog(cl, "LOS DATOS FUERON GUARDADOS CON EXITOS");

        }
        if (this.produsct1.PRnuevo_guardar == e.getSource()) {
            PRid = Integer.parseInt(this.produsct1.PRnuevaid.getText());
            PRnombre = this.produsct1.PRnuevo_nombre.getText();
            PRprecio = this.produsct1.PRnuevo_precio.getText();
            PRcategoria = this.produsct1.PRnueva_categoria.getSelectedIndex();

            listproducto.add(new MOproducto(PRid, PRnombre, PRprecio, PRcategoria));
            tableproducto(this.produsct1.nueva_tabla_de_producto, listproducto);
            this.limpiar();
            JOptionPane.showMessageDialog(produsct1, "LOS DATOS FUERON GUARDADOS CON EXITOS");

        }
        if (this.produc.PRguardar == e.getSource()) {
            PRid = Integer.parseInt(this.produc.PRid.getText());
            PRnombre = this.produc.PRnombre.getText();
            PRprecio = this.produc.PRprecio.getText();
            PRcategoria = this.produc.PRcategoria.getSelectedIndex();

            listproducto.add(new MOproducto(PRid, PRnombre, PRprecio, PRcategoria));
            tableproducto(this.produc.PRtabla, listproducto);
            this.limpiar();
            JOptionPane.showMessageDialog(produc, "LOS DATOS FUERON GUARDADOS CON EXITOS");

        }

    }
// limpiar cuando guarda

    private void limpiar() {
        log.LOusuario.setText("");
        log.LOcontraseña.setText("");
        xxx.NUid.setText("");
        xxx.NUnombre.setText("");
        xxx.NUapellido.setText("");
        xxx.NUdireccion.setText("");
        vende1.VEnuevo_id.setText("");
        vende1.VEnuevo_nombre.setText("");
        vende1.VEnuevo_apellido.setText("");
        produsct1.PRnuevaid.setText("");
        produsct1.PRnuevo_nombre.setText("");
        produsct1.PRnuevo_precio.setText("");
        cl.CLid.setText("");
        cl.CLnombre.setText("");
        cl.CLapellido.setText("");
        cl.CLdireccion.setText("");
        ven.VEid.setText("");
        ven.VEnombre.setText("");
        ven.VEapellido.setText("");
        produc.PRid.setText("");
        produc.PRnombre.setText("");
        produc.PRprecio.setText("");

    }

    // orden de guardar informacion
    public void tablevendedor(JTable VEtabla, ArrayList<MOvendedor> listvendedor) {
        for (int i = 0; i < listvendedor.size(); i++) {
            VEtabla.setValueAt(listvendedor.get(i).getVEid(), i, 0);
            VEtabla.setValueAt(listvendedor.get(i).getVEnombre(), i, 1);
            VEtabla.setValueAt(listvendedor.get(i).getVEapellido(), i, 2);

        }

    }

    public void tablecliente(JTable CLtabla, ArrayList<MOcliente> listcliente) {
        for (int i = 0; i < listcliente.size(); i++) {
            CLtabla.setValueAt(listcliente.get(i).getADid(), i, 0);
            CLtabla.setValueAt(listcliente.get(i).getADnombre(), i, 1);
            CLtabla.setValueAt(listcliente.get(i).getADapellido(), i, 2);
            CLtabla.setValueAt(listcliente.get(i).getADdireccion(), i, 3);

        }

    }

    public void tableproducto(JTable PRtabla, ArrayList<MOproducto> listproducto) {
        for (int i = 0; i < listproducto.size(); i++) {
            PRtabla.setValueAt(listproducto.get(i).getPRid(), i, 0);
            PRtabla.setValueAt(listproducto.get(i).getPRnombre(), i, 1);
            PRtabla.setValueAt(listproducto.get(i).getPRprecio(), i, 2);
            PRtabla.setValueAt(listproducto.get(i).getPRcategoria(), i, 3);

        }

    }

    public void limpiar_tabla_cliente(JTable CLtabla, ArrayList<MOcliente> listcliente) {
        for (int i = 0; i < listcliente.size(); i++) {
            CLtabla.setValueAt("", i, 0);
            CLtabla.setValueAt("", i, 1);
            CLtabla.setValueAt("", i, 2);
            CLtabla.setValueAt("", i, 3);

        }
    }

    public void limpiar_tabla_producto1(JTable PRtabla, ArrayList<MOproducto> listproducto) {
        for (int i = 0; i < listproducto.size(); i++) {
            PRtabla.setValueAt("", i, 0);
            PRtabla.setValueAt("", i, 1);
            PRtabla.setValueAt("", i, 2);
            PRtabla.setValueAt("", i, 3);

        }
    }

    public void limpiar_tabla_vendedor1(JTable VEtabla, ArrayList<MOvendedor> listvendedor) {
        for (int i = 0; i < listvendedor.size(); i++) {
            VEtabla.setValueAt("", i, 0);
            VEtabla.setValueAt("", i, 1);
            VEtabla.setValueAt("", i, 2);

        }
    }

    public void limpiar_tabla_cl(JTable CLtabla, ArrayList<MOcliente> listcliente) {
        for (int i = 0; i < listcliente.size(); i++) {
            CLtabla.setValueAt("", i, 0);
            CLtabla.setValueAt("", i, 1);
            CLtabla.setValueAt("", i, 2);
            CLtabla.setValueAt("", i, 3);

        }
    }

    public void limpiar_tabla_product(JTable PRtabla, ArrayList<MOproducto> listproducto) {
        for (int i = 0; i < listproducto.size(); i++) {
            PRtabla.setValueAt("", i, 0);
            PRtabla.setValueAt("", i, 1);
            PRtabla.setValueAt("", i, 2);
            PRtabla.setValueAt("", i, 3);

        }
    }

    public void limpiar_tabla_vendedor(JTable PRtabla, ArrayList<MOvendedor> listvendededor) {
        for (int i = 0; i < listvendededor.size(); i++) {
            PRtabla.setValueAt("", i, 0);
            PRtabla.setValueAt("", i, 1);
            PRtabla.setValueAt("", i, 2);

        }
    }

}
