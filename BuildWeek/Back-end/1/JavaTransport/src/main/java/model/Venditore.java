package model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Venditore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int conteggioBiglietti;
    private int conteggioAbbonamenti;
    private Map<Integer, Boolean> bigliettiVenduti;
    private List<Integer> abbonamenti;

    //costruttori
    public Venditore() {
    }

    public Venditore(int id, int conteggioBiglietti, Map<Integer, Boolean> biglietti) {
        this.id = id;
        this.conteggioBiglietti = conteggioBiglietti;
        this.conteggioAbbonamenti = conteggioAbbonamenti;
        this.bigliettiVenduti = bigliettiVenduti;
        this.abbonamenti = abbonamenti;
    }

    //getter e setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConteggioBiglietti() {
        return conteggioBiglietti;
    }

    public void setConteggioBiglietti(int conteggioBiglietti) {
        this.conteggioBiglietti = conteggioBiglietti;
    }

    public int getConteggioAbbonamenti() {
        return conteggioAbbonamenti;
    }

    public void setConteggioAbbonamenti(int conteggioAbbonamenti) {
        this.conteggioAbbonamenti = conteggioAbbonamenti;
    }

    public Map<Integer, Boolean> getBiglietti() {
        return bigliettiVenduti;
    }

    public void setBiglietti(Map<Integer, Boolean> biglietti) {
        this.bigliettiVenduti = biglietti;
    }

    public List<Integer> getAbbonamenti() {
        return abbonamenti;
    }

    public void setAbbonamenti(List<Integer> abbonamenti) {
        this.abbonamenti = abbonamenti;
    }

    //

    public int emettiBiglietto() {
        conteggioBiglietti++;
        bigliettiVenduti.put(conteggioBiglietti, false); // False indica che il biglietto non è stato ancora vidimato
        System.out.println("Biglietto emesso con codice: " + conteggioBiglietti);
        return conteggioBiglietti;
    }

    // public int emettiAbbonamento() {
    //     if (frequenza.equals("SETTIMANALE")) {
    //         conteggioAbbonamenti++;
    //         abbonamenti.add(conteggioAbbonamenti);
    //         System.out.println("Abbonamento settimanale emesso con codice: " + conteggioAbbonamenti);
    //         idAbbonamento = conteggioAbbonamenti;
    //     } else if (frequenza.equals("MENSILE")) {
    //         conteggioAbbonamenti++;
    //         abbonamenti.add(conteggioAbbonamenti);
    //         System.out.println("Abbonamento mensile emesso con codice: " + conteggioAbbonamenti);
    //         idAbbonamento = conteggioAbbonamenti;
    //     } else {
    //         System.out.println("Errore: Tipo di abbonamento non valido.");
    //     }
//
    //     return idAbbonamento;
    // }

    public boolean vidimaBiglietto(int codiceBiglietto) {
        if (bigliettiVenduti.containsKey(codiceBiglietto) && !bigliettiVenduti.get(codiceBiglietto)) {
            bigliettiVenduti.put(codiceBiglietto, true); // Vidima il biglietto
            System.out.println("Biglietto " + codiceBiglietto + " è stato vidimato.");
            return true;
        } else {
            System.out.println("Errore: Biglietto non valido o già vidimato.");
            return false;
        }
    }

    public boolean isBigliettoValido(int codiceBiglietto) {
        return bigliettiVenduti.containsKey(codiceBiglietto) && !bigliettiVenduti.get(codiceBiglietto);
    }

}
