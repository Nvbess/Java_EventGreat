
package Modelo;


public class Fiesta extends Evento{
    private boolean alcohol;
    private int nro_djs;

    public Fiesta() {
    }

    public Fiesta(boolean alcohol, int nro_djs, String descripcion, int cantidad, int tamano_recinto, int cantidad_mesas, int precio) {
        super(descripcion, cantidad, tamano_recinto, cantidad_mesas, precio);
        this.alcohol = alcohol;
        this.nro_djs = nro_djs;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public int getNro_djs() {
        return nro_djs;
    }

    public void setNro_djs(int nro_djs) {
        this.nro_djs = nro_djs;
    }

    @Override
    public String toString() {
        return super.toString()+"Fiesta{" + "alcohol=" + alcohol + ", nro_djs=" + nro_djs + '}';
    }
    
    
}
