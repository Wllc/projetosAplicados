package com.example.projetosaplicados.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_anime;
    String title;
    String url = "https://api.myanimelist.net/v2/anime/30230?fields=id,title";
    Boolean deleted = false;
    @OneToMany(mappedBy = "animesFavoritos")
    private List<Usuario> userList;

}