package Oleksandr.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import Oleksandr.Entities.Utente;

public class UtenteDAO {
    private final EntityManager entityManager;

    public UtenteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Utente utenteDAO) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(utenteDAO);

        transaction.commit();

        System.out.println("Utente salvato");
    }


}
