package com.example.projetosaplicados.controller;

import com.example.projetosaplicados.domain.Anime;
import com.example.projetosaplicados.service.AnimeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimeController {
    AnimeService animeService;
    @GetMapping("/home")
    public String homeEndpoint() {
        return "Baeldung !";
    }

    @GetMapping("/anime")
    public void doList(Model model){
        List<Anime> animes = animeService.findByDeletedIsNull();
        model.addAttribute("animes",animes);

    }
    @PostMapping("/anime")
    public void doSave(@RequestBody Anime anime){
        animeService.save(anime);
    }
    @PutMapping("/anime")
    public void doUpdate(@RequestBody Anime anime){
        animeService.update(anime);
    }
    @DeleteMapping("/anime/{id}")
    public void doDelete(@PathVariable(name = "id") String id){
        Anime anime = animeService.findById(id);
        anime.setDeleted(true);
        this.animeService.save(anime);
    }

}
