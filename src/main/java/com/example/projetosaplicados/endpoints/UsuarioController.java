package com.example.projetosaplicados.endpoints;


import com.example.projetosaplicados.domain.Usuario;
import com.example.projetosaplicados.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }
    
    @GetMapping
    public List<Usuario> doList(){
        return service.listAll();
    }
    @GetMapping("{id}")
    public Usuario getById(@PathVariable(name = "id") Long id){
        return service.findById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario doCreate(@RequestBody Usuario usuario){
        return service.create(usuario);
    }
    @PutMapping("{id}")
    public Usuario doUpdate(@RequestBody Usuario usuario, @PathVariable(name = "id") Long id){
        return service.update(usuario, id);
    }
    @DeleteMapping("{id}")
    public void doDelete(@PathVariable(name = "id") Long id){
        Usuario usuario = service.findById(id);
        this.service.delete(usuario);
    }
}
