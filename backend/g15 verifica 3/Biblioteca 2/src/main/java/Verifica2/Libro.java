package Verifica2;

import javax.persistence.*;

@Entity
public class Libro extends Elemento {
    private String autore;
    private String genere;

    // Getter e Setter per Libro
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
