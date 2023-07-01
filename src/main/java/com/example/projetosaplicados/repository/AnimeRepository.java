package com.example.projetosaplicados.repository;

import com.example.projetosaplicados.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
    List<Anime> findByDeletedIsNull();
}
