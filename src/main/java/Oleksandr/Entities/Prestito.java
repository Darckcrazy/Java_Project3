package Oleksandr.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prestito")
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "libro_id", nullable = false)
    protected Libri elementoPrestito;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "utente_id", nullable = false)
    protected Utente utentePrestito;

    protected LocalDate dataPrestito;
    protected LocalDate dataRitornoPrestitoPrevista;
    protected LocalDate dataRitornoPrestitoReale;

    public Prestito() {
    }
    public Prestito(Libri elementoPrestito, Utente utentePrestito, LocalDate dataPrestito, LocalDate dataRitornoPrestitoPrevista, LocalDate dataRitornoPrestitoReale) {
        this.elementoPrestito = elementoPrestito;
        this.utentePrestito = utentePrestito;
        this.dataPrestito = dataPrestito;
        this.dataRitornoPrestitoPrevista = dataRitornoPrestitoPrevista;
        this.dataRitornoPrestitoReale = dataRitornoPrestitoReale;
    }

    public long getId() {
        return id;
    }
    public Libri getElementoPrestito() {
        return elementoPrestito;
    }
    public Utente getUtentePrestito() {
        return utentePrestito;
    }
    public LocalDate getDataPrestito() {
        return dataPrestito;
    }
    public LocalDate getDataRitornoPrestitoPrevista() {
        return dataRitornoPrestitoPrevista;
    }
    public LocalDate getDataRitornoPrestitoReale() {
        return dataRitornoPrestitoReale;
    }
}
