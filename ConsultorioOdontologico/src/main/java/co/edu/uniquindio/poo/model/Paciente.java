package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public record Paciente(String historiaClinica, String nombre, int edad, String telefono, String direccion, LocalDate fechaUltimaConsulta, int tratamientosRealizados) {
    public Paciente actualizarRegistro(LocalDate nuevaFecha, int nuevosTratamientos) {
        return new Paciente(this.historiaClinica, this.nombre, this.edad, this.telefono, this.direccion, nuevaFecha, nuevosTratamientos);
    }
}
