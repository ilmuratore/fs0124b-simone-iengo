package Connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private final EntityManagerFactory entityManagerFactory;

    private DatabaseConnection() {
        entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Inheritance");
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
