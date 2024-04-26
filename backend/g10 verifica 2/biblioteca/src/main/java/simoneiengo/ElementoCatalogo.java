package simoneiengo;

import java.io.Serializable;

public abstract class ElementoCatalogo implements Serializable {
    private String isbn;
    private int annoPubblicazione;
    private int numeroPagine;


    public ElementoCatalogo(String isbn, int annoPubblicazione, int numeroPagine){
        this.isbn = isbn;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;

    }

    public String getIsbn(){
        return isbn;
    }

    public int getAnnoPubblicazione(){
        return annoPubblicazione;
    }

    public int getNumeroPagine(){
        return numeroPagine;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setAnnoPubblicazione(int annoPubblicazione){
        this.annoPubblicazione = annoPubblicazione;
    }

    public void setNumeroPagine(int numeroPagine){
        this.numeroPagine = numeroPagine;
    }

    public String toCSV(){
        return isbn +"," + annoPubblicazione + "," + numeroPagine;
    }

    public static ElementoCatalogo fromCSV(String csv){
        String[] parts = csv.split(",");
        if(parts.length != 3){
            return null;
        }
        String isbn = parts[0];
        int annoPubblicazione = Integer.parseInt(parts[1]);
        int numeroPagine = Integer.parseInt(parts[2]);
        // implementare genere se libro o rivista
        return null;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Anno di pubblicazione: " + annoPubblicazione + ", Numero di pagine: " + numeroPagine;
    }
}
