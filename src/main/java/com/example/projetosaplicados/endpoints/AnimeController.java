package com.example.projetosaplicados.endpoints;

import com.example.projetosaplicados.domain.Anime;
import com.example.projetosaplicados.service.AnimeService;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {
    AnimeService service;

    public AnimeController(AnimeService service){
        this.service = service;
    }

    @GetMapping("/home")
    public String homeEndpoint() {
        return "Baeldung !";
    }

    @GetMapping
    public List<Anime> doList(Model model){
        return service.findAll();
    }
    @GetMapping("{id}")
    public Anime getById(@PathVariable(name = "id") Long id){
        return service.findById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Anime doCreate(@RequestBody Anime anime){
        return service.create(anime);
    }
    @PutMapping("{id}")
    public Anime doUpdate(@RequestBody Anime anime,@PathVariable(name = "id") Long id){
        return service.update(anime, id);
    }

}
