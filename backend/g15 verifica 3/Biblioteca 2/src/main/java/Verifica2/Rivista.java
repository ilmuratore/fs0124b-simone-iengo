package Verifica2;

import javax.persistence.*;

@Entity
public class Rivista extends Elemento {
    private String periodicita;

    // Getter e Setter per Rivista
    public String getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(String periodicita) {
        this.periodicita = periodicita;
    }
}
