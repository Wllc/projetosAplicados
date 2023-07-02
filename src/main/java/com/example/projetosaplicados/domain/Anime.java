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

    String url;

    Boolean deleted = false;

    @OneToMany(mappedBy = "animesFavoritos")
    private List<Usuario> userList;

    //  anime esta linkado com usuário ?
    // String email_usuario
}
