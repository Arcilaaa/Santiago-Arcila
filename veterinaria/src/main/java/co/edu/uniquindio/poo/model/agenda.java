package co.edu.uniquindio.poo.model;

public class agenda {

    private Contacto[] listaContactos;

    public agenda(int cantidadContactos) {
        this.listaContactos = new Contacto[cantidadContactos];

    }
    public String registrarContacto(Contacto contacto) {
        String mensaje = "";
        int posDisponible = -1;

        posDisponible = buscarPosicionDisponible();
        if (posDisponible == -1) {
            mensaje = "no hay cupos disponibles para la atencion de la mascota";

        }else{
            listaContactos[posDisponible] = contacto;
            mensaje = "Contacto agregado";
        }

        return mensaje;
    }

    public Contacto[] buscarContacto(String nombre) {
        for(int i = 0 ; i < listaContactos.length ; i++){
            Contacto contactoAux = listaContactos[i];
            if(contactoAux.getNombre().equals(nombre)){
                return contactoAux;
            }
        }
        return null;
    }

    private int buscarPosicionDisponible() {
        int posDisponible = -1;

        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contactoAux = listaContactos[i];
            if (contactoAux == null){
                return i;
            }
        }

        return posDisponible;
    }
}

