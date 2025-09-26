package Oleksandr.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import Oleksandr.Entities.Prestito;

public class PrestitoDAO {
    private final EntityManager entityManager;
    public PrestitoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public void save(Prestito prestito) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(prestito);

        transaction.commit();

        System.out.println("Prestito salvato");
    }
}
