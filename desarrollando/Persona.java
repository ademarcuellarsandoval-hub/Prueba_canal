public class Persona {
    private String nombre;
    private int edad;

    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    // --- Métodos Getters ---

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // --- Métodos Setters ---

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}