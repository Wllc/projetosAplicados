package com.example.projetosaplicados.service;

import com.example.projetosaplicados.domain.Usuario;
import com.example.projetosaplicados.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
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
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Usuario update(Usuario updateUsuario, Long id) {
        Optional<Usuario> u = this.usuarioRepository.findById(id);
        if(u.isPresent()){
            Usuario usuario = u.get();
            usuario.setUsername(updateUsuario.getUsername());
            usuario.setLogin(updateUsuario.getLogin());
            usuario.setPassword(updateUsuario.getPassword());
            usuario.setEmail(updateUsuario.getEmail());
            return usuarioRepository.save(usuario);
        }else{
            throw new EntityNotFoundException();
        }
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

    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null);
    }

    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
}
