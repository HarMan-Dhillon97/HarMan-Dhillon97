package com.example.atricolorecensione.controller;

import com.example.atricolorecensione.entity.Articolo;
import com.example.atricolorecensione.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articolo")
public class ArticoloController {
    @Autowired
    ArticoloService articoloService;

            @GetMapping(value="listaArticoli")
            public List<Articolo> listaArticoli(){


                return articoloService.findAll();
            }
            @PostMapping(value="creaArticolo")
            public String creaArticolo(Articolo articolo){
                articoloService.save(articolo);
                return "articolo salvato";
            }

            @DeleteMapping(value="eliminaArticolo")
            public String eliminaArticolo(Long id){
                articoloService.deleteById(id);
                return "articolo eliminato";
            }

            @PutMapping(value="modificaArticolo")
            public void modificaArticolo(Articolo articolo, Long id){
                articoloService.updateArticolo(articolo,id);

            }

}
