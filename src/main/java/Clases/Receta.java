public class Receta {
    private int id;
    private String Nombre;
    private String Descripcion;
    private String Ingredientes;


    public Receta(int id, String Nombre, String Descripcion, String Ingredientes) {
        this.id = id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Ingredientes = Ingredientes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getIngredientes() {
        return this.Ingredientes;
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }


}
