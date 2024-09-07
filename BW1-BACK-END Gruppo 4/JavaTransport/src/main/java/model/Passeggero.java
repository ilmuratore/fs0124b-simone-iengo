package model;

import jakarta.persistence.*;

@Entity
@Table
public class Passeggero {
    @Id
    @GeneratedValue
    private int idUtente;
    @OneToOne(mappedBy = "passeggero")
    private Tessera tessera;
    private String nome;
    private String cognome;
    private boolean tesserato; // se true tesserato se false non tesserato
    private boolean abbonamentoValido; // se true abbonamento valido se false abbonamento scaduto

    public Passeggero() {
    }

    public Passeggero(int idUtente, Tessera tessera, String nome, String cognome, boolean tesserato, boolean abbonamentoValido) {
        this.idUtente = idUtente;
        this.tessera = tessera;
        this.nome = nome;
        this.cognome = cognome;
        this.tesserato = tesserato;
        this.abbonamentoValido = abbonamentoValido;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public Tessera getTessera() {
        return tessera;
    }

    public void setTessera(Tessera tessera) {
        this.tessera = tessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public boolean isTesserato() {
        return tesserato;
    }

    public void setTesserato(boolean tesserato) {
        this.tesserato = tesserato;
    }

    public boolean isAbbonamentoValido() {
        return abbonamentoValido;
    }

    public void setAbbonamentoValido(boolean abbonamentoValido) {
        this.abbonamentoValido = abbonamentoValido;
    }
}