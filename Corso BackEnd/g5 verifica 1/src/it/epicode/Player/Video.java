package it.epicode.Player;

public class Video extends Riproducibile implements MetodiVisibili {
    private int luminosita = 5;

    // Costruttore: inizializza titolo e durata
    public Video(String titolo, int durata) {
        this.setTitolo(titolo);
        this.setDurata(durata);
    }

    /* Metodo play(): per ogni "minuto" del video, stampa il titolo seguito da tanti "!" quanto è il volume
       e, in seguito, stampa la luminosità come una serie di "*" */
    @Override
    public void play() {
        for (int i = 0; i < this.getDurata(); i++) {
            System.out.print(this.getTitolo());
            for (int x = 0; x < this.getVolume(); x++) {
                System.out.print("!");
            }
            System.out.println(" - luminosita:");
            for (int e = 0; e < luminosita; e++) {
                System.out.print("*");
            }
            System.out.println(); // Aggiunge una linea vuota per separare l'output dei "minuti"
        }
    }

    /* Aumenta la luminosità di 1, se non raggiunge il limite massimo (100) */
    @Override
    public void alzaLuminosita() {
        if(luminosita < 100) {
            luminosita++;
        } else {
            System.out.println("luminosita al max");
        }
    }

    /* Diminuisce la luminosità di 1, se non è già al minimo (0) */
    @Override
    public void abbassaLuminosita() {
        if(luminosita > 0) {
            luminosita--;
        } else {
            System.out.println("luminosita al min");
        }
    }
}