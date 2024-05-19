package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.model.Prenotazione;
import com.appGestione.GestionePrenotazioni.repository.PrenotazioneRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ActiveProfiles("test")
public class PrenotazioneServiceTest {
    @InjectMocks
    private PrenotazioneService prenotazioneService;

    @Mock
    private PrenotazioneRepository prenotazioneRepository;

    @Test
    public void testCreaPrenotazione() {
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setData(LocalDate.now());
        when(prenotazioneRepository.save(any(Prenotazione.class))).thenReturn(prenotazione);

        Prenotazione created = prenotazioneService.creaPrenotazione(prenotazione);

        assertEquals(prenotazione.getData(), created.getData());
        verify(prenotazioneRepository, times(1)).save(prenotazione);
    }

    // testati solo i metodi di create <3 work
}

