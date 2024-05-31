package com.Applicazione.GestioneEventi;

import model.Utente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import repository.UtenteRepository;
import service.UtenteService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UtenteServiceTest {

    @Autowired
    private UtenteService utenteService;

    @MockBean
    private UtenteRepository utenteRepository;

    @Test
    public void testFindUtenteByEmail() {
        Utente utente = new Utente();
        utente.setId(1L);
        utente.setEmail("utente@example.com");

        when(utenteRepository.findByEmail("utente@example.com")).thenReturn(utente);

        Utente foundUtente = utenteService.findUtenteByEmail("utente@example.com");

        assertEquals(1L, foundUtente.getId());
        assertEquals("utente@example.com", foundUtente.getEmail());
    }


}
