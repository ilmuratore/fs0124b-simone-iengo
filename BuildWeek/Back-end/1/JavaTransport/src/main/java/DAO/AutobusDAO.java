package dao;

import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;
import model.Autobus;

import java.util.List;

public class AutobusDAO implements MezzoDAO<Autobus> {
    @Override
    public void save(Autobus autobus) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        if(autobus.getId() == 0){
            entityManager.persist(autobus);
        }else{
            entityManager.merge(autobus); // uso di merge nel caso in cui l'oggetto sia già presente nel database
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Autobus trovaPerId(int id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Autobus autobus = entityManager.find(Autobus.class, id);
        entityManager.close();
        return autobus;
    }

    @Override
    public List<Autobus> trovaTutti() {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        List<Autobus> autobusList = entityManager.createQuery("SELECT a FROM Autobus a", Autobus.class).getResultList();
        entityManager.close();
        return autobusList;
    }

    @Override
    public void update(Autobus autobus) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(autobus);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Autobus autobus = entityManager.find(Autobus.class, id);
        if(autobus != null){
            entityManager.getTransaction().begin();
            entityManager.remove(autobus);
            entityManager.getTransaction().commit();
        }
        entityManager.close();
    }
}
