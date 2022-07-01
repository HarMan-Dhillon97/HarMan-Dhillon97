package com.example.atricolorecensione.service;

import com.example.atricolorecensione.entity.Articolo;
import com.example.atricolorecensione.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticoloServiceImpl implements ArticoloService {

    @Autowired
    ArticoloRepository articoloRepository;

    @Override
    public List<Articolo> findAll() {
        return articoloRepository.findAll();
    }

    @Override
    public void findById(Long id) {
        articoloRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        articoloRepository.deleteById(id);
    }

    @Override
    public void save(Articolo articolo) {
        articoloRepository.save(articolo);
    }

    @Override
    public void updateArticolo(Articolo articolo, Long id) {
        articoloRepository.save(articolo);
    }
}
