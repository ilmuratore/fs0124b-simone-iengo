package model;

import java.util.Date;

public class Tram extends Mezzo{
    public Tram(int id, String targa, String stato, int entrataInServizio) {
        super(id, 25, stato, entrataInServizio);
    }
}
