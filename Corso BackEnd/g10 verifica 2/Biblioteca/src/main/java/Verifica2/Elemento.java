package Verifica2;

public abstract class Elemento {
    protected String titolo;
    protected String isbn;
    protected int annoPubblicazione;
    protected int numeroPagine;

    public Elemento(String titolo, String isbn, int annoPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }
    // getter e setter

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitolo() {
        if (this.titolo != null) {
            return this.titolo;
        } else {
            return "Elemento non disponibile";
        }
    }

    public int getAnnoPubblicazione() {
        return this.annoPubblicazione;
    }

    public int getNumeroPagine() {
        return this.numeroPagine;
    }
}