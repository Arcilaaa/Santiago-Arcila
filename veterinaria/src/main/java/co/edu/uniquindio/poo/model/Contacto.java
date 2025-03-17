package co.edu.uniquindio.poo.model;

public class Contacto {
    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    public Contacto(String nombre, String apellido, String telefono, String email) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

/// ==: Compara las referencias (si los dos objetos son el mismo objeto en memoria).
/// .equals(): Compara los valores/contenciones de los objetos (dependiendo de cómo se haya implementado en la clase).
/// Si estás trabajando con objetos que representan cadenas de texto, números, o estructuras de datos complejas, generalmente querrás usar .equals() para comparar los valores dentro de los objetos.
