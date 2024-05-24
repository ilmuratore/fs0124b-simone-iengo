package com.Gestione.GestioneDispositivi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Dispositivo {
    @Id
    private Long id;
    @Column
    private String tipo;
    @Column
    private String stato;

    @ManyToOne
    @JoinColumn(name = "username")
    private Dipendente dipendente;

    public Dispositivo(Long id, String tipo, String stato) {
        this.id = id;
        this.tipo = tipo;
        this.stato = stato;
    }

    public Dispositivo() {
    }

}
