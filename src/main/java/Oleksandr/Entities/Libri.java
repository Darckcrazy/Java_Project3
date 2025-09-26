package Oleksandr.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "libri")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_libri")

public abstract class Libri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    protected String titolo;
    protected String autore;
    protected String genere;
    protected int anno;
    protected int pagine;

    public Libri() {
    }

    public Libri(String titolo, String autore, String genere, int anno, int pagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.anno = anno;
        this.pagine = pagine;
    }

    public long getId() {
        return id;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getAutore() {
        return autore;
    }
    public String getGenere() {
        return genere;
    }
    public int getAnno() {
        return anno;
    }
    public int getPagine() {
        return pagine;
    }


}
