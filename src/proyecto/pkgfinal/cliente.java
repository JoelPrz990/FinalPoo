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
public class cliente {
    private int idCliente;
    private String entero;
    private int edad;

    public cliente() {
    }

    public cliente(int idCliente, String entero, int edad) {
        this.idCliente = idCliente;
        this.entero = entero;
        this.edad = edad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEntero() {
        return entero;
    }

    public void setEntero(String entero) {
        this.entero = entero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
