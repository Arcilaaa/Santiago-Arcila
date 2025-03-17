package co.edu.uniquindio.poo.model;

public class Nota {

    private String nombre;
    public float valor;

    public Nota(String nombre, Float valor) {
        this.nombre = nombre;
        this.valor = valor;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}

