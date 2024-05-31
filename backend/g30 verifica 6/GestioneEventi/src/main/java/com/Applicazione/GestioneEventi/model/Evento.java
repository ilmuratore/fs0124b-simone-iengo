package com.Applicazione.GestioneEventi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titolo;
    private String descrizione;
    private Date data;
    private String luogo;
    private int postiDisponibili;


    public Evento() {
    }


    public Evento(Long id, String titolo, String descrizione, Date data, String luogo, int postiDisponibili) {
        this.id = id;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.data = data;
        this.luogo = luogo;
        this.postiDisponibili = postiDisponibili;
    }

}
