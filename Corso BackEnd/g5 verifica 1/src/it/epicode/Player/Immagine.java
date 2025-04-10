package it.epicode.Player;

public class Immagine extends Media implements MetodiVisibili {
    private int luminosita = 5;

    public int getLuminosita() {
        return luminosita;
    }

    // Costruttore: inizializza il titolo dell'immagine
    public Immagine(String titolo) {
        this.setTitolo(titolo);
    }

    // Mostra il titolo e la luminosità tramite stampa di "*" per ogni unità di luminosità
    public void show() {
        System.out.print("Ecco il titolo: " + this.getTitolo());
        for (int i = 0; i < this.getLuminosita(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /* Aumenta la luminosità di 1, se non raggiunge 100 */
    @Override
    public void alzaLuminosita() {
        if(luminosita < 100) {
            luminosita++;
        } else {
            System.out.println("luminosita al max");
        }
    }

    /* Diminuisce la luminosità di 1, se non è già a 0 */
    @Override
    public void abbassaLuminosita() {
        if(luminosita > 0) {
            luminosita--;
        } else {
            System.out.println("luminosita al min");
        }
    }
}
