package dao;

import model.RivenditoreAutorizzato;
import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;

public class RivenditoreAutorizzatoDAO {
    private EntityManager em;

    public RivenditoreAutorizzatoDAO() {
        em = DatabaseConnection.getInstance().getEntityManager();
    }

    public void save(RivenditoreAutorizzato rivenditoreAutorizzato) {
        em.getTransaction().begin();
        em.persist(rivenditoreAutorizzato);
        em.getTransaction().commit();
    }

    public RivenditoreAutorizzato find(int id) {
        return em.find(RivenditoreAutorizzato.class, id);
    }

    // Aggiungi qui altri metodi per le operazioni CRUD

    public void close() {
        em.close();
    }
}