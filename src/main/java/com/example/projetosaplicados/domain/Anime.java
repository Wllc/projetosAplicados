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
    int id_anime;

    @Column(nullable = false, unique = true)
    int mal_id;

    @Column(unique = true)
    String title;
    
    Boolean deleted = false;
    @OneToMany(mappedBy = "animesFavoritos")
    private List<Usuario> userList;

}
