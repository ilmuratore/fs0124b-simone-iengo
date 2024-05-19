package com.appGestione.GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Data
@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String nomeCompleto;
    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioni;
}