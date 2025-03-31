package model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Abbonamento{
    private int idAbbonamento;
    private Frequenza frequenza; // se abbonamento settimanale, mensile
    private boolean isValid; // true = attivo, false = scaduto/non presente

    public Abbonamento() {
    }

    public Abbonamento(int idAbbonamento, Frequenza frequenza, boolean isValid) {
        this.idAbbonamento = idAbbonamento;
        this.frequenza = frequenza;
        this.isValid = isValid;
    }


    // getter e setter


    public int getIdAbbonamento() {
        return idAbbonamento;
    }

    public void setIdAbbonamento(int idAbbonamento) {
        this.idAbbonamento = idAbbonamento;
    }

    public Frequenza getFrequenza() {
        return frequenza;
    }

    public void setFrequenza(Frequenza frequenza) {
        this.frequenza = frequenza;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

}



