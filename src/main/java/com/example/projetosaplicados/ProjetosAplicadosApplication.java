package com.example.projetosaplicados;

import com.example.projetosaplicados.domain.Usuario;
import com.example.projetosaplicados.repository.AnimeRepository;
import com.example.projetosaplicados.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
public class ProjetosAplicadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetosAplicadosApplication.class, args);
	}

// 	@Bean
// 	CommandLineRunner commandLineRunner(AnimeRepository animeRepository, UsuarioRepository usuarioRepository, PasswordEncoder encoder){
// 		return args -> {
// //			//Descomente caso vá executar o programa a primeira vez
// //            List<Anime> sapatos = Stream.of(
// //                    new Sapato(1L,null, "sapato1.jpg","Tênis Nike Downshifter 12", "R$ 399,99",42, "Lançamento"),
// //                    new Sapato(2L,null, "sapato2.jpg","Tênis Nike Renew Ride 3", "R$ 246,99",42, "Exclusivo")
// //            ).collect(Collectors.toList());
// //            sapatoRepository.saveAll(sapatos);

// 			List<Usuario> users = Stream.of(
// 					new Usuario(1, "Wallace", "user1",encoder.encode("user1"),"wllc@gmail.com", null),
// 					new Usuario(2, "Nikolaus","user2",  encoder.encode("user2"),"email@gmail.com", null)
// 			).collect(Collectors.toList());
// 			usuarioRepository.saveAll(users);
// 		};
// 	}

}
