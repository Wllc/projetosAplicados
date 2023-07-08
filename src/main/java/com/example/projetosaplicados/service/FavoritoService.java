package com.example.projetosaplicados.service;

import com.example.projetosaplicados.domain.Favorito;
import com.example.projetosaplicados.repository.FavoritoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoritoService {
    @Autowired
    FavoritoRepository favoritoRepository;
    public FavoritoService(FavoritoRepository favoritoRepository){
        this.favoritoRepository = favoritoRepository;
    }
    public Favorito create(Favorito favorito){
        return favoritoRepository.save(favorito);
    }
    public Favorito update(Favorito updateFavorito, Long id){
        Optional<Favorito> f = this.favoritoRepository.findById(id);
        if(f.isPresent()){
            Favorito favorito = f.get();
            favorito.setAnime_id(updateFavorito.getAnime_id());
            favorito.setUsuario_id(updateFavorito.getUsuario_id());
            return favoritoRepository.save(favorito);
        }else{
            throw new EntityNotFoundException();
        }
    }
    public List<Favorito> findAll(){
        return favoritoRepository.findAll();
    }

    public Favorito findById(Long id){
        Optional<Favorito> favorito = favoritoRepository.findById(id);
        return favorito.orElse(null);
    }

    public void delete(Favorito favorito) {
        favoritoRepository.delete(favorito);
    }
}
