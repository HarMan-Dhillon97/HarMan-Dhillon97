package com.example.atricolorecensione.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Recensione {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String testo;

    @ManyToOne
    private Articolo articolo;

}
