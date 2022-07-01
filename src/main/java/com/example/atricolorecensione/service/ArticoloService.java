package com.example.atricolorecensione.service;

import com.example.atricolorecensione.entity.Articolo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticoloService {

    public List<Articolo> findAll( );

    public  void findById(Long id);

    public void deleteById(Long id);

    public void save(Articolo articolo);

    public void updateArticolo(Articolo articolo, Long id);

}
