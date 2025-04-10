package it.epicode.Player;

public class Audio extends Riproducibile {
    // Costruttore: inizializza titolo e durata
    public Audio(String titolo, int durata) {
        this.setTitolo(titolo);
        this.setDurata(durata);
    }

    /* Metodo play(): per ogni "minuto" dell'audio, stampa il titolo seguito da tanti "!" quanto è il volume */
    @Override
    public void play() {
        for (int i = 0; i < this.getDurata(); i++) {
            System.out.print(this.getTitolo());
            for (int j = 0; j < this.getVolume(); j++) {
                System.out.print("!");
            }
            System.out.println(".");
        }
    }
}
