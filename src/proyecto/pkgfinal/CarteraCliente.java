/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal;

/**
 *
 * @author Joel
 */
public class CarteraCliente extends javax.swing.JFrame{
    public CarteraCliente(){
        setSize(300, 200);
        setTitle("Cartera de clientes");
        initComponents();
    }
    private void initComponents(){
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new CarteraCliente().setVisible(true);
    }
}
