package com.appGestione.GestionePrenotazioni.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private Postazione postazione;

    private LocalDate data;
}