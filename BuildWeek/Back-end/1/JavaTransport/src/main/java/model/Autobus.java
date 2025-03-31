package model;

import jakarta.persistence.Entity;

@Entity
public class Autobus extends Mezzo {
    // costruttore senza argomenti per hybernate
    public Autobus(){
        // no argomenti
    }


    public Autobus(int id, String targa, String stato, int entrataInServizio) {
        super(id, 40, stato, entrataInServizio);
    }

}
