package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.model.Postazione;
import com.appGestione.GestionePrenotazioni.repository.PostazioneRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ActiveProfiles("test")
public class PostazioneServiceTest {
    @InjectMocks
    private PostazioneService postazioneService;

    @Mock
    private PostazioneRepository postazioneRepository;

    @Test
    public void testCreaPostazione() {
        Postazione postazione = new Postazione();
        postazione.setCodice("P01");
        when(postazioneRepository.save(any(Postazione.class))).thenReturn(postazione);

        Postazione created = postazioneService.creaPostazione(postazione);

        assertEquals(postazione.getCodice(), created.getCodice());
        verify(postazioneRepository, times(1)).save(postazione);
    }

    // testati solo i metodi di create <3 work
}
