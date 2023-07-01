package com.example.projetosaplicados.service;

import com.example.projetosaplicados.domain.Anime;
import com.example.projetosaplicados.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {

    @Autowired
    AnimeRepository animeRepository;
    public AnimeService(AnimeRepository animeRepository){
        this.animeRepository = animeRepository;
    }
    public void save(Anime anime){
        animeRepository.save(anime);
    }
    public void update(Anime anime){
        animeRepository.save(anime);
    }
    public List<Anime> findAll(){
        return animeRepository.findAll();
    }
    public List<Anime> findByDeletedIsNull(){
        return animeRepository.findByDeletedIsNull();
    }

    public Anime findById(String id){
        Optional<Anime> anime = animeRepository.findById(Long.valueOf(id));
        return anime.orElse(null);
    }
}
