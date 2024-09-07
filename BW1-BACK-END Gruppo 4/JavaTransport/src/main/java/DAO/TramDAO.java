package dao;

import Connection.DatabaseConnection;
import jakarta.persistence.EntityManager;
import model.Mezzo;

import java.util.List;

public class TramDAO implements MezzoDAO<Mezzo> {
    @Override
    public void save(Mezzo mezzo){
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mezzo);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Mezzo trovaPerId(int id){
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Mezzo mezzo = entityManager.find(Mezzo.class, id);
        entityManager.close();
        return mezzo;
    }

    @Override
    public List<Mezzo> trovaTutti(){
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        List<Mezzo> mezzi = entityManager.createQuery("SELECT m FROM Mezzo m", Mezzo.class).getResultList();
        entityManager.close();
        return mezzi;
    }

    @Override
    public void update(Mezzo mezzo){
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(mezzo);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(int id){
        EntityManager entityManager = DatabaseConnection.getInstance().getEntityManager();
        Mezzo mezzo = entityManager.find(Mezzo.class, id);
        if(mezzo != null){
            entityManager.getTransaction().begin();
            entityManager.remove(mezzo);
            entityManager.getTransaction().commit();
        }
        entityManager.close();
    }
}
