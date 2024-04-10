
package Modelo;

import java.time.LocalDateTime;


public class Reserva {
    private Cliente cliente;
    private Evento evento;
    private LocalDateTime fecha_hora;

    public Reserva() {
        Cliente cliente = new Cliente();
        Evento evento = new Evento();
    }

    public Reserva(Cliente cliente, Evento evento, LocalDateTime fecha_hora) {
        this.cliente = cliente;
        this.evento = evento;
        this.fecha_hora = fecha_hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public String toString() {
        return "Registro{" + "cliente=" + cliente + ", evento=" + evento + ", fecha_hora=" + fecha_hora + '}';
    }
    
    
}
