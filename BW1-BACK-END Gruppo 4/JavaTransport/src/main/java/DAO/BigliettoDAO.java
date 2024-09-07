package dao;

import model.Biglietto;
import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;

public class BigliettoDAO {
    private final EntityManager em;

    public BigliettoDAO() {
        em = DatabaseConnection.getInstance().getEntityManager();
    }

    public void save(Biglietto biglietto) {
        em.getTransaction().begin();
        em.persist(biglietto);
        em.getTransaction().commit();
    }

    public Biglietto find(int id) {
        return em.find(Biglietto.class, id);
    }

    // Aggiungi qui altri metodi per le operazioni CRUD

    public void close() {
        em.close();
    }
}
