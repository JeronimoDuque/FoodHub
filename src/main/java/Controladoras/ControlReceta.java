package Controladoras;

import java.util.List;
import Persistencia.ControladoraPersistencia;
import Clases.Receta;

public class ControlReceta {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearReceta (Receta res){
        controlPersis.crearReceta(res);
    }
    public List<Receta> traerRecetas (){
        return controlPersis.traerRecetas();
    }
}

