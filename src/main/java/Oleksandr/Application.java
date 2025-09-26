package Oleksandr;

import Oleksandr.DAO.LibriDAO;
import Oleksandr.DAO.PrestitoDAO;
import Oleksandr.DAO.RivistaDAO;
import Oleksandr.Entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import Oleksandr.DAO.UtenteDAO;

import java.time.LocalDate;

public class Application {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoBiblioteca");


    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        try (em) {
            UtenteDAO ad = new UtenteDAO(em);
            LibriDAO lad= new LibriDAO(em);
            RivistaDAO rad = new RivistaDAO(em);
            PrestitoDAO pad = new PrestitoDAO(em);
                

            Utente utente = new Utente("John", "Doe", LocalDate.of(1987, 1, 1));
            Utente utente2 = new Utente("Jane", "Doe", LocalDate.of(1987, 1, 1));
            Rivista libri4= new Rivista("The Art of Computer Programming", "", "Computer Science", 1998, 400, "Annual");
            Rivista libri3 = new Rivista("The C Programming Language", "", "Computer Science", 1972, 500, "Annual");
            Libri libri = new Libro("Clean Code", "", "Computer Science", 2008, 400) ;
            Libri libri2 = new Libro ("Clean Architecture", "", "Computer Science", 2017, 400);
            Prestito prestito = new Prestito(libri, utente, LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 15));
            Prestito prestito2 = new Prestito(libri2, utente2, LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 15));

            lad.save(libri);
            lad.save(libri2);

            ad.save(utente);
            ad.save(utente2);

            rad.save(libri3);
            rad.save(libri4);

            pad.save(prestito);
            pad.save(prestito2);

            System.out.println("Done");
        } finally {
            emf.close();
        }
    }
}