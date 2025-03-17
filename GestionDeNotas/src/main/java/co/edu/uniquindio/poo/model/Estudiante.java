package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private String identificacion;
    private Nota[] listaNotas = new Nota[5];
    private int contadorNotas = 0;


    public Estudiante(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Nota[] getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(Nota[] listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", listaNotas=" + Arrays.toString(listaNotas) +
                '}';
    }

    public void agregarNota(String nombre, float valor) {
        if (contadorNotas < listaNotas.length) {
            listaNotas[contadorNotas] = new Nota(nombre, valor);
            contadorNotas++;
        } else {
            System.out.println("No se pueden agregar más notas. El límite es 5.");
        }
    }

    public void actualizarNota(String nombre, float nuevoValor) {
        for (int i = 0; i < contadorNotas; i++) {
            if (listaNotas[i] != null && listaNotas[i].getNombre().equals(nombre)) {
                listaNotas[i].valor = nuevoValor;
                return;
            }
        }
        System.out.println("Nota no encontrada.");
    }


    public float calcularPromedio() {
        if (contadorNotas == 0){
            return 0;
        }
        float suma = 0;
        for (int i = 0; i < contadorNotas; i++) {
            suma += listaNotas[i].getValor();
        }
        return suma / contadorNotas;
    }
}



