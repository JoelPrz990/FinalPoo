/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalCompleto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Joel
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int respuesta;
        List<Cliente> clienteLista = new ArrayList<>();
        do{
            System.out.println("\nCartera de clientes");
            System.out.println("__________Menú de opciones__________");
            System.out.println("1.- Agregar cliente");
            System.out.println("2.- Mostrar lista de clientes");
            System.out.println("3.- Buscar por nombre");
            System.out.println("4.- Eliminar cliente");
            System.out.println("5.- Salir");
            System.out.print("\nRespuesta----------->");
            respuesta = sc.nextInt();
            switch(respuesta){
                case 1:
                    System.out.println("\n_____Registrar cliente_____\n");
                    Cliente cl = new Cliente();
                    System.out.print("Introduce el id: ");
                    cl.setId(sc.nextInt());
                    System.out.print("Introduce el nombre: ");
                    cl.setNombre(bf.readLine());
                    System.out.print("Introduce la edad: ");
                    cl.setEdad(sc.nextInt());
                    System.out.print("Introduce el correo: ");
                    cl.setCorreo(bf.readLine());
                    System.out.print("Introduce el telefono: ");
                    cl.setTelefono(bf.readLine());
                    clienteLista.add(cl);
                    System.out.println("Tamaño de la lista: " + clienteLista.size());
                    break;
                    
                case 2:
                    System.out.println("\n_____Datos de los clientes_____\n");
                    for(Cliente c:clienteLista){
                        System.out.println("Id: " + c.getId());
                        System.out.println("Nombre: " + c.getNombre());
                        System.out.println("Edad: " + c.getEdad());
                        System.out.println("Telefono: " + c.getTelefono());
                        System.out.println("Correo: " + c.getCorreo());
                        System.out.println("__________________________");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n_____Buscar cliente_____\n");
                    System.out.print("Introduce el nombre que quieres buscar: ");
                    String nombreBuscar = bf.readLine();
                    
                    for(Cliente c:clienteLista){
                        if(c.getNombre().equals(nombreBuscar)){
                            System.out.println("Se ha encontrado a " + nombreBuscar);
                            System.out.println("Id: "+ c.getId());
                            System.out.println("Nombre: "+ c.getNombre());
                            System.out.println("Edad: " + c.getEdad());
                            System.out.println("Telefono: " + c.getTelefono());
                            System.out.println("Correo: " + c.getCorreo());
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("\n_____Eliminar registro_____\n");
                    System.out.print("Introduce el nombre de quien quieres eliminar: ");
                    String eliminarRegistro = bf.readLine();
                    
                    for(int i = 0; i < clienteLista.size(); i++){
                        if(clienteLista.get(i).getNombre().equals(eliminarRegistro)){
                           clienteLista.remove(i);
                        }
                    }
                    System.out.println("\nEliminado");
                    break;
                    
                case 5:
                    System.out.println("Gracias por utilizar este software");
                    break;
                    
                default: System.out.println("No es una opcion del menu");
            }
        }
    while(respuesta != 5);
        }
}
