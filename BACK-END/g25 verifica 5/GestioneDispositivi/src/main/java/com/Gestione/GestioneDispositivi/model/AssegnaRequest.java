package com.Gestione.GestioneDispositivi.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AssegnaRequest {
    private String username;
    private Long id;

    public AssegnaRequest(String username, Long id) {
        this.username = username;
        this.id = id;
    }

    public AssegnaRequest() {
    }


}
