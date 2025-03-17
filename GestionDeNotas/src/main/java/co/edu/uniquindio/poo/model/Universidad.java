package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String ubicacion;
    private ArrayList<Estudiante> listaEstudiantes;


    /** este es el constructor, este metodo permite inicializar los atributos de una universidad **/

    public Universidad(String nombre, String ubicacion) {

        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaEstudiantes = new ArrayList<Estudiante>();


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }


    public String registrarEstudiante(String nombre, String identificacion) {
        String mensaje = "";
       Estudiante encontrado = null;
        Estudiante nuevoEstudiante = null;

        encontrado = buscarEstudiante(identificacion);
       if(encontrado != null){ // ya existe en el sistema
           mensaje = "El estudiante " + encontrado.getNombre() + "ya existe";
           return mensaje;
       }
       nuevoEstudiante = new Estudiante(nombre, identificacion);
       listaEstudiantes.add(nuevoEstudiante);
       mensaje = "estudiante registrado correctamente";
       return mensaje;





        }

    private Estudiante buscarEstudiante(String identificacion) {
        Estudiante encontrado = null;

        for(Estudiante estudianteAux : listaEstudiantes) {
            if(estudianteAux.getIdentificacion().equals(identificacion)){
                return estudianteAux;
            }


        }



        return encontrado;

    }

    public void agregarNota(String identificacion, String nombreNota, float valorNota) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion().equals(identificacion)) {
                estudiante.agregarNota(nombreNota, valorNota);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }


    public void actualizarNota(String identificacion, String nombreNota, float nuevoValor) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion().equals(identificacion)) {
                estudiante.actualizarNota(nombreNota, nuevoValor);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }



    public float calcularPromedioEstudiante(String identificacion) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion().equals(identificacion)) {
                return estudiante.calcularPromedio();
            }
        }
        System.out.println("Estudiante no encontrado.");
        return 0;
    }

    public float calcularPromedioGeneral(){
        float promedio = 0;
        int sumatoria = 0;


        for (Estudiante estudiante : listaEstudiantes) {
            sumatoria+=estudiante.calcularPromedio();



        }

        return sumatoria/listaEstudiantes.size();



    }
    public boolean eliminarEstudiante(String identificacion) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion().equals(identificacion)) {
                listaEstudiantes.remove(estudiante);
                System.out.println("Estudiante eliminado correctamente.");
                return true;
            }
        }
        System.out.println("No se encontró ningún estudiante con la identificación: " + identificacion);
        return false;
    }
}




