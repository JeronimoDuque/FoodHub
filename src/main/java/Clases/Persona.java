package Clases;

public class Persona {
    private int id;
    private String nombre;
    private String contrasenna;


    public Persona(int id, String nombre, String contrasenna) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenna = contrasenna;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenna() {
        return this.contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }    

}
