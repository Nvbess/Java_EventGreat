
package Modelo;


public class Cliente {
    private String rut, nombre_completo;
    private String correo;
    private int telefono;

    public Cliente() {
    }

    public Cliente(String rut, String nombre_completo, String correo, int telefono) {
        this.rut = rut;
        this.nombre_completo = nombre_completo;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre_completo=" + nombre_completo + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    
}
