package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Map;

@Entity
@Table
public class Distributore extends Venditore{
    @Id
    @GeneratedValue
    private int numDistributore; // diamo un nome univoco al distributore collegato per logica al id del mezzo
    @OneToOne
    @JoinColumn(name = "mezzo_id")
    private Mezzo mezzo;
    private String stato; // se in funzione o fuori servizio
    private ArrayList<String> bigliettiEmessiDistributore;

    //costruttori
    public Distributore(int id, int conteggioBiglietti, Map<Integer, Boolean> biglietti) {
        super(id, conteggioBiglietti, biglietti);
    }

    public Distributore(int numDistributore, Mezzo mezzo, String stato, ArrayList<String> bigliettiEmessiDistributore) {
        this.numDistributore = numDistributore;
        this.mezzo = mezzo;
        this.stato = stato;
        this.bigliettiEmessiDistributore = bigliettiEmessiDistributore;
    }

    //getter e setter
    public int getNumDistributore() {
        return numDistributore;
    }

    public void setNumDistributore(int numDistributore) {
        this.numDistributore = numDistributore;
    }

    public Mezzo getMezzo() {
        return mezzo;
    }

    public void setMezzo(Mezzo mezzo) {
        this.mezzo = mezzo;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public ArrayList<String> getBigliettiEmessiDistributore() {
        return bigliettiEmessiDistributore;
    }

    public void setBigliettiEmessiDistributore(ArrayList<String> bigliettiEmessiDistributore) {
        this.bigliettiEmessiDistributore = bigliettiEmessiDistributore;
    }
}