package it.epicode.Player;

public interface MetodiRiproducibili {
    void aumentaVol();
    void riduciVol();
    void play();
}

/*
    Due interface perché ci sono classi che utilizzano
    solo determinati metodi.
     Es. Visibili non serve l'aumento di volume
 */

