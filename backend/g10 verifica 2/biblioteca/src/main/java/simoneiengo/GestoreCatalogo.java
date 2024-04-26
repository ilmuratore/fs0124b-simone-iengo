package simoneiengo;

import java.io.IOException;
import java.util.Scanner;
import java.util.List;

public class GestoreCatalogo {
    private final Catalogo catalogo;
    private final Scanner scanner;

    public GestoreCatalogo() {
        this.catalogo = new Catalogo();
        this.scanner = new Scanner(System.in);
    }

    public void avvia() {
        boolean continua = true;
        while (continua) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi elemento");
            System.out.println("2. Rimuovi elemento");
            System.out.println("3. Cerca per ISBN");
            System.out.println("4. Cerca per anno");
            System.out.println("5. Cerca per autore");
            System.out.println("6. Salva su disco");
            System.out.println("7. Carica da disco");
            System.out.println("8. Esci");
            System.out.println("9. Mostra tutti gli elementi");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // consuma il newline

            switch (scelta) {
                case 1:
                    // Aggiungi elemento
                    System.out.println("Inserisci il tipo di elemento (libro o rivista):");
                    scanner.nextLine();
                    // Qui puoi chiedere all'utente i dettagli del libro o della rivista
                    // e poi creare un nuovo oggetto Libro o Rivista
                    // Infine, aggiungi l'elemento al catalogo
                    break;
                case 2:
                    // Rimuovi elemento
                    System.out.println("Inserisci l'ISBN dell'elemento da rimuovere:");
                    String isbn = scanner.nextLine();
                    catalogo.rimuoviElemento(isbn);
                    break;
                case 3:
                    // Cerca per ISBN
                    System.out.println("Inserisci l'ISBN dell'elemento da cercare:");
                    isbn = scanner.nextLine();
                    ElementoCatalogo elemento = catalogo.cercaPerIsbn(isbn);
                    System.out.println(elemento);
                    break;
                case 4:
                    // Cerca per anno
                    System.out.println("Inserisci l'anno di pubblicazione:");
                    int anno = scanner.nextInt();
                    List<ElementoCatalogo> elementi = catalogo.cercaPerAnno(anno);
                    elementi.forEach(System.out::println);
                    break;
                case 5:
                    // Cerca per autore
                    System.out.println("Inserisci il nome dell'autore:");
                    String autore = scanner.nextLine();
                    List<Libro> libri = catalogo.cercaPerAutore(autore);
                    libri.forEach(System.out::println);
                    break;
                case 6:
                    // Salva su disco
                    System.out.println("Inserisci il nome del file:");
                    String filename = scanner.nextLine();
                    try {
                        catalogo.salvaSuDiscoCSV(filename);
                    } catch (IOException e) {
                        System.out.println("Si e' verificato un errore durante il salvataggio del catalogo su disco");
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    // Carica da disco
                    System.out.println("Inserisci il nome del file:");
                    filename = scanner.nextLine();
                    try {
                        catalogo.caricaDaDiscoCSV(filename);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    continua = false;
                    break;
                case 9:
                    catalogo.mostraTutti();
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");

            }
        }
    }
}