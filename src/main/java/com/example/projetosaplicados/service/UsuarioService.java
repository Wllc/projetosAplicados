package com.example.projetosaplicados.service;

import com.example.projetosaplicados.domain.Usuario;
import com.example.projetosaplicados.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements UserDetailsService {

    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository repository) {
        this.usuarioRepository = repository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> user = usuarioRepository.findByLogin(username);
        if (user.isPresent()){
            return user.get();
        }else{
            throw new UsernameNotFoundException("Username not found");
        }
    }

    public List<Usuario> listAll(){
        return  usuarioRepository.findAll();
    }
}
