package co.edu.uniquindio.poo.model;

public class Odontologo {
    private String id;
    private String nombre;
    private String licencia;
    private Especialidad especialidad;

    public Odontologo(String id, String nombre, String licencia, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.licencia = licencia;
        this.especialidad = especialidad;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}




