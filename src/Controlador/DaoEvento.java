
package Controlador;

import Modelo.Evento;
import java.util.ArrayList;


public class DaoEvento {
    private static ArrayList<Evento> coleccion_evento;

    public DaoEvento() {
        if (coleccion_evento == null) {
            coleccion_evento = new ArrayList<>();
        }
    }
    
    public boolean guardarEvento(Evento eve){
        coleccion_evento.add(eve);
        return true;
    }
    
    public ArrayList<Evento> listar(){
        return coleccion_evento;
    }
    
    public Evento buscar(String descripcion){
        for (Evento evento : coleccion_evento) {
            if (evento.getDescripcion().equalsIgnoreCase(descripcion)) {
                return evento;
            }
        }
        return null;
    }
    
}
