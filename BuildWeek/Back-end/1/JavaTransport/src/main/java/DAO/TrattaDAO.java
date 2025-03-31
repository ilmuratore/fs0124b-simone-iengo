package dao;

import model.Tratta;
import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;

public class TrattaDAO {
    private EntityManager em;

    public TrattaDAO() {
        em = DatabaseConnection.getInstance().getEntityManager();
    }

    public void save(Tratta tratta) {
        em.getTransaction().begin();
        em.persist(tratta);
        em.getTransaction().commit();
    }

    public Tratta find(int id) {
        return em.find(Tratta.class, id);
    }

    // Aggiungi qui altri metodi per le operazioni CRUD

    public void close() {
        em.close();
    }
}
