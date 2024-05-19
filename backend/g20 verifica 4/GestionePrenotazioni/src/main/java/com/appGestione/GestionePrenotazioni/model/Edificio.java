package com.appGestione.GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String indirizzo;
    private String citta;

    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;
}