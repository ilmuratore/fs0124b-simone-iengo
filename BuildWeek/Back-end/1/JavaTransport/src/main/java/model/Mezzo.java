package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Mezzo {
    @Id
    @GeneratedValue
    private int id;
    private int capacitaPasseggeri;  // tram 25 passeggeri, autobus 40
    private String stato;
    private int entrataInServizio;

    public Mezzo(){};

    public Mezzo(int id, int capacitaPassaggeri, String stato, int entrataInServizio) {
        this.id = id;
        this.capacitaPasseggeri = capacitaPassaggeri;
        this.stato = stato;
        this.entrataInServizio = entrataInServizio;
    }

    // getter e setter
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getCapacita(){
        return capacitaPasseggeri;
    }

    public void setCapacita(int capacita){
        this.capacitaPasseggeri = capacita;
    }

    public String getStato(){
        return stato;
    }

    public void setStato(String stato){
        this.stato = stato;
    }

    public int getEntrataInServizio(){
        return entrataInServizio;
    }

    public void setEntrataInServizio(int entrataInServizio){
        this.entrataInServizio = entrataInServizio;
    }

}