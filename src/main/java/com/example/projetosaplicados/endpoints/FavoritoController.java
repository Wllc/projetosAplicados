package com.example.projetosaplicados.endpoints;

import com.example.projetosaplicados.domain.Favorito;
import com.example.projetosaplicados.service.FavoritoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorito")
public class FavoritoController {
    FavoritoService service;

    public FavoritoController(FavoritoService service){
        this.service = service;
    }

    @GetMapping
    public List<Favorito> doList(){
        return service.findAll();
    }
    @GetMapping("{id}")
    public Favorito getById(@PathVariable(name = "id") Long id){
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Favorito doCreate(@RequestBody Favorito favorito){
        return service.create(favorito);
    }

    @PutMapping("{id}")
    public Favorito doUpdate(@RequestBody Favorito favorito, @PathVariable(name = "id") Long id){
        return service.update(favorito, id);
    }
    @DeleteMapping("{id}")
    public void doDelete(@PathVariable(name = "id") Long id){
        Favorito favorito = service.findById(id);
        this.service.delete(favorito);
    }
}
