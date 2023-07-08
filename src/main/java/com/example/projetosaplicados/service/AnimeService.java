package com.example.projetosaplicados.service;

import com.example.projetosaplicados.domain.Anime;
import com.example.projetosaplicados.repository.AnimeRepository;
import jakarta.persistence.EntityNotFoundException;
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
    public Anime create(Anime anime){
        return animeRepository.save(anime);
    }
    public Anime update(Anime updateAnime, Long id){
        Optional<Anime> a = this.animeRepository.findById(id);
        if(a.isPresent()){
            Anime anime = a.get();
            anime.setId_anime(updateAnime.getId_anime());
            anime.setTitle(updateAnime.getTitle());
            return animeRepository.save(anime);
        }else{
            throw new EntityNotFoundException();
        }
    }
    public List<Anime> findAll(){
        return animeRepository.findAll();
    }

    public Anime findById(Long id){
        Optional<Anime> anime = animeRepository.findById(id);
        return anime.orElse(null);
    }
}
