package com.example.projetosaplicados.controller;

import com.example.projetosaplicados.domain.Anime;
import com.example.projetosaplicados.service.AnimeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimeController {
    AnimeService animeService;
    @GetMapping("/")
    public String endpoint() {
        return "hello !";
    }
    @GetMapping("/anime")
    public void get_anime_by_user(@PathVariable(name = "email") String email){
        /* @Wllc vou precisar disto. Eu comentei os abaixo,
          pois para o nosso caso não faz sentido buscar animes( a API ANIMELIST ja o faz!).

          **Buscar a lista de animes para o respectivo usuário!...
          Pode ser busca por e-mail, id... importante ser um campo único.
         */
    }

     @PostMapping("/anime")
    public void add_anime_by_user(@PathVariable(name = "email") @RequestBody Anime anime, String email){
        /*
            ADICIONA ANIME PARA USUARIO ESPECÍFICO        
        
        */        

    }

    //  @PutMapping("/anime")
    // public void _anime_by_user(@RequestBody Anime anime){
    //     /*
    //         FAZ SENTIDO EDITAR ANIME?     
    //         *Pode set também _INATIVATE_ (deixar inativo) so sugestão.
    //     */        

    // }

    @DeleteMapping("/anime/{email id_anime}")
    public void doDelete(@PathVariable(name = "email") String email,String id_anime){
        /*
            REMOVE DA LISTA RESPECTIVO ANIME DO USUÁRIO. 

         */
    }

    // @GetMapping("/anime")
    // public void doList(Model model){
    //     List<Anime> animes = animeService.findByDeletedIsNull();
    //     model.addAttribute("animes",animes);

    // }
    // @PostMapping("/anime")
    // public void doSave(@RequestBody Anime anime){
    //     animeService.save(anime);
    // }
    // @PutMapping("/anime")
    // public void doUpdate(@RequestBody Anime anime){
    //     animeService.update(anime);
    // }
    // @DeleteMapping("/anime/{id}")
    // public void doDelete(@PathVariable(name = "id") String id){
    //     Anime anime = animeService.findById(id);
    //     anime.setDeleted(true);
    //     this.animeService.save(anime);
    // }

}
