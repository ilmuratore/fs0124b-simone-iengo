package simoneiengo;

import java.io.Serializable;

public class Libro extends ElementoCatalogo implements Serializable {
    private String autore;
    private String genere;


    public Libro(String isbn, int annoPubblicazione, int numeroPagine, String autore, String genere){
        super(isbn, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore(){
        return autore;
    }

    public String getGenere(){
        return genere;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public void setGenere(String genere){
        this.genere = genere;
    }

    @Override
    public String toCSV(){
        return super.toCSV() + "," + autore + "," + genere;
    }

    public static Libro fromCSV(String csv) {
        String[] parts = csv.split(",");
        if (parts.length != 5) {
            return null;
        }
        String isbn = parts[0];
        int annoPubblicazione = Integer.parseInt(parts[1]);
        int numeroPagine = Integer.parseInt(parts[2]);
        String autore = parts[3];
        String genere = parts[4];
        return new Libro(isbn, annoPubblicazione, numeroPagine, autore, genere);
    }

    @Override
    public String toString() {
        return super.toString() + ", Autore: " + autore + ",Genere:" + genere;
    }
}

