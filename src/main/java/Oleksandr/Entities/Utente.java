package Oleksandr.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "utente")


public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected String username;
    protected String cognome;
    protected LocalDate anno_di_nascita;

    public Utente() {
    }

    public Utente(String username, String cognome, LocalDate anno_di_nascita) {
        this.username = username;
        this.cognome = cognome;
        this.anno_di_nascita = anno_di_nascita;
    }
    public long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getCognome() {
        return cognome;
    }
    public LocalDate getAnno_di_nascita() {
        return anno_di_nascita;
    }
}
