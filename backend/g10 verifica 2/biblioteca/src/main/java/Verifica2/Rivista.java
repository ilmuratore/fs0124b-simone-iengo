package Verifica2;

public class Rivista extends Elemento {
    private String periodicita;


    public Rivista(String titolo, String isbn, int annoPubblicazione, int numeroPagine, String periodicita) {
        super(titolo, isbn, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    // getter e setter

    public String getPeriodicita(){
        return this.periodicita;
    }
}