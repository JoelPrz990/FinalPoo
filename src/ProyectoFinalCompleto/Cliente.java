/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalCompleto;

/**
 *
 * @author Joel
 */
public class Cliente {
    private int edad;
    private int id;
    private String telefono;
    private String correo;
    private String nombre;

    public Cliente() {
    }

    public Cliente(int edad, int id, String telefono, String correo, String nombre) {
        this.edad = edad;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
}
