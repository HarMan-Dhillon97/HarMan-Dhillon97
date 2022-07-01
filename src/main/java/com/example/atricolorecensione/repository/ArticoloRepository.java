package com.example.atricolorecensione.repository;

import com.example.atricolorecensione.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticoloRepository extends JpaRepository<Articolo, Long> {
}
