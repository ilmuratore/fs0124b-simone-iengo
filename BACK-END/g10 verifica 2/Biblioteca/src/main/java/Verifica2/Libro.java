package Verifica2;

public class Libro extends Elemento {
    private final String autore;
    private final String genere;

    public Libro(String titolo, String isbn, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(titolo, isbn, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    // getter e setter
    public String getAutore() {
        return this.autore;
    }

    public String getGenere() {
        return this.genere;
    }
}