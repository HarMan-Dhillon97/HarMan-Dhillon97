package com.example.atricolorecensione.service;

import com.example.atricolorecensione.entity.Recensione;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RecensioneService {

    public Recensione findById(Long id);
    public List<Recensione> findAll();

    public void save(Recensione recensione);

    public void deleteById(Long id);

    public void updateRecensione(Recensione recensione, Long id);
}
