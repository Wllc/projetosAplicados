package com.example.projetosaplicados.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Favorito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_favorito;
    @Column(unique = true, nullable = false)
    private int usuario_id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Anime> animes;

}
