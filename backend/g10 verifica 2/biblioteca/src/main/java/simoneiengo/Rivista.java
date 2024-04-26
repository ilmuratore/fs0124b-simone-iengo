package simoneiengo;

import java.io.Serializable;


public class Rivista extends ElementoCatalogo implements Serializable {
    private String periodicita;


    public Rivista(String isbn, int annoPubblicazione, int numeroPagine, String periodicita){
        super(isbn, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public String getPeriodicita(){
        return periodicita;
    }

    public void setPeriodicita(String periodicita){
        this.periodicita = periodicita;
    }

    public static Rivista fromCSV(String csv) {
        String[] parts = csv.split(",");
        if (parts.length != 4) {
            return null;
        }
        String isbn = parts[0];
        int annoPubblicazione = Integer.parseInt(parts[1]);
        int numeroPagine = Integer.parseInt(parts[2]);
        String periodicita = parts[3];
        return new Rivista(isbn, annoPubblicazione, numeroPagine, periodicita);
    }

    @Override
    public String toCSV(){
       return super.toCSV()+ "," + periodicita;
    }

    @Override
    public String toString() {
        return super.toString() + ", Periodicità: " + periodicita;
    }

}
