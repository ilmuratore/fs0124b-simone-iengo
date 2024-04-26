package simoneiengo;

import java.io.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<ElementoCatalogo> catalogo;

    public Catalogo(){
        this.catalogo = new ArrayList<>();
    }

    //mostra tutti gli elementi del file CSV dove sono memorizzati gli elementi libri/rivista
    public void mostraTutti(){
        for(ElementoCatalogo elemento : catalogo){
            System.out.println(elemento);
        }
    }


    //Aggiunta di un'libro o rivista
    public void aggiungiElemento(ElementoCatalogo elemento){
        this.catalogo.add(elemento);
    }

    // Rimozione di un libro o rivista
    public void rimuoviElemento(String isbn){
        this.catalogo = this.catalogo.stream()
                .filter(e -> !e.getIsbn().equals(isbn))
                .collect(Collectors.toList());
    }

    //ricerca per isbn
    public ElementoCatalogo cercaPerIsbn(String isbn){
        return this.catalogo.stream()
                .filter(e -> e.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null); // gestione eccezione, se la ricerca non trova nessun elemento restituisce un null
    }

    //ricerca per anno di pubblicaizone

    public List<ElementoCatalogo> cercaPerAnno(int anno){
        return this.catalogo.stream()
                .filter(e -> e.getAnnoPubblicazione() == anno)
                .collect(Collectors.toList());
    }

    // ricerca per autore ( solo per i libri )
    public List<Libro> cercaPerAutore(String autore){
        return this.catalogo.stream()
                .filter(e -> e instanceof Libro)
                .map(e -> (Libro) e)
                .filter(l -> l.getAutore().equals(autore))
                .collect(Collectors.toList());
    }

    // salvataggio su disco
    public void salvaSuDiscoCSV(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (ElementoCatalogo elemento : catalogo) {
                writer.write(elemento.toCSV());
                writer.newLine();
            }
        }
    }


    // caricamento dal disco
    public void caricaDaDiscoCSV(String filename) throws IOException {
        catalogo.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ElementoCatalogo elemento = ElementoCatalogo.fromCSV(line);
                if (elemento != null) {
                    catalogo.add(elemento);
                }
            }
        }
    }

}
