package dao;

import model.Abbonamento;
import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;

public class AbbonamentoDAO {
    private EntityManager em;

    public AbbonamentoDAO() {
        em = DatabaseConnection.getInstance().getEntityManager();
    }

    public void save(Abbonamento abbonamento) {
        em.getTransaction().begin();
        em.persist(abbonamento);
        em.getTransaction().commit();
    }

    public Abbonamento find(int id) {
        return em.find(Abbonamento.class, id);
    }

    // Aggiungi qui altri metodi per le operazioni CRUD

    public void close() {
        em.close();
    }
}
