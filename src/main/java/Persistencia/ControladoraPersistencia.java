/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.List;

import Clases.Receta;
/**
 *
 * @author Duque
 */
public class ControladoraPersistencia {
    RecetaJpaController resJpa = new RecetaJpaController();

    public void crearReceta (Receta res){
        resJpa.create(res);
    }

    public List<Receta> traerRecetas(){
        return resJpa.findRecetaEntities();
    }
}