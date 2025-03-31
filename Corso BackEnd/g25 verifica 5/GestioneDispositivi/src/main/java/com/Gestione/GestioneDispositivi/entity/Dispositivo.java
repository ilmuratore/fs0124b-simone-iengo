package com.Gestione.GestioneDispositivi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;




@Entity
@Inheritance
@Data
@AllArgsConstructor
public class Dispositivo {
    @Id
    @NotNull(message = "Il campo id non può essere vuoto")
    private Long id;

    @Column
    @NotBlank(message = "Il campo tipo non può essere vuoto")
    private String tipo;

    @Column
    @NotBlank(message = "Il campo stato non può essere vuoto")
    private String stato;

    @ManyToOne
    @JoinColumn(name = "username")
    private Dipendente dipendente;

}
