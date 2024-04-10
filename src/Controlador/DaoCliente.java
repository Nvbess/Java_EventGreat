
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;


public class DaoCliente {
    private static ArrayList<Cliente> coleccion_cliente;

    public DaoCliente() {
        if (coleccion_cliente==null) {
            coleccion_cliente = new ArrayList<>();
        }
    }
    
    public boolean guardarCliente(Cliente cli){
        if (existeCliente(cli.getRut())==false) {
            coleccion_cliente.add(cli);
            return true;
        }
        return false;
    }

    private boolean existeCliente(String rut) {
        for (Cliente cliente : coleccion_cliente) {
            if (cliente.getRut()==rut) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Cliente> listar(){
        return coleccion_cliente;
    }
    
    public Cliente buscar(String nombre){
        for (Cliente cliente : coleccion_cliente) {
            if (cliente.getNombre_completo().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }
    
    
    
}
