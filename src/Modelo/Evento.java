
package Modelo;


public class Evento {
    private String descripcion;
    private int cantidad;
    private int tamano_recinto;
    private int cantidad_mesas;
    private int precio;

    public Evento() {
    }
    
    public Evento(String descripcion, int cantidad, int tamano_recinto, int cantidad_mesas, int precio) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.tamano_recinto = tamano_recinto;
        this.cantidad_mesas = cantidad_mesas;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTamano_recinto() {
        return tamano_recinto;
    }

    public void setTamano_recinto(int tamano_recinto) {
        this.tamano_recinto = tamano_recinto;
    }

    public int getCantidad_mesas() {
        return cantidad_mesas;
    }

    public void setCantidad_mesas(int cantidad_mesas) {
        this.cantidad_mesas = cantidad_mesas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Evento{" + "descripcion=" + descripcion + ", cantidad=" + cantidad + ", tamano_recinto=" + tamano_recinto + ", cantidad_mesas=" + cantidad_mesas + ", precio=" + precio + '}';
    }
    
    
    
}
