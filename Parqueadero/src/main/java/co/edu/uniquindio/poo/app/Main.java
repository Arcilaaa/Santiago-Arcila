package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Parqueadero;
import co.edu.uniquindio.poo.model.Vehiculo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Av. Principal 123");

        while (true) {
            String[] opciones = {"Registrar Vehículo", "Eliminar Vehículo", "Mostrar Vehículos", "Modificar Vehículo", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Parqueadero",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String color = JOptionPane.showInputDialog("Ingrese el color del vehículo:");
                    String hora = JOptionPane.showInputDialog("Ingrese la hora de llegada:");
                    Vehiculo nuevoVehiculo = new Vehiculo(placa, modelo, color, hora);
                    parqueadero.registrarVehiculo(nuevoVehiculo);
                    break;

                case 1:
                    String placaEliminar = JOptionPane.showInputDialog("Ingrese la placa del vehículo a eliminar:");
                    parqueadero.eliminarVehiculo(placaEliminar);
                    break;

                case 2:
                    parqueadero.mostrarVehiculos();
                    break;

                case 3:
                    String placaBuscar = JOptionPane.showInputDialog("Ingrese la placa del vehículo a modificar:");
                    boolean encontrado = false;
                    for (Vehiculo v : parqueadero.getListaVehiculos()) {
                        if (v.getPlaca().equalsIgnoreCase(placaBuscar)) {
                            encontrado = true;
                            String[] cambios = {"Placa", "Modelo", "Color", "Hora de llegada"};
                            int cambio = JOptionPane.showOptionDialog(null, "¿Qué desea modificar?", "Modificar Vehículo",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, cambios, cambios[0]);

                            String nuevoValor = JOptionPane.showInputDialog("Ingrese el nuevo valor:");
                            switch (cambio) {
                                case 0:
                                    v.setPlaca(nuevoValor);
                                    break;
                                case 1:
                                    v.setModelo(nuevoValor);
                                    break;
                                case 2:
                                    v.setColor(nuevoValor);
                                    break;
                                case 3:
                                    v.setHoraLlegada(nuevoValor);
                                    break;
                            }
                            JOptionPane.showMessageDialog(null, "Información del vehículo actualizada.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontró un vehículo con esa placa.");
                    }
                    break;

                case 4: // Salir
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}
