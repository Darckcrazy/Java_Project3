package Oleksandr.Entities;

import jakarta.persistence.*;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("rivista")


public  class Rivista extends Libri {
    protected String periodicita;
    public Rivista () {
    }
    public Rivista(String titolo, String autore, String genere, int anno, int pagine, String periodicita) {
        super(titolo, autore, genere, anno, pagine);
        this.periodicita = periodicita;
    }

    public String getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(String periodicita) {
        this.periodicita = periodicita;
    }
}

