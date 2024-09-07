package dao;

import model.Tessera;
import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;

public class TesseraDAO {
    private final EntityManager em;

    public TesseraDAO() {
        em = DatabaseConnection.getInstance().getEntityManager();
    }

    public void save(Tessera tessera) {
        em.getTransaction().begin();
        em.persist(tessera);
        em.getTransaction().commit();
    }

    public Tessera find(int id) {
        return em.find(Tessera.class, id);
    }

    // qui altri eventuali metodi CRUD per la classe Tessera (update, delete, ecc.)

    public void close() {
        em.close();
    }
}
