package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.Map;

@Entity
@Table
public class RivenditoreAutorizzato extends Venditore{
    @Id
    @GeneratedValue
    private int numRivenditore;
    private ArrayList<String> bigliettiEmessiRivenditore;

    //costruttori
    public RivenditoreAutorizzato(int id, int conteggioBiglietti, Map<Integer, Boolean> biglietti) {
        super(id, conteggioBiglietti, biglietti);
    }

    public RivenditoreAutorizzato(int id, int conteggioBiglietti, Map<Integer, Boolean> biglietti, int numRivenditore, ArrayList<String> bigliettiEmessiRivenditore) {
        super(id, conteggioBiglietti, biglietti);
        this.numRivenditore = numRivenditore;
        this.bigliettiEmessiRivenditore = bigliettiEmessiRivenditore;
    }

    //getter e setter
    public int getNumRivenditore() {
        return numRivenditore;
    }

    public void setNumRivenditore(int numRivenditore) {
        this.numRivenditore = numRivenditore;
    }

    public ArrayList<String> getBigliettiEmessiRivenditore() {
        return bigliettiEmessiRivenditore;
    }

    public void setBigliettiEmessiRivenditore(ArrayList<String> bigliettiEmessiRivenditore) {
        this.bigliettiEmessiRivenditore = bigliettiEmessiRivenditore;
    }
}