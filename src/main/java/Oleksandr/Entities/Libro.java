package Oleksandr.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("libro")
public class Libro extends Libri {
    public Libro() {
    }

    public Libro(String titolo, String autore, String genere, int anno, int pagine) {
        super(titolo, autore, genere, anno, pagine);
    }
}
