
package Controlador;

import Modelo.Fiesta;
import Modelo.Matrimonio;
import Modelo.Reserva;
import java.util.ArrayList;


public class DaoReserva {
    private static ArrayList<Reserva> coleccion_reserva;

    public DaoReserva() {
        if (coleccion_reserva == null) {
            coleccion_reserva = new ArrayList<>();
        }
    }
    
    public boolean guardarReserva(Reserva res){
        coleccion_reserva.add(res);
        return true;
    }
    
    public ArrayList<Reserva> listarTodo(){
        return coleccion_reserva;
    }
    
    public ArrayList<Reserva> filtrarFiesta(){
        ArrayList<Reserva> listarFiesta = new ArrayList();
        for (Reserva reserva : listarFiesta) {
            if (reserva.getEvento() instanceof Fiesta) {
                listarFiesta.add(reserva);
            }
        }
        return listarFiesta;
    }
    
    public ArrayList<Reserva> filtrarMatri(){
        ArrayList<Reserva> listarMatri = new ArrayList();
        for (Reserva reserva : listarMatri) {
            if (reserva.getEvento() instanceof Fiesta) {
                listarMatri.add(reserva);
            }
        }
        return listarMatri;
    }
    
    public String cantidadEventos(){
        int fiesta = 0;
        int matrimonio = 0;
        int total = 0;
        for (Reserva reg : coleccion_reserva) {
            if (reg.getEvento() instanceof Matrimonio) {
                matrimonio += 1;
                total += reg.getEvento().getPrecio();
            }
            if (reg.getEvento() instanceof Fiesta) {
                fiesta += 1;
                total+= reg.getEvento().getPrecio();
            }
        }
        return "Cantidad de Fiestas :"+fiesta+"Cantidad de Matrimonio :"+matrimonio+"TOTAL GANADO: "+total;
    }
    
    
}
