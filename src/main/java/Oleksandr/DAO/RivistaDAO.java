package Oleksandr.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import Oleksandr.Entities.Rivista;

public class RivistaDAO {
    private final EntityManager entityManager;
    public RivistaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public void save(Rivista rivista) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(rivista);

        transaction.commit();

        System.out.println("Rivista salvata");
    }
}
