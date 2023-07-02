package com.example.projetosaplicados.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetosaplicados.domain.Anime;
import com.example.projetosaplicados.domain.Usuario;

@RestController
public class UsuarioEndPoint {


     @PostMapping("/login")
     public void do_login(){
        /*
         * SERA IMPLEMENTADO O LOGIN
         * 
         * 
         */
     }

      @PostMapping("/logon")
     public void do_logon(@RequestBody Usuario usuario){
        /*
         * SERA IMPLEMENTADO O LOGON
         * ONDE SE CADASTRA OS USUARIOS
         * 
         */
     }
}
