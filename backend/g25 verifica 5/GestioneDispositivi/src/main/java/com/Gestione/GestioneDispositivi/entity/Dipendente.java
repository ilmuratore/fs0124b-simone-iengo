package com.Gestione.GestioneDispositivi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Dipendente {
    @Id
    private String username;
    @Column
    private String nome;
    @Column
    private String cognome;
    @Column
    private String email;
    @Column
    private String immagineProfilo;

    @OneToMany(mappedBy = "dipendente")
    private List<Dispositivo> dispositivi;

    public Dipendente(String username, String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.immagineProfilo = immagineProfilo;
    }

    public Dipendente() {
    }


}
