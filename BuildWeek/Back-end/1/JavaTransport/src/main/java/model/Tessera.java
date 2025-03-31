package model;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.Date;

@Entity
@Table
public class Tessera {
    @Id
    @GeneratedValue
    private int idTessera;
    @OneToOne
    @JoinColumn(name = "passeggero_id")
    private Passeggero passeggero;
    private Date emissione;
    @Embedded
    private Abbonamento abbonamento;



    public Tessera(int idTessera, Passeggero passeggero, Date emissione, Abbonamento abbonamento) {
        this.idTessera = idTessera;
        this.passeggero = passeggero;
        this.emissione = emissione;
        this.abbonamento = abbonamento;
    }

    public Tessera(int idTessera, Object passeggero, Object emissione, boolean b, Object o) {
    }

    // getter e setter

    public int getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(int idTessera) {
        this.idTessera = idTessera;
    }

    public Passeggero getPasseggero() {
        return passeggero;
    }

    public void setPasseggero(Passeggero passeggero) {
        this.passeggero = passeggero;
    }

    public Date getEmissione() {
        return emissione;
    }

    public void setEmissione(Date emissione) {
        this.emissione = emissione;
    }

    public Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }

    //

    public boolean isTesseraValida() {
        if (emissione == null) {
            return false; // Se la data di emissione non è stata impostata, la tessera non può essere valida
        }

        // Calcoliamo la data di scadenza della tessera
        Calendar cal = Calendar.getInstance();
        cal.setTime(emissione);
        cal.add(Calendar.YEAR, 1); // Aggiungiamo un anno alla data di emissione
        Date scadenza = cal.getTime();

        // Ora confrontiamo la data di scadenza con la data attuale
        Date now = new Date();
        return now.before(scadenza); // La tessera è valida se la data attuale è prima della data di scadenza
    }

    //metodo rinnova tessera alla scadenza
}