package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Consultorio {

    private String nombre;
    private String direccion;
    private List<Odontologo> odontologos;
    private static List<Paciente> pacientes;


    public  Consultorio() {
        this.nombre = nombre;
        this.direccion = direccion;
        this.odontologos = new ArrayList<>();
        this.pacientes = new ArrayList<>();

    }


    public void registrarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> obtenerPacientesConMasDe5Tratamientos() {
        List<Paciente> resultado = new ArrayList<>();
        for (Paciente paciente : pacientes) {
            if (paciente.tratamientosRealizados() > 5) {
                resultado.add(paciente);
            }
        }
        return resultado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Odontologo> getOdontologos() {
        return odontologos;
    }

    public void setOdontologos(ArrayList<Odontologo> odontologos) {
        this.odontologos = odontologos;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

}




