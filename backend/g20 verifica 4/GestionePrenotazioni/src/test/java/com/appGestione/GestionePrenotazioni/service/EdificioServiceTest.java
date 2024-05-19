package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.model.Edificio;
import com.appGestione.GestionePrenotazioni.repository.EdificioRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ActiveProfiles("test")
public class EdificioServiceTest {
    @InjectMocks
    private EdificioService edificioService;

    @Mock
    private EdificioRepository edificioRepository;

    @Test
    public void testCreaEdificio() {
        Edificio edificio = new Edificio();
        edificio.setNome("Edificio 1");
        when(edificioRepository.save(any(Edificio.class))).thenReturn(edificio);

        Edificio created = edificioService.creaEdificio(edificio);

        assertEquals(edificio.getNome(), created.getNome());
        verify(edificioRepository, times(1)).save(edificio);
    }

    // testati solo i metodi di create <3 work
}
