package com.example.atricolorecensione.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Articolo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private double prezzo;

    @OneToMany( mappedBy="articolo")
    private List<Recensione>recensioni;
}
