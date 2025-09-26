package Oleksandr.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import Oleksandr.Entities.Libri;

public class LibriDAO {
    private final EntityManager entityManager;

    public LibriDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Libri libro) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(libro);

        transaction.commit();
        System.out.println("Libro salvato");
    }
}
