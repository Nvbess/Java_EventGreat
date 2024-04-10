
package Test;

import Controlador.DaoReserva;
import Modelo.Cliente;
import Modelo.Evento;
import Modelo.Fiesta;
import Modelo.Matrimonio;
import Modelo.Reserva;
import java.time.LocalDateTime;


public class test {


    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente("123123", "asdasd", "asdasd", 123123);
        Fiesta f1 = new Fiesta(true, 1, "asdasd", 1, 2, 3, 4444);
        Matrimonio m1 = new Matrimonio(3, true, "asdas", 1, 1, 1, 1);
        Reserva re = new Reserva(c1, m1, LocalDateTime.of(12, 12, 12, 15, 30));
        Reserva re2 = new Reserva(c1, f1, LocalDateTime.of(12, 12, 12, 15, 30));
        
        DaoReserva dao = new DaoReserva();
        
        dao.guardarReserva(re);
        dao.guardarReserva(re2);
        System.out.println(dao.listarTodo());
        System.out.println(dao.cantidadEventos());
        
    }
    
}
