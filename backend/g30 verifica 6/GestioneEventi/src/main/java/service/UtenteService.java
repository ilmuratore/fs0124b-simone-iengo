package service;

import model.Utente;
import repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Utente findUtenteByEmail(String email) {
        return utenteRepository.findByEmail(email);
    }

    public void saveUtente(Utente utente) {
        utente.setPassword(bCryptPasswordEncoder.encode(utente.getPassword()));
        utenteRepository.save(utente);
    }

    public Utente save(Utente utente) {
        utente.setPassword(bCryptPasswordEncoder.encode(utente.getPassword()));
        return utenteRepository.save(utente);
    }

    public Utente findByEmailAndPassword(String email, String password) {
        Utente utente = utenteRepository.findByEmail(email);
        if (utente != null && bCryptPasswordEncoder.matches(password, utente.getPassword())) {
            return utente;
        }
        return null;
    }
}
