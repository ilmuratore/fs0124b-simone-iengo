package dao;

import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;
import model.ManutenzioneMezzi;

import java.util.List;

public class ManutenzioneMezziDAOImpl implements ManutenzioneMezziDAO {
    @Override
    public void save(ManutenzioneMezzi manutenzione) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(manutenzione);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public ManutenzioneMezzi findById(String id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        ManutenzioneMezzi manutenzione = entityManager.find(ManutenzioneMezzi.class, id);
        entityManager.close();
        return manutenzione;
    }

    @Override
    public List<ManutenzioneMezzi> findAll() {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        List<ManutenzioneMezzi> manutenzioni = entityManager.createQuery("SELECT m FROM ManutenzioneMezzi m", ManutenzioneMezzi.class).getResultList();
        entityManager.close();
        return manutenzioni;
    }

    @Override
    public void update(ManutenzioneMezzi manutenzione) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(manutenzione);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(String id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        ManutenzioneMezzi manutenzione = entityManager.find(ManutenzioneMezzi.class, id);
        if (manutenzione != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(manutenzione);
            entityManager.getTransaction().commit();
        }
        entityManager.close();
    }
}


