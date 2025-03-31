package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.model.Utente;
import com.appGestione.GestionePrenotazioni.repository.UtenteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ActiveProfiles("test")
public class UtenteServiceTest {
    @InjectMocks
    private UtenteService utenteService;

    @Mock
    private UtenteRepository utenteRepository;

    @Test
    public void testCreaUtente() {
        Utente utente = new Utente();
        utente.setUsername("utente1");
        when(utenteRepository.save(any(Utente.class))).thenReturn(utente);

        Utente created = utenteService.creaUtente(utente);

        assertEquals(utente.getUsername(), created.getUsername());
        verify(utenteRepository, times(1)).save(utente);
    }

    // testati solo i metodi di create <3 work
}
