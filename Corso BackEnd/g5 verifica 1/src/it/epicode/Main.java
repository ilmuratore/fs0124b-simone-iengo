package it.epicode;

import it.epicode.Player.Audio;
import it.epicode.Player.Immagine;
import it.epicode.Player.Video;

public class Main {
    //Test generali di funzionamento di tutte le classi e i vari metodi.
    public static void main(String[] args)
    {
        Video primo  = new Video("primo",30);
        Audio primoaudio  = new Audio("primo-audio",15);
        Immagine primoimmagine  = new Immagine("img.jpeg");

        primo.aumentaVol();
        primo.alzaLuminosita();
        primoimmagine.abbassaLuminosita();



        System.out.println("Esecuzione Audio:");
        primoaudio.play();
        System.out.println("\nEsecuzione Video:");
        primo.play();
        System.out.println("\nVisualizzazione Immagine:");
        primoimmagine.show();



    }
}