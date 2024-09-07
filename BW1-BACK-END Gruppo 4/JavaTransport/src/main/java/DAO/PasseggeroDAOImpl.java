package dao;

import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;
import model.Passeggero;

import java.util.List;

public class PasseggeroDAOImpl implements PasseggeroDAO {
    @Override
    public void save(Passeggero passeggero) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(passeggero);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Passeggero findById(int id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Passeggero passeggero = entityManager.find(Passeggero.class, id);
        entityManager.close();
        return passeggero;
    }

    @Override
    public List<Passeggero> findAll() {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        List<Passeggero> passeggeri = entityManager.createQuery("SELECT p FROM Passeggero p", Passeggero.class).getResultList();
        entityManager.close();
        return passeggeri;
    }

    @Override
    public void update(Passeggero passeggero) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(passeggero);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Passeggero passeggero = entityManager.find(Passeggero.class, id);
        if (passeggero != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(passeggero);
            entityManager.getTransaction().commit();
        }
        entityManager.close();
    }
}
