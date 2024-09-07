package Verifica2;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio {
    @PersistenceContext
    EntityManager em;

    public void aggiungiElemento(Elemento elemento) {
        em.persist(elemento);
    }

    public void rimuoviElemento(String isbn) {
        Elemento elemento = em.find(Elemento.class, isbn);
        if (elemento != null) {
            em.remove(elemento);
        }
    }

    public Elemento ricercaPerIsbn(String isbn) {
        return em.find(Elemento.class, isbn);
    }

    public List<Elemento> ricercaPerAnnoPubblicazione(int anno) {
        return em.createQuery("SELECT e FROM Elemento e WHERE e.annoPubblicazione = :anno", Elemento.class)
                .setParameter("anno", anno)
                .getResultList();
    }

    public List<Libro> ricercaPerAutore(String autore) {
        return em.createQuery("SELECT l FROM Libro l WHERE l.autore = :autore", Libro.class)
                .setParameter("autore", autore)
                .getResultList();
    }

    public List<Elemento> ricercaPerTitolo(String titolo) {
        return em.createQuery("SELECT e FROM Elemento e WHERE e.titolo LIKE :titolo", Elemento.class)
                .setParameter("titolo", "%" + titolo + "%")
                .getResultList();
    }

    public List<Prestito> ricercaPrestitiUtente(String numeroTessera) {
        return em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :numeroTessera", Prestito.class)
                .setParameter("numeroTessera", numeroTessera)
                .getResultList();
    }

    public List<Prestito> ricercaPrestitiScaduti() {
        return em.createQuery("SELECT p FROM Prestito p WHERE p.dataRestituzionePrevista < :oggi AND p.dataRestituzioneEffettiva IS NULL", Prestito.class)
                .setParameter("oggi", LocalDate.now())
                .getResultList();
    }
}
