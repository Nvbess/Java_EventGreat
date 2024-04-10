
package Modelo;


public class Matrimonio extends Evento{
    private int cantidad_platos;
    private boolean musica;

    public Matrimonio() {
    }

    public Matrimonio(int cantidad_platos, boolean musica, String descripcion, int cantidad, int tamano_recinto, int cantidad_mesas, int precio) {
        super(descripcion, cantidad, tamano_recinto, cantidad_mesas, precio);
        this.cantidad_platos = cantidad_platos;
        this.musica = musica;
    }

    public int getCantidad_platos() {
        return cantidad_platos;
    }

    public void setCantidad_platos(int cantidad_platos) {
        this.cantidad_platos = cantidad_platos;
    }

    public boolean isMusica() {
        return musica;
    }

    public void setMusica(boolean musica) {
        this.musica = musica;
    }

    @Override
    public String toString() {
        return super.toString()+"Matrimonio{" + "cantidad_platos=" + cantidad_platos + ", musica=" + musica + '}';
    }
    
    
}
