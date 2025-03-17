package co.edu.uniquindio.poo.model;

public class    Veterinaria {

    private String ubicacion;

    private String nombre;

    private String nit;

    private Mascota[] listaMascotas;



    public Veterinaria(String ubicacion, String nombre, String nit, int cantidadMascotas) {

        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.nit = nit;
        this.listaMascotas = new Mascota[cantidadMascotas];
    }
    // CRUD (create)(read)(update)(delete)

    public String registrarMascota(Mascota mascota) {
        String mensaje = "";
        int posDisponible = -1;

        posDisponible = buscarPosicionDisponible();
        if (posDisponible == -1) {
            mensaje = "no hay cupos disponibles para la atencion de la mascota";

        }else{
            listaMascotas[posDisponible] = mascota;
            mensaje = "Mascota atendida";
        }

        return mensaje;
    }

    public Mascota buscarMascotas(String nombre) {
        for(int i = 0 ; i < listaMascotas.length ; i++){
            Mascota mascotaAux = listaMascotas[i];
            if(mascotaAux != null && mascotaAux.getNombre().equals(nombre)){
                return mascotaAux;
            }
        }
        return null;
    }

    private int buscarPosicionDisponible() {
        int posDisponible = -1;

        for (int i = 0; i < listaMascotas.length; i++) {
            Mascota mascotaAux = listaMascotas[i];
            if (mascotaAux == null){
                return i;
            }
        }

        return posDisponible;
    }

    public String eliminarMascota(String nombre) {
        String mensaje = "No existe";
        for (int i = 0; i < listaMascotas.length; i++) {
            Mascota aux = listaMascotas[i];
            if(aux != null && aux.getNombre().equals(nombre)){
                listaMascotas[i] = null;
                return "mascota eliminada";

            }
        }


        return mensaje;
    }

    public String actualizarMascota(String nombreActual, String newNombre, String newRaza) {
        String mensaje = "La mascota a actualizar no existe";
        Mascota mascotaEncontrada = null;

        Mascota buscarMascota = buscarMascotas(nombreActual);
        if(mascotaEncontrada != null){
            mascotaEncontrada.setNombre(newNombre);
            mascotaEncontrada.setRaza(newRaza);
            return "la informacion de la mascota a sido actuaizada";
        }
        return mensaje;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Veterinaria{" +
                "ubicacion='" + ubicacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }
}

