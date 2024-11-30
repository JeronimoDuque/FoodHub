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
import javax.persistence.Query;

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

    public void destroy(int id){

    }

    public List<Receta> findRecetaEntities() {
        return findRecetaEntities(true, -1, -1);
    }

    private List<Receta> findRecetaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT r FROM Receta r");
            if (!all) {
                query.setMaxResults(maxResults);
                query.setFirstResult(firstResult);
            }
            return query.getResultList();
        } finally {
            em.close();
        }
    }


    public Receta findReceta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Receta.class, id);
        } finally {
            em.close();
        }
    }

}
