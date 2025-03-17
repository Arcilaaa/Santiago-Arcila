package co.edu.uniquindio.poo.model;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String color;
    private String horaLlegada;

    public Vehiculo(String placa, String modelo, String color, String horaLlegada) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.horaLlegada = horaLlegada;
    }


    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setPlaca(String nuevaPlaca) {
        this.placa = nuevaPlaca;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void setHoraLlegada(String nuevaHora) {
        this.horaLlegada = nuevaHora;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Color: " + color + ", Hora de llegada: " + horaLlegada;
    }
}