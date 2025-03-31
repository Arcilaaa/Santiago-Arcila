package co.edu.uniquindio.poo.app;


import co.edu.uniquindio.poo.model.Consultorio;
import co.edu.uniquindio.poo.model.Especialidad;
import co.edu.uniquindio.poo.model.Odontologo;
import co.edu.uniquindio.poo.model.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();


        consultorio.registrarOdontologo(new Odontologo("001", "Juan", "12345",Especialidad.ORTODONCIA));


        Paciente paciente1 = new Paciente("1001", "Maria", 30, "1234", "Calle 1", LocalDate.now(), 6);
        consultorio.registrarPaciente(paciente1);

        List<Paciente> pacientesDestacados = consultorio.obtenerPacientesConMasDe5Tratamientos();
        System.out.println("Pacientes con más de 5 tratamientos:");
        for (Paciente p : pacientesDestacados) {
            System.out.println(p.nombre());
        }

}
}








