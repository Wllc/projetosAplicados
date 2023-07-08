package com.example.projetosaplicados.repository;

import com.example.projetosaplicados.domain.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoRepository extends JpaRepository<Favorito, Long> {
}
