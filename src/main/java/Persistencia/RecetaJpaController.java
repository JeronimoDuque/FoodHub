/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Clases.Receta;
import Persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Duque
 */
public class RecetaJpaController implements Serializable {
    
    public RecetaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    private EntityManagerFactory emf = null;
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public RecetaJpaController() {
        emf = Persistence.createEntityManagerFactory("my_persistence_unit");
    }

    public void create (Receta receta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em. getTransaction().begin();
            em.persist(receta);
            em.getTransaction().commit();
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Receta receta) throws NonexistentEntityException,Exception{
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            receta = em.merge(receta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = receta.getId();
                if (findReceta(id) == null) {
                    throw new NonexistentEntityException("La receta con el id " + id + "ya no exixte");
                }
            }
        }finally{
            if (em != null) {
                em.close();
            }
        }
    }

}
