package com.example.atricolorecensione.service;

import com.example.atricolorecensione.entity.Recensione;
import com.example.atricolorecensione.repository.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecensioneServiceImpl implements RecensioneService {

    @Autowired
    RecensioneRepository recensioneRepository;

    @Override
    public Recensione findById(Long id) {
        return recensioneRepository.findById(id).get();
    }

    @Override
    public List<Recensione> findAll() {
        return recensioneRepository.findAll();
    }

    @Override
    public void save(Recensione recensione) {
        recensioneRepository.save(recensione);

    }

    @Override
    public void deleteById(Long id) {
        recensioneRepository.deleteById(id);
    }

    @Override
    public void updateRecensione(Recensione recensione, Long id) {
        recensioneRepository.save(recensione);
    }
}
