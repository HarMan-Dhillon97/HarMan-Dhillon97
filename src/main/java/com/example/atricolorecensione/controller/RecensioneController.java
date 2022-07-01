package com.example.atricolorecensione.controller;

import com.example.atricolorecensione.entity.Articolo;
import com.example.atricolorecensione.entity.Recensione;
import com.example.atricolorecensione.service.ArticoloService;
import com.example.atricolorecensione.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recensione")
public class RecensioneController {
    @Autowired
    RecensioneService recensioneService;

    @GetMapping(value="listaRecensioni")
    public List<Recensione> listaRecensioni(){


        return recensioneService.findAll();
    }
    @PostMapping(value="creaRecensione")
    public String creaRecensione(Recensione recensione){
        recensioneService.save(recensione);
        return "recensione salvato";
    }

    @DeleteMapping(value="eliminaRecensione")
    public String eliminaRecensione(Long id){
        recensioneService.deleteById(id);
        return "recensione eliminato";
    }

    @PutMapping(value="modificaRecensione")
    public void modificaRecensione(Recensione recensione, Long id){
        recensioneService.updateRecensione(recensione,id);

    }

}
