package com.appGestione.GestionePrenotazioni.model;



import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Data
@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codice;
    private String descrizione;
    private String tipo;
    private int maxOccupanti;

    @ManyToOne
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;
}

