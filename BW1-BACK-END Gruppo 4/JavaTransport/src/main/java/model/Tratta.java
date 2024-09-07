package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Tratta {
    @Id
    @GeneratedValue
    private int id;
    private String nomeTratta;
    private String partenzaTratta;
    private String fineTratta;
    private double percorrenzaMedia; // minuti previsti tratta
    private int kmTratta; //
    private double percorrenzaEffettiva;  // minuti effettivi tratta

    public Tratta() {
    }

    public Tratta(int id, String nomeTratta, String partenzaTratta, String fineTratta, double percorrenzaMedia, int kmTratta, double percorrenzaEffettiva) {
        this.id = id;
        this.nomeTratta = nomeTratta;
        this.partenzaTratta = partenzaTratta;
        this.fineTratta = fineTratta;
        this.percorrenzaMedia = percorrenzaMedia;
        this.kmTratta = kmTratta;
        this.percorrenzaEffettiva = percorrenzaEffettiva;
    }

    // getter e setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTratta(){
        return nomeTratta;
    }

    public void setNomeTratta(String nomeTratta){
        this.nomeTratta = nomeTratta;
    }

    public String getPartenzaTratta() {
        return partenzaTratta;
    }

    public void setPartenzaTratta(String partenzaTratta) {
        this.partenzaTratta = partenzaTratta;
    }

    public String getFineTratta() {
        return fineTratta;
    }

    public void setFineTratta(String fineTratta) {
        this.fineTratta = fineTratta;
    }

    public double getPercorrenzaMedia() {
        return percorrenzaMedia;
    }

    public void setPercorrenzaMedia(double percorrenzaMedia) {
        this.percorrenzaMedia = percorrenzaMedia;
    }

    public int getKmTratta() {
        return kmTratta;
    }

    public void setKmTratta(int kmTratta) {
        this.kmTratta = kmTratta;
    }

    public double getPercorrenzaEffettiva() {
        return percorrenzaEffettiva;
    }

    public void setPercorrenzaEffettiva(double percorrenzaEffettiva) {
        this.percorrenzaEffettiva = percorrenzaEffettiva;
    }

}
