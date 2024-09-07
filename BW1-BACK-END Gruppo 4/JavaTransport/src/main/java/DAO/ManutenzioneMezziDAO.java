package dao;

import model.ManutenzioneMezzi;

import java.util.List;

public interface ManutenzioneMezziDAO {
    void save(ManutenzioneMezzi manutenzione);
    ManutenzioneMezzi findById(String id);
    List<ManutenzioneMezzi> findAll();
    void update(ManutenzioneMezzi manutenzione);
    void delete(String id);
}
