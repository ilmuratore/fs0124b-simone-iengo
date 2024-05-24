package com.Gestione.GestioneDispositivi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
public class Dipendente {
    @Id
    @NotBlank(message = "Il campo username non può essere vuoto")
    private String username;


    @Column
    @NotBlank(message = "Il campo password non può essere vuoto")
    private String password;

    @Column
    @NotBlank(message = "Il campo nome non può essere vuoto")
    private String nome;

    @Column
    @NotBlank(message = "Il campo cognome non può essere vuoto")
    private String cognome;

    @Email(message = "Inserire un indirizzo email valido")
    @NotBlank(message = "Il campo email non può essere vuoto")
    private String email;


    private String immagineProfilo;

    @OneToMany(mappedBy = "dipendente")
    private List<Dispositivo> dispositivi;


}
