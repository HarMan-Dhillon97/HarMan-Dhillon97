package com.example.atricolorecensione.repository;

import com.example.atricolorecensione.entity.Recensione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecensioneRepository extends JpaRepository<Recensione,Long> {
}
