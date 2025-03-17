package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Parqueadero {
    private String nombre;
    private String ubicacion;
    private ArrayList<Vehiculo> listaVehiculos;

    public Parqueadero(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaVehiculos = new ArrayList<>();
    }


    public void registrarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
        JOptionPane.showMessageDialog(null, "Vehículo registrado con éxito.");
    }


    public boolean eliminarVehiculo(String placa) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                listaVehiculos.remove(vehiculo);
                JOptionPane.showMessageDialog(null, "Vehículo eliminado con éxito.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un vehículo con esa placa.");
        return false;
    }


    public void mostrarVehiculos() {
        if (listaVehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos en el parqueadero.");
            return;
        }
        StringBuilder mensaje = new StringBuilder("Vehículos en el parqueadero:\n");
        for (Vehiculo v : listaVehiculos) {
            mensaje.append(v).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}