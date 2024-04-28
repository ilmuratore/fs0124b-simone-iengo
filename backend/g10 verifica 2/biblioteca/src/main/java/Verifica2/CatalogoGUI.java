package Verifica2;
// esperimento di prova per implementare una semplice gui con il framework di swing presente in java
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CatalogoGUI extends JFrame{
    private final Catalogo catalogo;
    private final JList<String> listaElementi;

    public CatalogoGUI(){
        this.catalogo = new Catalogo();
        listaElementi = new JList<>();
        add(new JScrollPane(listaElementi));

        setTitle("Gestione Catalogo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creazione dei componenti grafici
        JButton btnAggiungi = new JButton("Aggiungi elemento");
        JButton btnRimuovi = new JButton("Rimuovi elemento");
        JTextField txtRicerca = new JTextField();
        JButton btnRicerca = new JButton("Ricerca");
        JButton btnSalva = new JButton("Salva Catalogo");
        JButton btnCarica = new JButton("Carica Catalogo");

        // Aggiunta dei componenti alla schermata
        setLayout(new FlowLayout());
        add(btnAggiungi);
        add(btnRimuovi);
        add(txtRicerca);
        add(btnRicerca);
        add(btnSalva);
        add(btnCarica);

        // metodi funzionamento bottoni carica e salva su disco <3

        btnSalva.addActionListener(_ -> {
            String nomeFile = JOptionPane.showInputDialog("Inserisci il nome del file in cui salvare il catalogo");
            catalogo.salvaSuDisco(nomeFile);
            aggiornaListaElementi(); // Aggiorna la lista dopo aver salvato il catalogo
        });

        btnCarica.addActionListener(_ -> {
            String nomeFile = JOptionPane.showInputDialog("Inserisci il nome del file da cui caricare il catalogo");
            catalogo.caricaDaDisco(nomeFile);
            aggiornaListaElementi(); // Aggiorna la lista dopo aver caricato il catalogo da disco
        });

        // Aggiunta dei listener ai bottoni che congestion il funzionamento della GUI
        btnAggiungi.addActionListener(_ -> {
            // Mostra un dialogo di input per scegliere il tipo di elemento
            Object[] possibilities = {"Libro", "Rivista"};
            String tipo = (String)JOptionPane.showInputDialog(
                    null,
                    "Scegli il tipo di elemento:",
                    "Aggiungi elemento",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "Libro");

            // Mostra un dialogo di input per ogni attributo comune
            String titolo = JOptionPane.showInputDialog("Inserisci il titolo dell'elemento");
            String isbn = JOptionPane.showInputDialog("Inserisci l'ISBN dell'elemento");
            int annoPubblicazione = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'anno di pubblicazione dell'elemento"));
            int numeroPagine = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero di pagine dell'elemento"));

            Elemento elemento;
            if (tipo.equals("Libro")) {
                // Mostra un dialogo di input per ogni attributo libro
                String autore = JOptionPane.showInputDialog("Inserisci l'autore del libro");
                String genere = JOptionPane.showInputDialog("Inserisci il genere del libro");
                elemento = new Libro(titolo, isbn, annoPubblicazione, numeroPagine, autore, genere);
            } else { // Rivista
                // Mostra un dialogo di input per ogni attributo rivista
                String periodicita = JOptionPane.showInputDialog("Inserisci la periodicità della rivista");
                elemento = new Rivista(titolo, isbn, annoPubblicazione, numeroPagine, periodicita);
            }
            // Aggiungi l'elemento al catalogo e aggiorna la lista
            catalogo.aggiungiElemento(elemento);
            aggiornaListaElementi();
        });

        btnRimuovi.addActionListener(_ -> {
            String isbn = JOptionPane.showInputDialog("Inserisci l'ISBN dell'elemento da rimuovere");
            catalogo.rimuoviElemento(isbn);
            aggiornaListaElementi();
        });

        btnRicerca.addActionListener(_ -> {
            String titolo = JOptionPane.showInputDialog("Inserisci il titolo dell'elemento da cercare");
            Elemento elemento = catalogo.cercaPerTitolo(titolo);
            // Mostra l'elemento trovato all'utente
            JOptionPane.showMessageDialog(null, "Elemento trovato: " + elemento.getTitolo());
        });
    }

    public void aggiornaListaElementi() {
        // Ottieni la lista degli elementi dal catalogo
        List<Elemento> elementi = catalogo.getElementi();
        // Crea un modello per la JList
        DefaultListModel<String> model = new DefaultListModel<>();
        // Aggiungi ogni elemento al modello
        for (Elemento elemento : elementi) {
            if (elemento instanceof Libro libro) {
                String dettagliLibro = libro.getTitolo() + ", " + libro.getIsbn() + ", " + libro.getAnnoPubblicazione() + ", " + libro.getNumeroPagine() + ", " + libro.getAutore() + ", " + libro.getGenere();
                model.addElement(dettagliLibro);
            } else if (elemento instanceof Rivista rivista) {
                String dettagliRivista = rivista.getTitolo() + ", " + rivista.getIsbn() + ", " + rivista.getAnnoPubblicazione() + ", " + rivista.getNumeroPagine() + ", " + rivista.getPeriodicita();
                model.addElement(dettagliRivista);
            }
        }
        listaElementi.setModel(model);
    }

    // Punto di avvio <3
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CatalogoGUI().setVisible(true));
    }
}