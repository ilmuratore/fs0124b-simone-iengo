package Verifica2;

import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Catalogo {
    private final List<Elemento> elementi;

    public Catalogo(){
        this.elementi = new ArrayList<>();
    }

    public List<Elemento> getElementi(){
        return this.elementi;
    };
    // metodi per aggiungere, rimuovere e cercare elementi

    public void aggiungiElemento(Elemento elemento) {
        this.elementi.add(elemento);
    }

    public void rimuoviElemento(String isbn) {
        this.elementi.removeIf(e -> e.getIsbn().equals(isbn));
    }

    public Elemento cercaPerTitolo(String titolo) {
        return this.elementi.stream()
                .filter(e -> e.getTitolo().equals(titolo))
                .findFirst()
                .orElse(null);
    }



    // metodi che salvano e caricano da disco i file CSV "database" , il formato e' nomefile.estensione scelta, altrimenti l'apertura non funziona
    public void salvaSuDisco(String nomeFile) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(nomeFile))) {
            for (Elemento elemento : this.elementi) {
                String[] riga;
                if (elemento instanceof Libro libro) {
                    riga = new String[]{"Libro", libro.getTitolo(), libro.getIsbn(), String.valueOf(libro.getAnnoPubblicazione()), String.valueOf(libro.getNumeroPagine()), libro.getAutore(), libro.getGenere()};
                } else if (elemento instanceof Rivista rivista) {
                    riga = new String[]{"Rivista", rivista.getTitolo(), rivista.getIsbn(), String.valueOf(rivista.getAnnoPubblicazione()), String.valueOf(rivista.getNumeroPagine()), rivista.getPeriodicita()};
                } else {
                    continue;
                }
                writer.writeNext(riga);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void caricaDaDisco(String nomeFile) {
        try (CSVReader reader = new CSVReader(new FileReader(nomeFile))) {
            String[] riga;
            while ((riga = reader.readNext()) != null) {
                if (riga[0].equals("Libro")) {
                    Elemento elemento = new Libro(riga[1], riga[2], Integer.parseInt(riga[3]), Integer.parseInt(riga[4]), riga[5], riga[6]);
                    this.elementi.add(elemento);
                } else if (riga[0].equals("Rivista")) {
                    Elemento elemento = new Rivista(riga[1], riga[2], Integer.parseInt(riga[3]), Integer.parseInt(riga[4]), riga[5]);
                    this.elementi.add(elemento);
                } else {
                    System.out.println("Tipo di elemento sconosciuto: " + riga[0] + ". Questa riga sarà ignorata.");
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

}
