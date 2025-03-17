package co.edu.uniquindio.poo.app;


import co.edu.uniquindio.poo.model.Universidad;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Uniquindio", "Calle 12n");
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer estudiante:");
        String id1 = JOptionPane.showInputDialog("Ingrese la identificación del primer estudiante:");
        universidad.registrarEstudiante(nombre1, id1);


        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo estudiante:");
        String id2 = JOptionPane.showInputDialog("Ingrese la identificación del segundo estudiante:");
        universidad.registrarEstudiante(nombre2, id2);

        for (int i = 0; i < 5; i++) {
            String nombreNota = JOptionPane.showInputDialog("Ingrese el nombre de la nota #" + (i + 1) + " para " + nombre1 + ":");
            float valorNota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la nota:"));
            universidad.agregarNota(id1, nombreNota, valorNota);
        }

        for (int i = 0; i < 5; i++) {
            String nombreNota = JOptionPane.showInputDialog("Ingrese el nombre de la nota #" + (i + 1) + " para " + nombre2 + ":");
            float valorNota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la nota:"));
            universidad.agregarNota(id2, nombreNota, valorNota);
        }


        int actualizar = JOptionPane.showConfirmDialog(null, "¿Desea actualizar alguna nota?", "Actualizar Nota", JOptionPane.YES_NO_OPTION);
        if (actualizar == JOptionPane.YES_OPTION) {
            String idEstudiante = JOptionPane.showInputDialog("Ingrese la identificación del estudiante:");
            String nombreNota = JOptionPane.showInputDialog("Ingrese el nombre de la nota a actualizar:");
            float nuevoValor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo valor de la nota:"));
            universidad.actualizarNota(idEstudiante, nombreNota, nuevoValor);
        }

        int eliminar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar un estudiante?", "Eliminar Estudiante", JOptionPane.YES_NO_OPTION);
        if (eliminar == JOptionPane.YES_OPTION) {
            String idEliminar = JOptionPane.showInputDialog("Ingrese la identificación del estudiante a eliminar:");
            boolean eliminado = universidad.eliminarEstudiante(idEliminar);

            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Estudiante eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un estudiante con esa identificación.");
            }
        }


        float promedio1 = universidad.calcularPromedioEstudiante(id1);
        float promedio2 = universidad.calcularPromedioEstudiante(id2);

        JOptionPane.showMessageDialog(null, "Promedio de " + nombre1 + ": " + promedio1);
        JOptionPane.showMessageDialog(null, "Promedio de " + nombre2 + ": " + promedio2);

        float promedioGeneral = universidad.calcularPromedioGeneral();

        JOptionPane.showMessageDialog(null, "El promedio general de la universidad es: " + promedioGeneral);
    }}
