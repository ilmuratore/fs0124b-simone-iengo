package it.epicode.Player;

public abstract class Riproducibile extends Media implements MetodiRiproducibili {
    private int durata;
    private int volume = 5;

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    /* Aumenta il volume di 1 unità, se non è già al massimo (100) */
    @Override
    public void aumentaVol() {
        if(volume < 100) {
            volume++;
        } else {
            System.out.println("volume al max");
        }
    }

    /* Diminuisce il volume di 1 unità, se non è già al minimo (0) */
    @Override
    public void riduciVol() {
        if(volume > 0) {
            volume--;
        } else {
            System.out.println("volume al min");
        }
    }
}