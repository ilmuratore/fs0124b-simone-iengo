package dao;

import model.Distributore;
import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;

public class DistributoreDAO {
    private EntityManager em;

    public DistributoreDAO() {
        em = DatabaseConnection.getInstance().getEntityManager();
    }

    public void save(Distributore distributore) {
        em.getTransaction().begin();
        em.persist(distributore);
        em.getTransaction().commit();
    }

    public Distributore find(int id) {
        return em.find(Distributore.class, id);
    }

    // Aggiungi qui altri metodi per le operazioni CRUD

    public void close() {
        em.close();
    }
}
